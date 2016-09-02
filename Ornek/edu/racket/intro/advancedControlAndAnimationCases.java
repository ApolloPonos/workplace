(define (aniCiz durum)

(place-image
 (circle 20 "solid" "green")
 50 (first durum)
 (empty-scene 400 400)))

(define (durumuDegistir durum)
(cond
  ((> (first durum) 400)
   (list(- (first durum) (first (rest durum ))) (- (first (rest durum))) 
(else
        (list (+ (first durum) 1) (first (rest durum)))))

(big-bang (list 1 1)
          (on-draw aniCiz)
          (on-tick durumuDegistir))