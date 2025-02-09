public class TestProgram {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        // initial values of both counters
        System.out.println("Initial value of counter1: " + counter1.getCount());
        System.out.println("Initial value of counter2: " + counter2.getCount());

        // clicking
        counter1.click();
        counter1.click();
        counter2.click();

        // values after clicking
        System.out.println("After clicking:");
        System.out.println("Value of counter1: " + counter1.getCount());
        System.out.println("Value of counter2: " + counter2.getCount());

        // reset counters
        counter1.reset();
        counter2.reset();

        // values after resetting
        System.out.println("After resetting:");
        System.out.println("Value of counter1: " + counter1.getCount());
        System.out.println("Value of counter2: " + counter2.getCount());
    }
}
