package Les_35;

public class Car {
    private String brand;
    private String model;
    private double engine;
    private int yearOfProduction;

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(String model, int yearOfProduction) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public boolean equals(Car car){
        if(this.model.equals(car.model) && this.yearOfProduction == car.yearOfProduction){
            System.out.println("This cars are identical");
            return true;
        }
        else {
            System.out.println("This cars are different");
            return false;
        }
    }
}
