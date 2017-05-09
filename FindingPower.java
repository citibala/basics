
package algorithms.basics;

public class FindingPower {

	public long powerOfGivenNumbers(long x, long y) {
		long resultNum;
		if (y == 0) {
			return 1;
		}
		resultNum = powerOfGivenNumbers(x, y / 2);
		if (y % 2 == 0) {
			return resultNum * resultNum;
		} else {
			if (y > 0) {
				return x * resultNum * resultNum;
			} else {
				return (resultNum * resultNum) / x;
			}

		}
	}

	public static void main(String args[]) {
		FindingPower obj = new FindingPower();
		System.out.println("\nPower of 2^3: " + obj.powerOfGivenNumbers(2, 3));
		System.out.println("\nPower of 10^3: " + obj.powerOfGivenNumbers(10, 3));
	}

}
