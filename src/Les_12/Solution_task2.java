package Les_12;

import java.util.Scanner;

public class Solution_task2 {
    public static void main(String[] args) {
        int length;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        length = in.nextInt();
        in.close();
        int[] nums = new int[length];
        int index = nums[0];
        int min = Integer.MAX_VALUE;
        System.out.println("Array of numbers: ");
        for (int i = 0; i < length; i++) {
            nums[i] = (int) (Math.random()*200-100);
            System.out.print(nums[i] + " ");
        }
        for (int i = 0; i < length; i++) {
            if (min>=nums[i]){
                min = nums[i];
                index = i;
            }
        }
        System.out.println();
        System.out.println("Min value: " + min + " index: " + ++index);
    }
}
