import java.util.Iterator;
import java.util.Scanner;

public class MergeTwoArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Array size  : ");
		int fn = sc.nextInt();
		int[] first = new int[fn];
		System.out.println("Enter First Element : ");
		for (int i = 0; i < fn; i++) {
			first[i] = sc.nextInt();
		}
		System.out.println("Enter Second Array size  : ");
		int sn = sc.nextInt();
		int[] second = new int[sn];
		System.out.println("Enter Second Element : ");
		for (int i = 0; i < sn; i++) {
			second[i] = sc.nextInt();
		}

		int[] merged = new int[fn + sn];
		
		System.arraycopy(first, 0, merged, 0, fn);
		System.arraycopy(second, 0, merged, fn, sn);
		
		System.out.println("After Merging Two Arrays : ");
		for (int i : merged) {
			System.out.println(i);
		}

	}
}