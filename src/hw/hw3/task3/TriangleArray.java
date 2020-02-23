package hw.hw3.task3;

//import java.util.Arrays;

public class TriangleArray {

  public static void main(String[] args) {

    int n = 5;
    int intStart = 2;

    int[][] triangle = new int[n][];

    for (int i = 1; i <= n; i++)
      triangle[i - 1] = new int[i];

    for (int i = 0; i < triangle.length; i++) {
      for (int j = triangle[i].length - 1; j >= 0; j--) {
        triangle[i][j] = intStart;
        intStart *= 2;
      }
    }

//    System.out.println(Arrays.deepToString(triangle));

    for (int[] a : triangle) {
      for (int i : a)
        System.out.print(i + " ");
      System.out.println();
    }
  }
}
