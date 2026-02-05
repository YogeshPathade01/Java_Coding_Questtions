import java.util.Scanner;
public class IsPalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String : ");
		String str = sc.next();

		String reversed = new StringBuilder(str).reverse().toString();

		if(str.equals(reversed))
			System.out.println("Palindrome !!");
		else
			System.out.println("Not Palindrome !!");

	}
}