import java.util.Scanner;

class AddTwoNum {
	public static void main(String... aRGS) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		System.out.println("Enter second number : ");
		int b = sc.nextInt();

		System.out.println("Sum is : " + (a + b));

	}
}