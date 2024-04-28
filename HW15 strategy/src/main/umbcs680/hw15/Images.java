package umbcs680.hw15;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Images {
    private static final int NUM_THREADS = Runtime.getRuntime().availableProcessors();

    public static Image transform(Image image, ColorAdjuster adjuster) {
        int height = image.getHeight();
        int width = image.getWidth();
        Image adjusted = new Image(height, width);

        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);

        for (int x = 0; x < width; x++) {
            final int column = x;
            executorService.submit(() -> {
                for (int y = 0; y < height; y++) {
                    adjusted.setColor(column, y, adjuster.adjust(image.getColor(column, y)));
                }
            });
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return adjusted;
    }
}
