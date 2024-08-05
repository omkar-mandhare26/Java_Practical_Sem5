package Practice;

interface op {
    void sum();

    void sub();

    void mul();
}

abstract class number implements op {
    public void sum() {
        System.out.println(5 + 5);
    }

    public void sub() {
        System.out.println(5 - 5);
    }

}

public class interfaceEx {

    public static void main(String[] args) {
        number obj = new number() {
            public void mul() {
                System.out.println(5 * 5);
            }
        };

        obj.sub();
    }
}