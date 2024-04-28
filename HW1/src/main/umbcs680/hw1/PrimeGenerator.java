package umbcs680.hw1;
import java.util.LinkedList;
public class PrimeGenerator {
    protected long from, to;
    protected LinkedList<Long> primes;

    public PrimeGenerator(long from, long to) {
        if (from > to) {
            throw new IllegalArgumentException("Invalid range: from > to");
        }
        this.from = from;
        this.to = to;
        this.primes = new LinkedList<Long>();
    }

    public void generatePrimes() {
        if (from > to) {
            return; // Skip generation if from > to
        }
        for (long num = Math.max(2, from); num <= to; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
    }

    public LinkedList<Long> getPrimes() {
        if (from > to) {
            return new LinkedList<Long>(); // Return empty list if range is invalid
        }
        return primes;
    }

    private boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long from = 1; // Define your range
        long to = 100;
        
        // Create an instance of PrimeGenerator
        PrimeGenerator primeGenerator = new PrimeGenerator(from, to);
        
        // Generate primes within the specified range
        primeGenerator.generatePrimes();
        
        // Retrieve the list of primes
        LinkedList<Long> primes = primeGenerator.getPrimes();
        
        // Print the prime numbers
        System.out.println("Prime numbers between " + from + " and " + to + ":");
        for (long prime : primes) {
            System.out.print(prime + " ");
        }
    }
}
