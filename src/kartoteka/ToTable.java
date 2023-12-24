package kartoteka;

public class ToTable {

    private int[] data;
    private int x;

    private int y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize() {
        int k = 0;
        int[][] a = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                a[i][j] = data[k];
                k++;
            }
        }
        return a;
    }
}
