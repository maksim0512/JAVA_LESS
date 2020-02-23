package hw.hw2;

public class Task4 {

    public static void main(String[] args) {

        int s1 = 150, s2 = 200, s3 = 120;

        /*int max = s1, min = s1;

        if (s2 > max)
            max = s2;
        if (s3 > max)
            max = s3;

        if (s2 < min)
            min = s2;
        if (s3 < min)
            min = s3;*/

        int max = Math.max(Math.max(s1,s2), s3);
        int min = Math.min(Math.min(s1,s2), s3);

        System.out.println("difference: " + (max - min));

    }
}
