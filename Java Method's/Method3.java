import java.util.*;

public class Method3 {
    static int addNum(int a,int b) {
        int Sum = a + b;
        return Sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        int Sum = addNum(a,b);
        System.out.print("Sum Is : " + Sum);
    }
}
