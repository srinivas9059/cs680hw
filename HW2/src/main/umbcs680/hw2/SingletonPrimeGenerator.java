package umbcs680.hw2;
import java.util.LinkedList;

public class SingletonPrimeGenerator {
    private static SingletonPrimeGenerator instance;
    private long from, to;
    private LinkedList<Long> primes;

    private SingletonPrimeGenerator(long from, long to) {
        if (from > to) {
            throw new IllegalArgumentException("Invalid range: from > to");
        }
        this.from = from;
        this.to = to;
        this.primes = new LinkedList<Long>();
        generatePrimes(); // Call generatePrimes() here to generate primes upon instantiation
    }

    // Lazy initialization with synchronized block for thread safety
    public static SingletonPrimeGenerator getInstance(long from, long to) {
        if (from > to) {
            throw new IllegalArgumentException("Invalid range: from > to");
        }
        if (instance == null) {
            synchronized (SingletonPrimeGenerator.class) {
                if (instance == null) {
                    instance = new SingletonPrimeGenerator(from, to);
                }
            }
        }
        return instance;
    }
    

    public LinkedList<Long> getPrimes() {
        if (from > to) {
            return new LinkedList<Long>();
        }
        return primes;
    }

    void generatePrimes() {
        if (from > to) {
            return;
        }
        for (long num = Math.max(2, from); num <= to; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
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
}
