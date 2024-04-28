package umbcs680.hw3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    private String[] carToStringArray(Car car) {
        return new String[]{car.getMake(), car.getModel(), String.valueOf(car.getYear())};
    }

    @Test
    public void verifyCarEqualityWithMakeModelYear() {
        String[] expected = {"Toyota", "RAV4", "2018"};
        Car actual = new Car("Toyota", "RAV4", 2018, 0, 0.0f);
        assertArrayEquals(expected, carToStringArray(actual));
    }

    @Test
    public void verifyCarInequalityWithDifferentMake() {
        String[] expected = {"Toyota", "RAV4", "2018"};
        Car actual = new Car("Honda", "RAV4", 2018, 0, 0.0f);
        assertNotEquals(expected, carToStringArray(actual));
    }

    @Test
    public void verifyCarInequalityWithDifferentModel() {
        String[] expected = {"Toyota", "RAV4", "2018"};
        Car actual = new Car("Toyota", "Corolla", 2018, 0, 0.0f);
        assertNotEquals(expected, carToStringArray(actual));
    }

    @Test
    public void verifyCarInequalityWithDifferentYear() {
        String[] expected = {"Toyota", "RAV4", "2018"};
        Car actual = new Car("Toyota", "RAV4", 2019, 0, 0.0f);
        assertNotEquals(expected, carToStringArray(actual));
    }

    
    
}
