public class Display1to100PrimeNum {
	public static void main(String... a) {

        	System.out.println("Prime Numbers 1 to 100:");

        	for (int n = 2; n <= 100; n++) {
            		if (n == 2 || n == 3) {
                		System.out.println(n);
                		continue;
            		}

            		if (n % 2 == 0 || n % 3 == 0) {
                		continue;
            		}

            		boolean isPrime = true;

            		for (int i = 5; i <= Math.sqrt(n); i += 6) {
                		if (n % i == 0 || n % (i + 2) == 0) {
                    			isPrime = false;
                    			break;
                		}
            		}

            	if (isPrime) {
                	System.out.println(n);
            	}
        }
    }
}
