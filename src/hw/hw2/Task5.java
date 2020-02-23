package hw.hw2;

public class Task5 {

    public static void main(String[] args) {

        int a = 2;
        int n = 10;
        int result = a;

        for (int i = 1; i < n; i++)
            result *= a;

        System.out.println(result);
    }
}
