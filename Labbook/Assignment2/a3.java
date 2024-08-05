package Labbook.Assignment2;

class Area {
    public double area(int r) {
        return 3.14 * r * r;
    }

    public double area(int b, int h) {
        return 0.5 * (b * h);
    }

    public int area(int w, int l, boolean isRectangle) {
        return l * w;
    }

}

public class a3 {
    static public void main(String args[]) {
        Area obj = new Area();

        int r = 5;
        System.out.println("Area of Circle: " + obj.area(r));

        int b = 4;
        int h = 7;
        System.out.println("Area of Triangle: " + obj.area(b, h));

        int w = 10;
        int l = 3;
        System.out.println("Area of Reactangle: " + obj.area(w, l, true));

    }
}
