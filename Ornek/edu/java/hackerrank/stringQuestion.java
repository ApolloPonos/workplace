package edu.java.hackerrank;

public class stringQuestion {


	    static boolean isAnagram(String a, String b) {
	        
	        // Complete the function by writing your code here.
	        
	        a = a.toLowerCase();
	        b = b.toLowerCase();
	        
	        
	        Boolean esitmi = false;
	        
	        if(a.length()== b.length() ){
	            esitmi = true;
	        }
	          
	        //"Ahmet"
	        //"Mehmat"    
	        
	        for(int i=0;i<a.length();i++){
	        
	            char simdiki = a.charAt(i);
	            
	            for(int j=0;j<b.length();j++){
	                
	                char bNinElemani = b.charAt(j);
	                if(simdiki == bNinElemani){
	                    StringBuilder sb = new StringBuilder(b);
	                    sb.deleteCharAt(j);
	                    b = sb.toString();
	                    break;
	                        
	                }
	            }
	            
	                
	        
	        }
	        
	       // System.out.println("B : "+b.length());
	        
	        /* Enter your code here. */
	        
	      
	        
	        if(b.length()==0 && esitmi) {
	            return true;
	        }
	        
	        return false;
	    }
	}


