
package algorithms.basics;

public class ReverseNumber {
	 
    public Integer reverse(Integer number){
	
        int reverseNum = 0;
        while(number != 0){
            reverseNum = (reverseNum*10)+(number%10);
            number = number/10;
        }
        return reverseNum;
    }
     
    public static void main(String args[]){
        ReverseNumber obj = new ReverseNumber();
        System.out.println("\nReverse of the Given Number 2017 : "+obj.reverse(new Integer(2017)));
    }
}