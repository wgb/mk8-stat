(ns mk8-stat.core
  (:require [ring.middleware.params :refer [wrap-params]]
            [ring.middleware.keyword-params :refer [wrap-keyword-params]]
            [ring.middleware.content-type :refer [wrap-content-type]]
            [ring.middleware.session :as session]
            [compojure.handler :as handler]
            [mk8-stat.routes :refer :all]))

(defn app []
  (-> (handler/site all-routes)
      (wrap-params)
      (wrap-keyword-params)
      (wrap-content-type)))
