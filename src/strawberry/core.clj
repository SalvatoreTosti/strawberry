(ns strawberry.core
  (:gen-class)
  (:require [clj-http.client :as client]))

(def issues-resp
  (client/get "https://api.github.com/repos/SalvatoreTosti/harbor/issues" {:as :json}))

(client/get "https://api.github.com/rate_limit")

(->> issues-resp
     ;(milestones)
     ;(open-issues)
     (:body)
     ;(map :title)

     )

(defn milestones
  [resp]
(->> resp
     (:body)
     (map :milestone)))

(defn issue-titles
  [resp]
  (->> resp
       (:body)
       (map :title)))



