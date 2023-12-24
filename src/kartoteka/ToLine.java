package kartoteka;

import java.util.Arrays;

public class ToLine {

    private int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize() {
        int[] a = new int[100];
        int k = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                a[k] = data[i][j];
                k++;
            }
        }
        int[] b = Arrays.copyOf(a, k);
        return b;

    }
}
