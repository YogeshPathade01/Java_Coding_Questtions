import java.util.Iterator;
import java.util.Scanner;

class CountWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Sentence : ");
		String sen = sc.nextLine();

		String[] strArr = sen.split("\\s+");

		System.out.println("CountWord : " + strArr.length);

	}
}