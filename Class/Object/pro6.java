 import java.util.*;

public class pro6 {

    public void sent() {
        System.out.println("This Car Is So Speedy!");
    }

    public void speed() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Max Speed : ");
        int maxSpeed = sc.nextInt();
        System.out.println("---------------------");
        System.out.println("Maximum Speed Is : " + maxSpeed); 
    }

    public static void main(String[] args) {
        pro6 obj = new pro6();
        obj.speed();
        obj.sent();
    }
    
}
 