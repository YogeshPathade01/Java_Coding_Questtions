
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a N : ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int k = 0; k < n; k++) {
			for (int i = k + 1; i < n; i++) {
				if (arr[i] == arr[k]) {
					for (int j = i; j < n - 1; j++) {
						arr[j] = arr[j + 1];
					}
					n--;
					i--;

				}
			}
		}
		System.out.println("After Removing Elements :");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}