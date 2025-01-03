import java.util.*;


public class Method6 {
    static boolean yesNo(int a,int b) { 

        System.out.println(a<b);
        return true;

        // if (a<b) {
        //     System.out.print("True");
        // }

        // else {
        //     System.out.print("False");
        // }

        // return true;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        yesNo(a,b);
    }
    
}
