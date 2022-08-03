package Les_25;

import java.util.Scanner;

public class Solution_task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Customer person_1 = new Customer();
        System.out.print("Enter first name - ");
        person_1.setFirstName(in.nextLine());
        System.out.print("Enter last name - ");
        person_1.setLastName(in.nextLine());
        System.out.print("Enter birthday date - ");
        person_1.setBirthdayDate(in.nextLine());
        System.out.print("Enter phone number - ");
        person_1.setPhoneNumber(in.nextLine());
        System.out.print("Enter address - ");
        person_1.setAddress(in.nextLine());


        person_1.ifSameAddress();

        in.close();
        /*
        System.out.print("Enter phone number for check - ");
        boolean ifCondition = person_1.ifSameNumber(in.nextLine(), person_1);
        in.close();
        if (ifCondition)
            System.out.println("The numbers are same");
        else
            System.out.println("Don't same");

         */
    }
}
