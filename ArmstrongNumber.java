
package algorithms.basics;

public class ArmstrongNumber {

	public boolean isArmstrongNum(int number){
		
		int tempNumber = number;
		int digitsCount= String.valueOf(number).length();
		int sum = 0;
		int div = 0; 
		while(tempNumber > 0) 
		{ 
			div = tempNumber % 10; 
			int temp = 1;
			for(int i=0;i<digitsCount;i++){
				temp = temp*div;
			}
			sum =sum + temp;
			tempNumber = tempNumber/10; 
		} 
		if(number == sum) {
			return true; 
		} else {
			return false; 
		} 
	}
	
	public static void main(String a[]){
		ArmstrongNumber obj = new ArmstrongNumber();
		
		System.out.println("\n Is Given Number 153 Armstrong number? "+obj.isArmstrongNum(153));
		System.out.println(" Is Given Number 431 Armstrong number? "+obj.isArmstrongNum(523));
		
	}
}
