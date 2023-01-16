import java.util.Scanner;
class calvolume{

    final double PI = 3.14;

    double getVolume(double side) {

        return side * side * side;
    }

    double getVolume(double radius, double height) {

        return PI * radius * radius * height;
    }

    double getVolume(double length, double width, double height) {

        return length * width * height;
    }

    public static void main(String[] args) {
        calvolume cv = new calvolume();

        double cubeVolume = cv.getVolume(8);
        double cylinderVolume = cv.getVolume(8, 17);
        double cuboidVolume = cv.getVolume(8, 17, 18);

        System.out.println("Cube volume: " + cubeVolume);
        System.out.println("Cylinder volume: " + cylinderVolume);
        System.out.println("Cuboid volume: " + cuboidVolume);
    }
}
