public class Cylinder {
    private double radius;
    private double height;

    // initialize radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // getter for radius
    public double getRadius() {
        return radius;
    }

    // setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // getter for height
    public double getHeight() {
        return height;
    }

    // setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // calculate volume: πr^2h
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // calculate surface area: 2πrh + 2πr^2
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
    }

    // toString method to return a description of the cylinder
    // overriding the default toString method
    // cool stuff
    @Override
    public String toString() {
        return "Cylinder [Radius: " + radius + ", Height: " + height +
               ", Volume: " + String.format("%.2f", getVolume()) +
               ", Surface Area: " + String.format("%.2f", getSurfaceArea()) + "]";
    }
}
