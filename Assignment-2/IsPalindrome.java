import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a N:");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}

		if (temp == rev)
			System.out.println("Given Number is Palindrome !!");
		else
			System.out.println("Not Palindrome !!");

	}
}
