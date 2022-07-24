package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Contacts contact = new Contacts();
        contact.setFirstName("Abhijeet");
        contact.setLastName("Tripathi");
        contact.setAddress("H3/73, Dwarka");
        contact.setCity("New Delhi");
        contact.setState("Delhi");
        contact.setZip("110087");
        contact.setPhoneNumber("(+91) 8374738273");
        contact.setEmail("abhijeet@rediffmail.com");

        System.out.println(contact.getFirstName());
        System.out.println(contact.getLastName());
        System.out.println(contact.getAddress());
        System.out.println(contact.getCity());
        System.out.println(contact.getState());
        System.out.println(contact.getZip());
        System.out.println(contact.getPhoneNumber());
        System.out.println(contact.getEmail());
    }
}
