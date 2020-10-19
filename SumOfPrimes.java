/*
 * The classical Sieve of Eratosthenes algorithm takes O(N log (log N)) time to find all prime numbers less than N.
 * Based on this approach of deleting the multiples of numbers, prime numbers are left behind.
 */

import java.util.Scanner;
public class SumOfPrimes {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		long sum = findSumOfPrimes(n);
		System.out.println(sum);
		s.close();
	}

	private static long findSumOfPrimes(int n) {
		boolean prime[] = new boolean[n+1];
		for(int i=0; i<=n; i++)
			prime[i]=true;
		
    //we check p*p<=n, because the smaller multiples of p are already marked as false
    for(int p=2; p*p<=n; p++) {
			if(prime[p]==true) {
				for(int i=p*2; i<=n; i=i+p)
					prime[i]=false;
			}
		}
		int sum = 0;
		for(int i=2; i<=n; i++) {
			if(prime[i]==true)sum = sum + i;
		}
		return sum;
	}
}
