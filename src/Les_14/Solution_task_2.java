package Les_14;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_task_2 {
    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of row - ");
        n = in.nextInt();
        System.out.print("Enter length of column - ");
        m = in.nextInt();
        in.close();
        int[][] matrix = new int [n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = (int) (Math.random()*20);
        System.out.println("Source matrix: ");
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Result matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]*3 + " ");
            }
            System.out.println();
        }
    }
}
