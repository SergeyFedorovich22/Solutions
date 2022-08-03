package Les_27;

import java.util.Scanner;

public class Solution_task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QuadraticEquation qE = new QuadraticEquation();
        System.out.print("a = ");
        qE.setA(in.nextInt());
        System.out.print("b = ");
        qE.setB(in.nextInt());
        System.out.print("c = ");
        qE.setC(in.nextInt());
        in.close();

        qE.setDis();
        qE.currentDis();
        qE.calculationOfRoots();
    }
}
