; Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

; The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

; The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

; If a[i] > b[i], then Alice is awarded 1 point.
; If a[i] < b[i], then Bob is awarded 1 point.
; If a[i] = b[i], then neither person receives a point.
; Comparison points is the total points a person earned.

; Given a and b, determine their respective comparison points. 

(defn compareTriplets [a b]
  (let [cmp (map compare a b)
        alice (count (filter pos? cmp))
        bob (count (filter neg? cmp))]
    (seq [alice bob]))
)

(compareTriplets [5 6 7] [3 6 10])

; (defn compare-the-triplets2 [alice bob]
;   (reduce (fn [scores [al bo]]
;             ; If the condition on the left is true, update either the 0th or 1st score
;             (cond-> scores
;               (> al bo) (update 0 inc)
;               (< al bo) (update 1 inc)))

;           ; Both start with a score of 0
;           [0 0]

;           ; Zip alice and bob together, then reduce over the zipped collection
;           (map vector alice bob)))