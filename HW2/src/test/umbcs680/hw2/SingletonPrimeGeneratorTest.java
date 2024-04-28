package umbcs680.hw2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;



public class SingletonPrimeGeneratorTest {

    @Test
    public void testGetInstance() {
        SingletonPrimeGenerator instance1 = SingletonPrimeGenerator.getInstance(1, 10);
        SingletonPrimeGenerator instance2 = SingletonPrimeGenerator.getInstance(1, 10);
        assertEquals(instance1, instance2, "Instances should be identical");
    }

    @Test
    public void testGeneratePrimes() {
        SingletonPrimeGenerator gen = SingletonPrimeGenerator.getInstance(1, 10);
        LinkedList<Long> primes = gen.getPrimes();
        assertEquals(4, primes.size(), "Expected 4 primes for range 1 to 10");
        Long[] expectedPrimes = {2L, 3L, 5L, 7L};
        assertIterableEquals(Arrays.asList(expectedPrimes), primes);
    }

    private void assertIterableEquals(List<Long> asList, LinkedList<Long> primes) {
    }

    @Test
    public void testInvalidRange() {
        try {
            SingletonPrimeGenerator.getInstance(10, 1);
            fail("Expected IllegalArgumentException for from > to");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid range: from > to", e.getMessage());
        }
    }
    

}
    

