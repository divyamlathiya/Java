package Inheritance;

import java.util.*;

class Animal {
    String x;

    public String getx() {
        return x;
    }

    public void setx(String x) {
        System.out.print("Setting Name Of Animal : ");
        this.x = x;
    }
}

class Cat extends Animal {
    String y;

    public String gety() {
        return y;
    }

    public void sety(String y) {
        System.out.print("How They Can Speak : ");
        this.y = y;
    }
}

public class inh2 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Animal a1 = new Animal();
        a1.setx("Cat");
        System.out.println(a1.getx());
        c1.sety("Meao Meao");
        System.out.println(c1.gety()); 
        System.out.println("----------------------");
        Cat c2 = new Cat();
        Animal a2 = new Animal();
        a2.setx("Dog");
        System.out.println(a2.getx());
        c2.sety("Bhao Bhao");
        System.out.println(c2.gety());
    }
}
