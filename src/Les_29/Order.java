package Les_29;

public class Order {
    private double weight;
    private String name;
    private String deliveryAddress;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}
