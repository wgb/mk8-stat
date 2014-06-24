(ns mk8-stat.query
  (:require [mk8-stat.stats :refer :all]))

(defn get-driver-stats
  [driver]
  (let [driver-key (keyword driver)
        driver-class (driver-key player-classes)]
    (get-in class-stats driver-class)))

(defn apply-modifier
  [base-val modifier]
  ((first modifier) base-val (second modifier)))

(defn apply-modifiers
  [base modifier]
  (into {} (map (fn [[k v]]
                  (if (map? v)
                    {k (into {} (apply-modifiers v (k modifier)))}
                    {k (apply-modifier v (k modifier))})) base)))

(defn get-total
  [stats]
  (reduce-kv (fn [total k v]
               (if (map? v)
                 (+ total (get-total v))
                 (+ total v))) 0 stats))

(defn all-build-combinations-by-driver
  [driver]
  (let [all-karts (keys kart-stat-modifiers)
        all-tires (keys tire-stat-modifiers)
        all-gliders (keys glider-stat-modifiers)
        driver-stats (get-driver-stats driver)]
    (->> (map (fn [kart]
               (let [kart-stats (kart kart-stat-modifiers)]
                 [[kart] (apply-modifiers driver-stats kart-stats)])) all-karts)
         (mapcat (fn [applied-kart-stats]
                (map (fn [tire]
                       (let [tire-stats (tire tire-stat-modifiers)
                             kart-tire-v (conj (first applied-kart-stats) tire)
                             kart-stats (last applied-kart-stats)]
                         [kart-tire-v (apply-modifiers kart-stats tire-stats)]))
                     all-tires)))
         (mapcat (fn [applied-kart-tire-stats]
                (map (fn [glider]
                       (let [glider-stats (glider glider-stat-modifiers)
                             kart-tire-glider-v (conj (first applied-kart-tire-stats) glider)
                             kart-tire-stats (last applied-kart-tire-stats)]
                         [kart-tire-glider-v (apply-modifiers kart-tire-stats glider-stats)]))
                     all-gliders)))
         (map (fn [stats]
                (let [build-path (first stats)
                      total-stats (last stats)]
                  {:kart (first build-path)
                   :tires (second build-path)
                   :glider (last build-path)
                   :stats total-stats
                   :total (get-total total-stats)}))))))

(defn best-combinations-by-stat-for-driver
  [driver stat]
  (let [all-combos (all-build-combinations-by-driver driver)]
    (when (get-in (first all-combos) stat)
      (->> (sort-by #(get-in % stat) > all-combos)
           (take 30)))))

(defn best-combinations-by-kart-for-driver
  [driver kart]
  (let [all-combos (all-build-combinations-by-driver driver)
        kkart (keyword kart)]
    (->> (filter (fn [c] (= kkart (:kart c))) all-combos)
         (sort-by :total >)
         (take 30))))
