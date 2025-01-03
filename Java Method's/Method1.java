import java.util.*;

public class Method1 {
    static void PrintMyName(String name) { //Declare The Function
        System.out.println(name);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.next();
        
        System.out.print("Name IS : ");
        PrintMyName(name); //Call The Function

    }
}