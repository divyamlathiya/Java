import java.util.*;

public class Method8 {
    static void checkAge(int age) {
        if (age > 18) {
            System.out.print("Eligible For Voting!");
        }
        else if (age <= 0) {
            System.out.print("Invalid Age!");
        }
        else {
            System.out.print("Not Eligible For Voting!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();

        checkAge(age);
    }
    
}
