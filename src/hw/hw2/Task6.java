package hw.hw2;

public class Task6 {

    public static void main(String[] args) {

        int years = 2;

        int proc = 10;

        int startSum = 1000;

        double nalog = 0.01 * startSum;

        double cash = startSum;

        for (int i = 0; i < years; i++) {

            System.out.println(cash);
            cash = cash + cash * proc / 100 - nalog;

        }

        System.out.println(cash);
    }
}
