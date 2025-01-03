import java.util.*;

class base {
    public int x;

    base() {
        System.out.println("I Am A Constructor");
    }

    public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }
}

class derived1 extends base {
    int y;

    derived1() {
        System.out.println("I Am A Derived Class Constructor");
    }

    public int gety() {
        return y;
    }

    public void sety(int y) {
        this.y = y;
    }
}

public class cns4 {
    public static void main(String[] args) {
        base b = new base();
        derived1 d = new derived1();
        b.setx(1500);
        System.out.println(b.getx());
        d.sety(1600);
        System.out.println(d.gety());
    }
}
