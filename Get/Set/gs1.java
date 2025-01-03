package Get.Set;


class employee {
    private int id;
    private String name;

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n; //Also Use This.name
    }

    public int getid() {
        return id;
    }

    public void setid(int i) {
        id = i; //Also Use This.id
    }

}
public class gs1 {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setname("Rajat Arora");
        System.out.println(e1.getname());
        e1.setid(101);
        System.out.println(e1.getid());
    }
}
