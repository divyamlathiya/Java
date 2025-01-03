import java.util.*;

//Question 5
public class pro12 {
    public void hitting() {
        System.out.println("Hitting The Enemy");
    }

    public void run() {
        System.out.println("Running From The Enemy");
    }
    public void fire() {
        System.out.println("Firing On The Enemy");
    }

    public static void main(String[] args) {
        tommy tm = new tommy();
        tm.fire();;
        tm.run();
        tm.hitting();
    }
}
