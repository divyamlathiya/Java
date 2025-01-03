import java.util.*;

class employeeDetails {
    int id;
    String name;
    public void printDetails() {
        System.out.println("My Id Is : " + id);
        System.out.println("My Name Is : " + name);
    }
}

public class pro7 {
    public static void main(String[] args) {
        System.out.println("This Is Our Custom Class!");
        Scanner sc = new Scanner(System.in);
        employeeDetails e1 = new employeeDetails();
        employeeDetails e2 = new employeeDetails();

        // System.out.print("Enter Your Id : ");
        // e1.id = sc.nextInt();
        // System.out.print("Enter Your Name : ");
        // e1.name = sc.nextLine();
        // System.out.print("Enter Your Id : ");
        // e2.id = sc.nextInt();
        // System.out.print("Enter Your Name : ");
        // e2.name = sc.nextLine();
        e1.id = 101;
        e1.name = "krish";
        e2.id = 102;
        e2.name = "Parth";

        e1.printDetails();
        e2.printDetails();
    }
}
