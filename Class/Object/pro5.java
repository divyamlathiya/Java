import java.util.*;

public class pro5 {
    public void publicMethod() {
        System.out.print("Hello Java As Public");
    }

    static void staticMethod() {
        System.out.println("Hello Java As Static");
    }
    
    public static void main(String[] args) {
        staticMethod();

        pro5 obj = new pro5();
        obj.publicMethod();
     }

     
    }

/*In Java Public Method Is Used In Other Class 
But Static Method Is Not.

Static Method IS Only Used In The Class Where Is Declare.  
Public Method Is Used In Anywhere By Using Object. */

     class second1 {
        public static void main(String[] args) {
            pro5 obj = new pro5();
            obj.publicMethod();
        }
}
