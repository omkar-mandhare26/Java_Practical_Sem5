package Labbook.Assignment2;

import java.util.*;

class product {
    public int pid;
    public String pname;
    public int price;
    static int totalAmt = 0;

    public void getDetails() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        this.pid = input.nextInt();
        input.nextLine();
        System.out.print("Enter Product Name: ");
        pname = input.nextLine();
        System.out.print("Enter Product Price: ");
        price = input.nextInt();

        totalAmt += price;
        // input.close();
    }

    public void displayProduct() {
        System.out.println("Product ID: " + pid);
        System.out.println("Product Name: " + pname);
        System.out.println("Product Price: " + price);
        System.out.println();
    }

    void displayTotalAmt() {
        System.out.println("Total Amount: " + totalAmt);
    }
}

public class b2 {
    public static void main(String[] args) {
        product ps[] = new product[2];

        for (int i = 0; i < 2; i++) {
            ps[i] = new product();
            ps[i].getDetails();
        }

        System.out.println("\nProducts: \n");
        for (int i = 0; i < 2; i++) {
            ps[i].displayProduct();
        }

        ps[0].displayTotalAmt();

    }

}