package com.mcfadden.exercise10;
//Ean McFadden
//Exercise 10
//March 20, 2018
import java.util.*;
class Contact {
    private String name;
    private String email;
    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void display(){
        System.out.println("This person's name is " + name + " and their e-mail is " + email + ".");
    }

}
class Collection implements Iterable<Contact> {
    ArrayList<Contact> collection = new ArrayList<>();
    public Collection(ArrayList<Contact> collection){
        this.collection = collection;
    }

    @Override
    public Iterator iterator() {
        return collection.iterator();
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Contact> collect = new ArrayList<>();
        String response = response();
        while (response.equals("Y")){
            System.out.println("Enter the name of a new contact");
            String name = input.nextLine();
            System.out.println("Enter the e-mail of the new contact.");
            String email = input.nextLine();
            Contact contact = new Contact(name, email);
            collect.add(contact);
            response = response();
        }
        Collection aFineAddition = new Collection(collect);
        for (Contact contact: aFineAddition){
            contact.display();
        }
    }
    public static String response(){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to enter the name of a new contact? Answer 'Y' for yes or 'N' for no.");
        String response = input.nextLine();
        return response;
    }
}
