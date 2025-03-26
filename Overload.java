import java.util.Scanner;

class Shapes {
    void area(int l, int b) {
        System.out.println("Area of rectangle is " + l * b);
    }

    void area(float r) {
        System.out.println("Area of circle is " + 3.14 * r * r);
    }

    void area(double s) {
        System.out.println("Area of square is " + s * s);
    }
}

class Overload {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        Shapes shapes = new Shapes();

        System.out.println("Enter the length and breadth ");
        int l = in.nextInt();
        int b = in.nextInt();
        shapes.area(l, b);

        System.out.println("Enter the radius ");
        float r = in.nextFloat();
        shapes.area(r);

        System.out.println("Enter the side ");
        double s = in.nextDouble();
        shapes.area(s);
    }
}
