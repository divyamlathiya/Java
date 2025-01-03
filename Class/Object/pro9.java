import java.util.*;

//Question 2
public class pro9 {
    public void ringing() {
        System.out.println("Ringing...");
    }

    public void vibrating() {
        System.out.println("Vibrates...");
    }

    public void callfriend() {
        System.out.println("Calling Frd...");
    }

    public static void main(String[] args) {
        cellphone phone = new cellphone();
        phone.callfriend();
        phone.vibrating();
        phone.ringing();
        
    }
}