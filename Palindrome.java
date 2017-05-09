
package algorithms.basics;

public class Palindrome {

	public Boolean isPalindrome(String input) {

		if (input == null) {
			return false;
		}

		int len = input.length();

		for (int i = 0; i < len / 2; i++) {

			if (input.charAt(i) != input.charAt(len - i - 1)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String args[]) {

		Palindrome obj = new Palindrome();
		System.out.println("\n Is The Given String 'GoodBoy' Palindrome: " + obj.isPalindrome("GoodBoy"));
		System.out.println("\n Is The Given String 'madam' Palindrome: " + obj.isPalindrome("madam"));

	}
}