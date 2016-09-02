

;Dama tahtasi
(define (damala renk1 renk2 boy)
  (above
   (beside
    (square boy "solid" renk1)
    (square boy "solid" renk2))
   (beside
    (square boy "solid" renk2)
    (square boy "solid"renk1))))
(define (dortle sekil)
  (above
   (beside sekil sekil)
   (beside sekil sekil)))
(define (sekizle sekil)
  (dortle (dortle sekil)))
(sekizle (damala "red" "green" 60))