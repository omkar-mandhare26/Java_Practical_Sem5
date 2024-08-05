package Practice.Mid_Term_Imp;

class student {
    public int id;
    public String name;
    public String address;

    student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("Id" + id);
        System.out.println("name" + name);
        System.out.println("Address" + address);
    }
}

public class tq2 {
    public static void main(String[] args) {
        student obj = new student(6, "kanishka", "chandsi");
        obj.display();
    }
}