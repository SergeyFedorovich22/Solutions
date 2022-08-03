package Les_29;

public class Customer {
    String name;
    String customerAddress;

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void compare(Order order){
        String customerAddressToCompare = customerAddress.toLowerCase();
        String orderAddressToCompare = order.getDeliveryAddress().toLowerCase();

        if(customerAddressToCompare.equals(orderAddressToCompare))
            System.out.println("Address is the same");
        else
            System.out.println("Address is not the same");
    }
}
