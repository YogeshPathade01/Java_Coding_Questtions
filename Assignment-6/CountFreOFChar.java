import java.util.HashMap;
import java.util.Scanner;

class CountFreOfChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.next();

		HashMap<Character, Integer> freq = new HashMap<>();

		for (char ch : str.toCharArray()) {
			if (freq.containsKey(ch)) {
				freq.put(ch, freq.get(ch) + 1);
			} else {
				freq.put(ch, 1);
			}

		}

		for (char ch : freq.keySet()) {
			System.out.println(ch + ": " + freq.get(ch));
		}

	}
}