package Practice;

interface empdetails {
    void display();
}

interface empbank extends empdetails {
    void depositSalary();
}

class emp implements empbank {
    public void display() {
        System.out.println("Hi");
    }

    public void depositSalary() {
        System.out.println("10000");
    }
}

public class interface_inheritance {

}
