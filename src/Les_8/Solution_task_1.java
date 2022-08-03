package Les_8;

import java.util.Scanner;

public class Solution_task_1 {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        number  = in.nextInt();
        in.close();
        for (int i = 2; i <= number; i+=2) {
            sum+=i;
        }
        System.out.println("Sum numbers = " + sum);
    }
}
