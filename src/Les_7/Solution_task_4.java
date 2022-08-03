package Les_7;

import java.util.Scanner;

public class Solution_task_4 {
    public static void main(String[] args) {
        int preNumber, number, postNumber;
        String list_numbers = " ";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers:");
        preNumber = in.nextInt();
        number = in.nextInt();
        if (preNumber==0 || number==0){
            System.out.println("No local max");
            System.exit(1);
        }
        postNumber=in.nextInt();
        if (postNumber==0){
            System.out.println("No local max");
            System.exit(1);
        }
        do {
            if(number>preNumber&&number>postNumber)
                list_numbers += number + " ";
            preNumber = number;
            number = postNumber;
            postNumber = in.nextInt();
        }while(postNumber!=0);
        System.out.printf("Local max list:" + list_numbers);
        in.close();
    }
}
