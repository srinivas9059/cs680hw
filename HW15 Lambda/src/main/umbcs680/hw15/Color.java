package umbcs680.hw15;
import java.util.Objects;

public class Color {
    private int redScale;
    private int greenScale;
    private int blueScale;

    public Color(int redScale, int greenScale, int blueScale) {
        this.redScale = redScale;
        this.greenScale = greenScale;
        this.blueScale = blueScale;
    }

    public int getRedScale() {
        return redScale;
    }

    public int getGreenScale() {
        return greenScale;
    }

    public int getBlueScale() {
        return blueScale;
    }

    public int getRed() {
        return redScale;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Color color = (Color) obj;
        return redScale == color.redScale && greenScale == color.greenScale && blueScale == color.blueScale;
    }

    @Override
    public int hashCode() {
        return Objects.hash(redScale, greenScale, blueScale);
    }

    @Override
    public String toString() {
        return "Color{" +
                "red=" + redScale +
                ", green=" + greenScale +
                ", blue=" + blueScale +
                '}';
    }
}
