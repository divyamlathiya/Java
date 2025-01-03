import java.util.*;

//Question 6
public class pro13 {
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
