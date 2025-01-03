import java.util.*;

class EkClass {
    int a;

    public void seta() {
        return a;
    }

    EkClass(int v) {
        a = v;
    }
    public int returnOne() {
        return 1;
    }

}

public class cns5 {
    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        System.out.println(e.seta());
    }
}
