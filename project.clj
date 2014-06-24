(defproject mk8-stat "0.1.0-SNAPSHOT"
  :description "All Your Mario Kart 8 Are Belong To Us"
  :url "https://github.com/wgb/mk8-stat"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring "1.3.0"]
                 [compojure "1.1.8"]]
  :ring {:handler mk8-stat.core/
         :init mk8-stat.core/app
         :auto-reload? false?
         :nrepl {:start? true :port 33333}})
