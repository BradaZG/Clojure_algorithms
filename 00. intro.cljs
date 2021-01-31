; JavaScript Problem-Solving Pattern

; 1. Given a series of numbers, use FOR to iterate.
; 2. Given the need for remainders, use % in each iteration.
; 3. Given conditions for the remainders, use SWITCH.
; 4. Given JavaScript, never ever use SWITCH.
; 5. Given conditions, use IF ELSE IF ELSE.

; ClojureScript Problem-Solving Pattern

; 1. Given the requirement to print lines, focus on side-effects.
; 2. Given side-effects using a sequence, use DOSEQ and RANGE
; 3. Given a pattern of conditions, use CASE, COND, or CONDP.
; 4. Given a pattern, identify abstractions.
; 5. Given a pattern of checking for remainders of zero, use CONDP, =, 0, and MOD. 


; ClojureScript: FizzBuzz

; (doseq [n (range 1 101)]
;   (println
;    (condp = 0
;      (mod n 15) "FizzBuzz"
;      (mod n 3) "Fizz"
;      (mod n 5) "Buzz"
;      n)))

; (doseq [n (range 1 101)]
;   (println
;    (match [(mod n 3) (mod n 5)]    ;; The pattern of remainders: n/3 and n/5
;      [0 0] "FizzBuzz"              ;; If both remainders are 0
;      [0 _] "Fizz"                  ;; If the first remainder is 0
;      [_ 0] "Buzz"                  ;; If the second remainder is 0
;      :else n)))
