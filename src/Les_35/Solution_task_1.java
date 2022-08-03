package Les_35;

public class Solution_task_1 {
    public static void main(String[] args) {
        Car car1 = new Car("A6", 2011);
        car1.setBrand("audi");
        car1.setEngine(2.2);

        Car car2 = new Car("A6", 2019);
        car2.setBrand("audi");
        car2.setEngine(4.0);

        boolean checkCars = car1.equals(car2);
    }
}
