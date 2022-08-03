package Les_38;

public class Swallow implements Bird{
    @Override
    public void sitDown() {
        System.out.println("Swallow sat on the ground");
    }

    @Override
    public void takeOff() {
        System.out.println("The swallow took off");
    }
}
