import java.util.Scanner;

public class CountVowelConsonant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();

		int vowelCount = 0;
		int cosntCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')))
				continue;

			ch = Character.toLowerCase(ch);

			if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e')
				vowelCount++;
			else
				cosntCount++;

		}

		System.out.println("VowelCount : " + vowelCount + "\nConsantCount : " + cosntCount);

	}

}
