

package algorithms.basics;

public class FibonacciSeries {

	public int getFibSeriesNumber(int pos) {

		int fib[] = new int[pos + 1];

		if (pos == 0)
			return 1;
		
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i < pos + 1; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib[pos];
	}

	public static void main(String args[]) {

		FibonacciSeries obj = new FibonacciSeries();
		System.out.println("Fibonacci Series for the First 10 numbers:\n");
		for (int i = 1; i <= 10; i++) {
			System.out.print(obj.getFibSeriesNumber(i - 1) + " ");
		}
	}
}
