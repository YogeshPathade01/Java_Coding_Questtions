import java.util.Scanner;

public class CountDigitOfNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int count = 0;

		if(n == 0){
			count++;
		}else{
			while (n > 0) {
				count++;
				n /= 10;
			}
		}

		System.out.println("The Total Digit of Number : " + count);
	}

}
