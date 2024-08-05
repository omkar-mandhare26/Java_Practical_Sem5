package Practice;

class ParentClass {
    int x = 100;

    void display() {
        System.out.println("Fn from Parent Class");
    }
}

class ChildClass extends ParentClass {
    int x = 200;

    void display() {
        System.out.println("Parent Class Variable: " + super.x);
        System.out.println("Child Class Variable: " + x);
    }

    void accessParentClassFn() {
        super.display();
    }
}

public class superuse {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.display();

        obj.accessParentClassFn();
    }
}
