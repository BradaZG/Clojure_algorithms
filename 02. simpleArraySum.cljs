; Given an array of integers, find the sum of its elements.

(defn simpleArraySum [ar]
  (reduce + ar)
  )

(simpleArraySum [1 4 5 2])