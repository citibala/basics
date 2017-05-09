


package algorithms.basics;

public class FindingGCD {
	

int getGCD(int num1, int num2)
{
    if (num1 == 0)
        return num2;
    return getGCD(num2%num1, num1);
}
	
	   public static void main(String args[]){
		   FindingGCD obj = new FindingGCD();
	       System.out.println("\nGCD of 45 and 30: "+obj.getGCD(45,30));
	       System.out.println("\nGCD of 18 and 9: "+obj.getGCD(18,9));
	    }

}
