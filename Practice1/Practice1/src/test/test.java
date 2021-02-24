
package test;
import  main.Contacts;
import main.Order;
import main.Student;
public class test {


    public static void main(String[] args) {
      Contacts contacts = new Contacts("Alesha","Diskov","Cansas");
        System.out.println(contacts);
        
        Order order = new Order(15, "Vasil", "Ivan");
        System.out.println(order);
        Student stufent = new Student(1, "ex", "ivan", "PPc");
        System.out.println(stufent);
    }
    
}