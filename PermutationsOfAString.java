
package algorithms.basics;

import java.util.Arrays;

public class PermutationsOfAString {
	
	static char[] input=new String("abc").toCharArray();

	public void permutation(int left, int size) {
		int x;
		
		if (left == size) {
			System.out.print(Arrays.toString(input));
			System.out.println();
		} else {
			for (x = left; x < size; x++) {
				swap(left, x);
				permutation(left + 1, size);
				swap(left, x);
			}
		}
	}

	public void swap(int i, int j) {
		char temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}

	public static void main(String[] args) {

		PermutationsOfAString obj = new PermutationsOfAString();
		System.out.println("Permutations of a String:"+"\n");
		obj.permutation( 0, input.length);
	}
}