; Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal. 
 
(defn plusMinus [arr]
  (let [arr-length (count arr)]
    (println (float (/ (count (filter pos? arr)) arr-length)))
    (println (float (/ (count (filter neg? arr)) arr-length)))
    (println (float (/ (count (filter zero? arr)) arr-length)))))

(plusMinus [-4 3 -9 0 4 1])
