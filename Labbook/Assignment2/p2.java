package Labbook.Assignment2;

class countOjb {
    static int count = 0;

    countOjb() {
        count++;
    }

    void displayCount() {
        System.out.println("Object Created: " + count);
    }
}

public class p2 {
    static public void main(String args[]) {
        countOjb obj1 = new countOjb();
        obj1.displayCount();
        countOjb obj2 = new countOjb();
        obj2.displayCount();
        countOjb obj3 = new countOjb();
        obj3.displayCount();
    }
}
