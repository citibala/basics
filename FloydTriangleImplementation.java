

package algorithms.basics;

public class FloydTriangleImplementation {
	
	public static void main(String args[]) {
		int row = 7, number = 1;

	System.out.println();	 
	System.out.println("Floyd's triangle:\n");

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}

			System.out.println();
		}
	}
}
