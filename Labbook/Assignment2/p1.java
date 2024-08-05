package Labbook.Assignment2;

class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class p1 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry", 2020);

        Car car2 = car1;

        System.out.println("Details of car1:");
        car1.displayDetails();

        System.out.println("\nDetails of car2:");
        car2.displayDetails();
    }
}
