

(define (sierpinski size limit)
		  (cond
		    ((<= size limit) (triangle size "solid" "black"))
		    (else
		     (above
		      (sierpinski (/ size 2) limit)
		      (beside
		       (sierpinski (/ size 2) limit)
		       (sierpinski (/ size 2) limit))))))

		(sierpinski 400 10)