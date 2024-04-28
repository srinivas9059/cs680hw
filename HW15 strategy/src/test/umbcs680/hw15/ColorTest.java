package umbcs680.hw15;
// ColorTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColorTest {
    
    @Test
    void testColorComponents() {
        Color color = new Color(100, 150, 200);
        assertEquals(100, color.getRedScale());
        assertEquals(150, color.getGreenScale());
        assertEquals(200, color.getBlueScale());
    }
}
