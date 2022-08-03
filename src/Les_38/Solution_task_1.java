package Les_38;

public class Solution_task_1 {
    public static void main(String[] args) {
        Bird finch = new Finch();
        Bird swallow = new Swallow();

        finch.sitDown();
        finch.takeOff();

        swallow.sitDown();
        swallow.takeOff();
    }
}
