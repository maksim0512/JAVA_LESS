package hw.hw2;

public class Task3 {

    public static void main(String[] args) {

        int t = 21;
        String result;

        if (t < 10)
            result = "Tulup";
        else if (t < 15)
            result = "Kurtka";
        else if (t < 20)
            result = "Rubashka";
        else
            result = "Maika";

        System.out.println(result);
    }
}
