package Slips;

public class s11a {
    public static void main(String[] args) {
        String op = args[1];
        operations obj = new operations(45, 78);
        switch (op) {
            case "add":
                obj.addition();
                break;
            case "sub":
                obj.subtraction();
                break;
            case "mul":
                obj.mul();
                break;
            case "div":
                obj.division();
                break;

            default:
                System.out.println("Invalid");
                break;
        }
    }
}

class operations {
    public int n1;
    public int n2;

    operations(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    void addition() {
        System.out.println("Addition: " + (n1 + n2));
    }

    void subtraction() {
        System.out.println("Subtraction: " + (n1 - n2));
    }

    void mul() {
        System.out.println("Multiplication: " + (n1 * n2));
    }

    void division() {
        try {
            System.out.println("Division: " + (n1 / n2));

        } catch (Exception e) {
            System.out.println("Error Occurred");
        }
    }
}