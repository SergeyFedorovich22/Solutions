package Les_29;

import java.util.Scanner;

public class Solution_task_1 {
    public static void main(String[] args) {
        Order order = new Order();
        order.setName("Nick");
        order.setWeight(15);
        order.setDeliveryAddress("Wall Street");

        Scanner in = new Scanner(System.in);
        Customer customer = new Customer();
        customer.setName("Nick");
        System.out.print("Enter customer address - ");
        customer.setCustomerAddress(in.nextLine());
        in.close();

        customer.compare(order);
    }
}