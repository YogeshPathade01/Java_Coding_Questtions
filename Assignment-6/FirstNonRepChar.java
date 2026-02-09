import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		str = str.toLowerCase();

		Map<Character, Integer> freq = new LinkedHashMap<>();

		for (char c : str.toCharArray()) {
			if (c != ' ') {
				freq.put(c, freq.getOrDefault(c, 0) + 1);
			}
		}

		char firstNonRep = '\0';
		for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
			if (entry.getValue() == 1) {
				firstNonRep = entry.getKey();
				break;
			}
		}

		if (firstNonRep != '\0') {
			System.out.println("First non-repeated character: " + firstNonRep);
		} else {
			System.out.println("No non-repeated character found.");
		}

	}
}
