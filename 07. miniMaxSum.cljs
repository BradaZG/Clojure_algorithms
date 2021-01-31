; Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

(defn miniMaxSum [arr]
  (let [arr-sort (into [] (sort arr))
        min-arr (pop arr-sort)
        max-arr (pop (into [] (rseq arr-sort)))]
    (println (reduce + min-arr) (reduce + max-arr))))

(miniMaxSum [1 3 5 7 9])