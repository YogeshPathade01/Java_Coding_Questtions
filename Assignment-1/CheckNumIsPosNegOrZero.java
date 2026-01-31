import java.util.Scanner;

class CheckNumIsPosNegOrZero {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println(a + " is Positive Number");
		} else if (a < 0) {
			System.out.println(a + " is Negative Number");
		} else {
			System.out.println(a + " is Zero");
		}

	}
}