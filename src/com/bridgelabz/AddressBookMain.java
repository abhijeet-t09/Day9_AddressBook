package com.bridgelabz;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        boolean update = true;

        while (update) {

            System.out.println("Select Operation....");
            System.out.println("1. Enter Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact From Address Book");
            System.out.println("4. Display Address Contacts");
            System.out.println("5. Exit Address Book");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    addressBook.addContact();
                    break;

                case 2:
                    addressBook.editContact();
                    break;

                case 3:
                    addressBook.deleteContact();
                    break;

                case 4:
                    addressBook.displayContact();
                    break;

                case 5:
                    update = false;
                    break;
            }
        }
    }
}
