package main;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import main.Contacts;

public class DataIO
{
    Scanner s = new Scanner(System.in);
    public Contacts ContactInput()
    {
        return new Contacts(s.nextInt(), s.nextLine(), s.nextLine(), s.nextLine(), s.nextLine(), s.nextInt());
    }
    public Student StudentInput()
    {
        return new Student(s.nextInt(), s.nextLine(), s.nextLine(), s.nextLine());
    }
    public Order OrderInput()
    {
        return new Order(s.nextInt(), s.nextLine(), s.nextLine(), s.nextLine());
    }
    public void ContactsToFile(Contacts contact)
    {
        try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("Contact.dat")))
        {
            oos.writeObject(contact);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been writen");
    }
    public void StudentToFile(Student student)
    {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student.dat")))
        {
            oos.writeObject(student);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been writen");
    }
    public void OrderToFile(Order order)
    {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Order.dat")))
        {
            oos.writeObject(order);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been writen");
    }
}