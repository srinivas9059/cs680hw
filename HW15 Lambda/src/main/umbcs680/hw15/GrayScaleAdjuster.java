package umbcs680.hw15;
public class GrayScaleAdjuster {
    public static Color adjust(Color color) {
        int avg = (color.getRed() + color.getGreenScale() + color.getBlueScale()) / 3;
        return new Color(avg, avg, avg);
    }
}