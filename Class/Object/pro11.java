import java.util.*;

//Question 4
public class pro11 {
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