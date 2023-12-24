package kartoteka;


import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        LimitingRectangle r = new LimitingRectangle(new int[][]{{2, 3}, {4, 8}, {10, 15}});
        System.out.println(r.getWidth() + " " + r.getHeight());
        System.out.println(r.getBorders());

        Separator sep = new Separator(new int[]{1, 2, 4, 6, 7, 9, 9, 11});
        System.out.println(Arrays.toString(sep.even()));
        System.out.println(Arrays.toString(sep.odd()));

        ToTable tab = new ToTable(new int[]{1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] arr = tab.resize();

        ToLine lin = new ToLine(new int[][]{{1, 2}, {3, 4}, {5, 6}});

        int[] arr2 = lin.resize();
        System.out.println(Arrays.toString(arr2));

        System.out.println(psevdo(6));

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        checkWeight(new double[]{0.046, 0.046, 0.048, 0.047, 0.049, 0.048});


        while (true) {
            int number = getUserInput();
            switch (number) {
                case 1, 4, 7:
                    System.out.println("По вашему вопросу обратитесь в окно № 26");
                    break;
                case 2, 3, 5, 6:
                    System.out.println("По вашему вопросу обратитесь в окно № 27");
                    break;
                case 8, 9, 10:
                    System.out.println("По вашему вопросу обратитесь в окно № 28");
                    break;
                default:
                    System.out.println("По вашему вопросу обратитесь в окно № 30");
            }
        }


    }

    static Scanner in = new Scanner(System.in);

    private static int getUserInput() {
        return in.nextInt();
    }

    public static void sayHello(String[] args) {
        if (args.length == 1) {
            String result = (args[0].equals("-u")) ? "Hello, " + System.getProperty("user.name") + "!" : "Hello!";
            System.out.println(result);

        } else System.out.println("Hello!");
    }

//    В качестве решения я использую конструкцию switch case и проверяю длину аргумента args.

    public static void checkWeight(double[] tablets) {
        double weight = 0;
        boolean flaq = true;
        if (tablets != null) {
            for (double tablet : tablets) {
                if (tablet <= 0.045) {
                    System.out.println(tablet);
                    flaq = false;
                }
            }
            if (flaq)
                System.out.println("Ok");
        } else System.out.println("please fill in the array with at least 1 element");
    }

    private static int psevdo(int x) {
        if (x > 1) {
            x = x * psevdo(x - 1);
        }
        return x;
    }
}
