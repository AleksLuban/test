package kartoteka;

public class LimitingRectangle {

    int width;

    int height;

    String borders;

    public LimitingRectangle(int[][] mass) {

        int minX = 10000;
        int minY = 10000;
        int maxX = -10000;
        int maxY = -10000;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i][0] > maxX) maxX = mass[i][0];
            if (mass[i][0] < minX) minX = mass[i][0];
            if (mass[i][1] > maxY) maxY = mass[i][1];
            if (mass[i][1] < minY) minY = mass[i][1];
        }

        width = maxX - minX;
        height = maxY - minY;
        borders = String.valueOf(minY) + ", " + String.valueOf(maxY) + ", " + String.valueOf(minX) + ", " + String.valueOf(maxX);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getBorders() {
        return borders;
    }
}
