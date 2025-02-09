public class Counter {
    private int counter;

    // initialize the counter
    public Counter() {
        counter = 0;
    }

    // increment the counter
    public void click() {
        counter++;
    }

    // get the current counter value
    public int getCount() {
        return counter;
    }

    // reset the counter
    public void reset() {
        counter = 0;
    }
}
