package Les_14;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_task_5 {
    public static void main(String[] args) {
        int n, m, line;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of row - ");
        n = in.nextInt();
        System.out.print("Enter length of column - ");
        m = in.nextInt();
        System.out.print("Enter line number of matrix - ");
        line = in.nextInt();
        in.close();
        if (line >= n) {
            System.out.println("Out of range");
            System.exit(1);
        }
        int[][] matrix = new int[n][m];
        int[] temp_arr = new int[m];
        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = (int) (Math.random() * 10);
        System.out.println("Source matrix: ");
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < m; i++)
            temp_arr[i] = matrix[line][i];
        for (int i = m - 1; i >= 0; i--) {
            matrix[line][count] = temp_arr[i];
            count++;
        }
        System.out.println("Result matrix: ");
        System.out.println(Arrays.deepToString(matrix));
    }
}