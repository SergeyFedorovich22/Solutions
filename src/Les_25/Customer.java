package Les_25;

import java.util.Scanner;

public class Customer {
    private String lastName;
    private String firstName;
    private String birthdayDate;
    private String phoneNumber;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    boolean ifSameNumber(String str, Customer customer){
        return str.equals(phoneNumber);
    }
    void ifSameAddress(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter address for check - ");
        String checkAddress = scanner.nextLine();
        scanner.close();
        System.out.println();
        if(checkAddress.equals(this.address))
            System.out.println("Same address");
        else
            System.out.println("Address does not match");
    }
}
