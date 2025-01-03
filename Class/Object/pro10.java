import java.util.*;

//Question 3
public class pro10 {
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
