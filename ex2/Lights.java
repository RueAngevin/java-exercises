public class Lights {
    public static void main(String[] args) {
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();
        Bulb bulb3 = new Bulb();

        // turn on some bulbs
        bulb1.turnOn();
        bulb2.turnOn();

        // print the state of each bulb
        System.out.println("Bulb 1 is " + (bulb1.isOn() ? "ON" : "OFF"));
        System.out.println("Bulb 2 is " + (bulb2.isOn() ? "ON" : "OFF"));
        System.out.println("Bulb 3 is " + (bulb3.isOn() ? "ON" : "OFF"));

        // turn off a bulb
        bulb1.turnOff();
        System.out.println("After turning off Bulb 1:");
        System.out.println("Bulb 1 is " + (bulb1.isOn() ? "ON" : "OFF"));
    }
}
