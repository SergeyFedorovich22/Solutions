package Les_38;

public class Finch implements Bird{
    @Override
    public void sitDown() {
        System.out.println("Finch sat on the ground");
    }
    @Override
    public void takeOff() {
        System.out.println("Finch took off");
    }
}
