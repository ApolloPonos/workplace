

(define (arada x y z)
		  (cond
		    ((< y z) (and (>= x y) (<= x z)))
		    (else (arada x z y))))

		(arada 3 2 4)
		(arada 2 3 4)