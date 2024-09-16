package CSC273.CSC372_CTA4;

public class ShapeArray {

    public static void main(String[] args) {
        Sphere sphere = new Sphere(2);
        Cylinder cylinder = new Cylinder(1, 2);
        Cone cone = new Cone(2, 3);

        Shape[] shapeArray = new Shape[]{sphere, cylinder, cone};

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString() + "\n");
        }

    }
}
