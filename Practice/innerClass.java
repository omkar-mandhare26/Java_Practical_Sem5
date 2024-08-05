package Practice;

class outer {
    int x = 5;

    class inner {
        int y = 5;

        void display() {
            System.out.println("Variable Value from Inner Class: " + y);
        }
    }

    inner innerObj = new inner();

    void display() {

    }
}

public class innerClass {
    public static void main(String[] args) {

    }
}