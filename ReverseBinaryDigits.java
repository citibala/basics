package algorithms.basics;

public class ReverseBinaryDigits {
	
	
	public int reverse(int x) {
	    int b = 0;
	    
	    while (x!=0){
	    	  b<<=1;
	    	  b|=( x &1);
	    	  x>>=1;
	    	}
	    return x;
	    
	}
	
	 public static void main(String args[]){
	        ReverseNumber obj = new ReverseNumber();
	        System.out.println("\nBinary Digits of the Given Number 12 : "+Integer.toBinaryString(12));
	        System.out.println("\nReverse of the Given Number 12 : "+Integer.toBinaryString(obj.reverse(12)));
	    }
}