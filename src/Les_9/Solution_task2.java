package Les_9;

import java.util.Scanner;

public class Solution_task2 {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a = ");
        a = in.nextInt();
        System.out.print("Enter b = ");
        b = in.nextInt();
        in.close();
        System.out.println("x = " + -b/a);
    }
}
