

(define (faktoriyel n)
		   (cond
		    ((not (integer? n)) (error "tamsayi degil"))
		    ((< n 0)(error "eksi sayilarin faktoriyeli olmaz"))
		    ((and (>= n 0) (<= n 0) (<= n 1)) 1)
		    (else (* n (faktoriyel (- n 1)))))
		(faktoriyel 30)
		(check-expect (faktoriyel 1) 1)
		(check-expect (faktoriyel 3) 6)
		(check-expect (faktoriyel -1) (error "eksi sayilarin faktoriyeli olmaz")
		(faktoriyel 2.5)
		                      