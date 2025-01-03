import java.util.*;

// Question 1
class Employee {
    int salary;
    String name;

    public int getsalary() {
        return salary;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }
}

public class pro8 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setname("Rajat Gupta");
        e1.salary = 12000;
        System.out.println("Name Of Employee : " + e1.getname());
        System.out.println("Salary Of Employee : " + e1.getsalary());

    }
    
}


//Question 2
class cellphone {
    public void ringing() {
        System.out.println("Ringing...");
    }

    public void vibrating() {
        System.out.println("Vibrates...");
    }

    public void callfriend() {
        System.out.println("Calling Frd...");
    }

    public static void main(String[] args) {
        cellphone phone = new cellphone();
        phone.callfriend();
        phone.vibrating();
        phone.ringing();
        
    }
}


//Question 3
class square {
    int side;

    public int calculatingarea() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        square sq = new square();
        System.out.print("Enter Side : ");
        sq.side = sc.nextInt();
        System.out.println("Area Of Side Is : " + sq.calculatingarea());
        System.out.println("Perimeter Of Side Is : " + sq.perimeter());
    }
}


//Question 4
class rectangle {
    int side;
    int l;
    int w;
    int p;

    public int calculatingarea() {
        return side = l * w;
    }

    public int perimeter() {
        return p = 2 * (l+w);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle rc = new rectangle();
        System.out.print("Enter l : ");
        rc.l = sc.nextInt();
        System.out.print("Enter w : ");
        rc.w = sc.nextInt();
        
        System.out.println("Area Of Rectangle Is : " + rc.calculatingarea());
        System.out.print("Perimeter Of Rectangle Is : " + rc.perimeter());
    }
}


//Question 5
class tommy {
    public void hitting() {
        System.out.println("Hitting The Enemy");
    }

    public void run() {
        System.out.println("Running From The Enemy");
    }
    public void fire() {
        System.out.println("Firing On The Enemy");
    }

    public static void main(String[] args) {
        tommy tm = new tommy();
        tm.fire();;
        tm.run();
        tm.hitting();
    }
}


//Question 6
class circle {
    double side;
    int r;
    double c;

    public double calculatingarea() {
        return side = 3.14 * r * r;
    }

    public double perimeter() {
        return c = 2 * 3.14 * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle cr = new circle();
        System.out.print("Enter r : ");
        cr.r = sc.nextInt();

        System.out.println("Area Of Circle Is : " + cr.calculatingarea());
        System.out.println("Perimeter Of Circle Is : " + cr.perimeter());
    }

}