package learing_java;
import java.util.*;

public class Citizen {
    String name;
    String alias;
    String sex;
    Date birthday;
    String homeland;
    String ID;

    public Citizen(String name, String alias, String sex, Date birthday, String homeland, String ID) {
        this.name = name;
        this.alias = alias;
        this.sex = sex;
        this.birthday = birthday;
        this.homeland = homeland;
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void displayAll() {
        System.out.println("name "+name);
        System.out.println("alias: "+alias);
        System.out.println("sex: "+sex);
        System.out.println("birthday: "+birthday.toString());
        System.out.println("homeland: "+homeland);
        System.out.println("ID: "+ID);
    }
    public static void main(String[] args) {
        Citizen p1 = new Citizen("Andy Wei", "haha", "M", new Date(), "China", "1110340200423");
        Citizen p2 = new Citizen("Bill Ng", "kaKA", "M", null, "Shanghai", "1224894023023");
        p2.setName("Leslie Chung");
        p2.alias = "free man";
        p1.displayAll();
        System.out.println("-------------------------------------");
        p2.displayAll();

    }
}