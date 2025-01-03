import java.util.*;

public class Method9 {
    static int myNum1(int a,int b) {
        return a + b;
    }

    static double myNum2(double x,double y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println("-------------------------");

        System.out.print("Enter x : ");
        double x = sc.nextDouble();
        System.out.print("Enter y : ");
        double y = sc.nextDouble();

        System.out.println("Sum Of myNum1 : " + myNum1(a,b));
        System.out.println("------------------------");
        System.out.print("Sum Of myNum2 : " + myNum2(x,y));
    }
    
}
