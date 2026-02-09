import java.util.Scanner;

public class FindSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		
		System.out.print("Enter a substring: ");
		String substr = sc.nextLine();
		
		if(str.contains(substr)) {
			System.out.println("Find !!");
		} else {
			System.out.println("Not Find !!");
		}
	}
}
