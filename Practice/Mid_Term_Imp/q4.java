package Practice.Mid_Term_Imp;

class college {
    public int clgId;
    public String clgName;
    public String location;
    public int noOfStudent;

    college(int clgId, String clgName, String location, int noOfStudent) {
        this.clgId = clgId;
        this.clgName = clgName;
        this.location = location;
        this.noOfStudent = noOfStudent;
    }

    void display() {
        System.out.println("College ID: " + clgId);
        System.out.println("College Name: " + clgName);
        System.out.println("College Location: " + location);
        System.out.println("No of students: " + noOfStudent);
    }
}

public class q4 {
    public static void main(String[] args) {
        college c = new college(4148, "BYK", "Clg Rd", 1111);
        c.display();
    }
}
