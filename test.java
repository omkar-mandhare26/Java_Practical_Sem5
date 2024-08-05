interface operation {
    int sum(int a, int b);

    // int sub(int a, int b);

    // int mul(int a, int b);
}

class num implements operation {
    public int sum(int a, int b) {
        return a + b;
    }
}

public class test {
    public static void main(String[] args) {
        num n = new num();
        System.out.println(n.sum(5, 5));
    }
}