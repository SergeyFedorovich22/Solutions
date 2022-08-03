package Les_11;

import java.util.Scanner;

public class Solution_task_1 {
    public static void main(String[] args) {
        int length;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        length = in.nextInt();
        int nums[] = new int[length];
        System.out.println("Array of numbers");
        for (int i = 0; i < length; i++) {
            nums[i] = (int) (Math.random()*100);
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("Result: ");
        for (int j = 1; j < length; j++) {
            if (nums[j]>nums[j-1])
                System.out.print(nums[j] + " ");
        }
    }
}
