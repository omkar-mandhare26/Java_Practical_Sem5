package Practice.Mid_Term_Imp;

class math {
    public int n1;
    public int n2;

    math(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void add() {
        System.out.println("Addition: " + (n1 + n2));
    }

    public void sub() {
        System.out.println("Addition: " + (n1 - n2));
    }

    public void mul() {
        System.out.println("Addition: " + (n1 * n2));
    }

    public void div() {
        System.out.println("Addition: " + (n1 / n2));
    }

    public void mod() {
        System.out.println("Addition: " + (n1 % n2));
    }
}

public class q3 {
    public static void main(String[] args) {
        math obj = new math(30, 6);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.mod();
    }
}
