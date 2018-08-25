package pl.coderstrust.sieve;


/**
 * Created by Adam on 2018-03-02.
 */
public class SieveOfEratosthenes {

    public static void main(String args[]) {
        int n = 120;
        System.out.print("This is the range of numbers " + n);
        System.out.println(" ");
        System.out.println("Prime numbers in the range: ");
        SieveOfEratosthenes sieve = new SieveOfEratosthenes();
        int[] primeNumbers = sieve.sieveOfEratosthenes(n);
        for (int p : primeNumbers) {
            System.out.print(p + " ");
        }
    }

    public static int[] sieveOfEratosthenes(int n) {
        int prime[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prime[i] = i;
        }
        for (int first = 2; first * first <= n; first++) {
            if (prime[first] > 0) {
                for (int i = first * 2; i <= n; i += first)
                    prime[i] = 0;
            }
        }
        int numberPrimes = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] > 0) {
                numberPrimes++;
            }
        }
        int[] primes = new int[numberPrimes];
        int j = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] > 0) {
                // System.out.print(i + " ");
                primes[j++] = i;
            }
        }
        return primes;
    }
}


