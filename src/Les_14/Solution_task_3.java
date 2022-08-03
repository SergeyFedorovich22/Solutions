package Les_14;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_task_3 {
    public static void main(String[] args) {
        int n, line;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of matrix - ");
        n = in.nextInt();
        System.out.print("Enter line number - ");
        line = in.nextInt();
        in.close();
        if (line>=n || n <=1){
            System.out.println("ERROR");
            System.exit(1);
        }
        int[][] matrix = new int [n][n];
        int[] numbers_diagonal = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                if(i==line)
                    numbers_diagonal[j]= matrix[i][j];
            }
        }
        System.out.println("Source matrix: ");
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if(i==j)
                    matrix[i][j] = numbers_diagonal[i];
        System.out.println("Result matrix: ");
        System.out.println(Arrays.deepToString(matrix));
    }
}
