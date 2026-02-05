import java.util.Scanner;

public class ReverseString {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String : ");
		String str = sc.next();
		
		String reversed = new StringBuilder(str).reverse().toString();

		System.out.println("Reversed String : " + reversed);

	}
}