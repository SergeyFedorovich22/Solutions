package Les_14;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_task_4 {
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
        if(line>=n){
            System.out.println("Out of range");
            System.exit(1);
        }
        int[][] matrix = new int [n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = (int) (Math.random()*10);
        System.out.println("Source matrix: ");
        System.out.println(Arrays.deepToString(matrix));
        int count = m-1;
        for (int i = 0; i < m/2; i++) {
            int temp = matrix[line][i];
            matrix[line][i] = matrix[line][count];
            matrix[line][count] = temp;
            count--;
        }
        System.out.println("Result matrix: ");
        System.out.println(Arrays.deepToString(matrix));
    }
}
