package Labbook.Assignment2;

class Car {
    public String model;
    public int releaseYear;

    Car(String model, int releaseYear) {
        this.model = model;
        this.releaseYear = releaseYear;
    }

    Car(Car obj) {
        this.model = obj.model;
        this.releaseYear = obj.releaseYear;
    }

    public void display() {
        System.out.println("Car Model: " + model);
        System.out.println("Release Year: " + releaseYear);
    }
}

public class a4 {
    static public void main(String args[]) {
        Car car1 = new Car("Porsche 911", 1963);
        car1.display();

        Car car2 = new Car(car1);
        car2.display();
    }
}
