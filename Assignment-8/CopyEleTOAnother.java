import java.util.Scanner;

public class CopyEleToAnother {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a N :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] copyArr = new int[n];
		System.out.println("Enter array Elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		System.arraycopy(arr, 0, copyArr, 0, arr.length);
				
		System.out.println("After copy Element : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(copyArr[i]);
		}

	}

}