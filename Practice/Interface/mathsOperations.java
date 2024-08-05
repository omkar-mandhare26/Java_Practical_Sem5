package Practice.Interface;

public interface mathsOperations {
    void sum();

    void sub();

    void mul();

    void div();

    double PI = 3.1415;
    int CONSTANT = 50;
}

class num implements mathsOperations {
    public int n1 = 10;
    public int n2 = 20;

    public void sum() {
        System.out.println(n1 + n2);
    }

    public void sub() {
        System.out.println(n1 - n2);
    }

    public void mul() {
        System.out.println(n1 * n2);
    }

    public void div() {
        System.out.println(n2 / n1);
    }
}

// public class example {
// public static void main(String[] args) {
// num obj = new num();
// obj.sum();
// obj.sub();
// obj.mul();
// obj.div();
// }
// }