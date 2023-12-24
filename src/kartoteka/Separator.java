package kartoteka;

public class Separator {

    private int array[];

    public Separator(int[] array) {
        this.array = array;
    }

    public int[] even() {
        int shet = 0;
        int[] a = new int[array.length];
        for (int i=0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                a[i] = array[i];
                shet++;
            }
        }

        int[] b = new int[shet];
        int shet2 = 0;
        for (int i=0; i < a.length; i++) {
            if (a[i] != 0) {
                b[shet2] = a[i];
                shet2++;
            }
        }
        return  b;
    }

    public int[] odd() {
        int shet = 0;
        int[] a = new int[array.length];
        for (int i=0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                a[i] = array[i];
                shet++;
            }
        }

        int[] b = new int[shet];
        int shet2 = 0;
        for (int i=0; i < a.length; i++) {
            if (a[i] != 0) {
                b[shet2] = a[i];
                shet2++;
            }
        }
        return  b;
    }
}
