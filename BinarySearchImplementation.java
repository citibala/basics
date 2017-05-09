
package algorithms.basics;

public class BinarySearchImplementation
{
 
	static int input[]={1, 2, 3, 4, 10, 40, 80 ,100};
	 
 int binarySearch(int x)
 {
     int left = 0, right = input.length - 1;
     while (left <= right)
     {
         int middle = left + (right-left)/2;

         if (input[middle] == x)
             return middle;
         
         if (input[middle] < x)
        	 left = middle + 1;
         else
        	 right = middle - left;
     }

     return -1;
 }
 public static void main(String args[])
 {
	 BinarySearchImplementation obj = new BinarySearchImplementation();
     int retVal = obj.binarySearch(80);
     
     if (retVal == -1)
         System.out.println("Element is  not present");
     else
         System.out.println("Element is found at index: "+retVal);
 }
}