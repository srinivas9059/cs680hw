package umbcs680.hw15;
// GrayScaleAdjusterTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GrayScaleAdjusterTest {
    
    @Test
    void testAdjust() {
        GrayScaleAdjuster adjuster = new GrayScaleAdjuster();
        Color color = new Color(100, 150, 200);
        Color adjustedColor = adjuster.adjust(color);
        int expectedAvg = (100 + 150 + 200) / 3;
        assertEquals(expectedAvg, adjustedColor.getRedScale());
        assertEquals(expectedAvg, adjustedColor.getGreenScale());
        assertEquals(expectedAvg, adjustedColor.getBlueScale());
    }
}
 