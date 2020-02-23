package hw.hw2;

public class Task2 {

    public static void main(String[] args) {

        int r = 10;

//        double PI = 3.14;


        if (r <= 0)
            System.out.println("Invalid input");
        else {
            double length = 2 * Math.PI * r;
            double square = Math.PI * Math.pow(r, 2);
            System.out.println(length + " " + square);
        }
    }
}
