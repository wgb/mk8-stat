(ns mk8-stat.routes
  (:require [compojure.core :refer [defroutes context GET POST]]
            [ring.util.response :refer [response content-type]]
            [mk8-stat.query :as q]))

(defroutes stat-routes
  (context "/driver/:name" [name]
           (context "/kart/:kart" [kart]
                    (GET "/" request (q/best-combinations-by-kart-for-driver name kart)))
           (GET "/stats" request)))

(defroutes health
  (GET "/hc" [] "<h1>Alive</h1>"))

(defroutes all-routes
  stat-routes
  health)
