import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a N : ");
		int n = sc.nextInt();
		System.out.println("Enter a search Elemnet : ");
		int search = sc.nextInt();
		boolean flag = true;
		int[] arr = new int[n];
		System.out.println("Enter Elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.println(arr[i] + " Fountd at index: " + i);
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("Not Found !!");

	}

}