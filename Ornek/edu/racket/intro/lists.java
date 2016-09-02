

(define listem (list 1 2 3 4 5))

(define (son liste)
  (cond
    ((empty? liste ( error "gecersiz"))
     ((empty? (rest liste)) (first liste))
     (else (son (rest liste)))))

 (check-expect (son listem) 5)