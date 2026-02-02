import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {

			System.out.println("Enter a N: ");
			n = sc.nextInt();

			if (n <= 0) {
				System.out.println("Please enter a positive integer.");
			} else {
				int a = 0, b = 1;
				System.out.print("Fibonacci Series up to " + n + " terms: ");
				for (int i = 1; i <= n; i++) {
					System.out.print(a + " ");
					int next = a + b;
					a = b;
					b = next;
				}
				break;
			}
		}

	}
}
