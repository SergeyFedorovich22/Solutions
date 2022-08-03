package Les_8;

import java.util.Scanner;

public class Solution_task_2 {
    public static void main(String[] args) {
        double number, temp;
        int pow, temp_pow;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = in.nextDouble();
        System.out.print("Enter pow: ");
        pow = in.nextInt();
        in.close();
        temp = number;
        temp_pow = Math.abs(pow);
        if (pow==0)
            System.out.println(1);
        for (int i = 1; i < temp_pow; i++) {
            number*=temp;
        }
        if(pow>=1)
            System.out.println("Result = " + number);
        else
            System.out.println("Result = " + 1/number);
    }
}
