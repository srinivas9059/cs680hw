package umbcs680.hw1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;

public class PrimeGeneratorTest {

    @Test
    public void testGeneratePrimes() {
        PrimeGenerator gen = new PrimeGenerator(1, 10);
        gen.generatePrimes();
        LinkedList<Long> actualPrimes = gen.getPrimes();
        Long[] expectedPrimes = {2L, 3L, 5L, 7L};
        assertIterableEquals(Arrays.asList(expectedPrimes), actualPrimes);
    }

    @Test
    public void testGeneratePrimesNegative() {
        PrimeGenerator gen = new PrimeGenerator(-10, -1);
        gen.generatePrimes();
        LinkedList<Long> primes = gen.getPrimes();
        assertEquals(0, primes.size());
    }

    @Test
    public void testGeneratePrimesPositive() {
        PrimeGenerator gen = new PrimeGenerator(1, 10);
        gen.generatePrimes();
        LinkedList<Long> primes = gen.getPrimes();
        assertEquals(4, primes.size());
    }
}
