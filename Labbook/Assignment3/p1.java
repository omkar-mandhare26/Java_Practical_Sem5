package Labbook.Assignment3;

abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    public int l;
    public int w;

    Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }

    void area() {
        System.out.println("Area of Rectangle: " + l * w);
    }
}

class Triangle extends Shape {
    public int b;
    public int h;

    Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    void area() {
        System.out.println("Area of Triangle: " + 0.5 * (b * h));
    }
}

public class p1 {
    static public void main(String args[]) {
        Rectangle rect = new Rectangle(5, 6);
        Triangle tri = new Triangle(4, 5);

        rect.area();
        tri.area();
    }
}
