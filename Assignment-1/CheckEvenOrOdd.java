import java.util.Scanner;

class CheckEvenOrOdd {
	public static void main(String... aRGS) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println(a + " is Even Number");
		} else {
			System.out.println(a + " is Odd Number");
		}

	}
}