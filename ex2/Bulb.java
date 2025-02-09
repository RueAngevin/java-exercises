public class Bulb {
    private boolean isOn; // Stores the state of the bulb (on/off)

    // initialize the bulb
    public Bulb() {
        isOn = false;
    }

    // turn the bulb on
    public void turnOn() {
        isOn = true;
    }

    // turn the bulb off
    public void turnOff() {
        isOn = false;
    }

    // check if the bulb is on
    public boolean isOn() {
        return isOn;
    }
}
