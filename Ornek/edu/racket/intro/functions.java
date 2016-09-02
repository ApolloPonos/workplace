

(define Pi 3.1418)
;daireninAlani'ni hesaplar
;yaricap:sayi->alan:sayi
(define (daireninAlani yaricap)
  (* Pi yaricap yaricap))
(daireninAlani 10)
define( (halkaninAlani disYaricap icYaricap)
        (- (daireninAlani disYaricap) (daireninAlani icYaricap)))
(halkaninAlani 10 5)
