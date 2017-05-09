
package algorithms.basics;

public class PrimeNumber {
	
	
	boolean isPrimeNumber(int num) {
	 
	    if (num==1 || num%2==0) return false;
	   
	    for(int i=3;i*i<=num;i+=2) {
	        if(num%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static void main(String args[]) {

		PrimeNumber obj = new PrimeNumber();
		System.out.println("Is " + 1 + " Prime Numer? " + obj.isPrimeNumber(1));
		System.out.println("Is " + 20 + " Prime Numer? " + obj.isPrimeNumber(20));
		System.out.println("Is " + 13 + " Prime Numer? " + obj.isPrimeNumber(13));

	}

}
