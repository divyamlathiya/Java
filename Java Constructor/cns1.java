import java.util.*;

class employee {
    private int id;
    private int salary;

    public employee() {
        id = 0;
        salary = 0;
    }

    public employee(int empid, int empsalary) {
        id = empid;
        salary = empsalary;
    }

    // public employee(int empid, int empsalary) {
    //     id = empid;
    // }
}

public class cns1 {
    public static void main(String[] args) {
        employee e1 = new employee(101, 10000);
        // System.out.println(e1.getempid());
    }
}
