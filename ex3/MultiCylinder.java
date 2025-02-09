public class MultiCylinder {
    public static void main(String[] args) {
        Cylinder cyl1 = new Cylinder(5, 10);  
        Cylinder cyl2 = new Cylinder(3, 7);   
        Cylinder cyl3 = new Cylinder(6, 15);

        // initial cylinder details
        System.out.println("Initial Cylinders:");
        System.out.println(cyl1);
        System.out.println(cyl2);
        System.out.println(cyl3);

        // updating values
        cyl1.setRadius(7);
        cyl2.setHeight(10);

        // printing updated cylinder details
        System.out.println("\nUpdated Cylinders:");
        System.out.println(cyl1);
        System.out.println(cyl2);
    }
}
