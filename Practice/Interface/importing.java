package Practice.Interface;

class abc implements mathsOperations {
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

    void dis() {
        // PI += 1;
        System.out.println(PI);
    }
}

public class importing {
    public static void main(String[] args) {
        abc obj = new abc();
        obj.dis();
    }
}
