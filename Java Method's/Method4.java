import java.util.*;

public class Method4 {
    static int mulNum(int a,int b) {
        int Mul = a * b;
        return Mul;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a : ");
    int a = sc.nextInt();
    System.out.print("Enter b : ");
    int b = sc.nextInt();

    int Mul = mulNum(a,b);
    System.out.print("Multiplication IS : " + Mul);
   }
}
