import java.util.*;

public class Method5 {
    static void facNum(int n) {
        if(n < 0) {
            System.out.print("Invalid Number");
        }
        int Facto = 1;

        for(int i=n;i>=1;i--) {
            Facto = Facto * i;
        }

        System.out.print(Facto);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        facNum(n);
    }
}
