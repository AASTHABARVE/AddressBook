package com.bl.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args){
        System.out.println("Welcome to Address book");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        int Number;

        do {
            System.out.println(" 1. Add Contact \n 2. Display contact \n 3. Edit contact \n 4. Delete Contact \n ");
            System.out.println("Enter the  Number: ");

            Number = sc.nextInt();

            switch (Number) {


                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.displayContact();
                    break;
                case 3:
                    addressBook.editContact();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;


                default:
                    System.out.println(" Invalid Input!!! ");
                    break;

            }
        } while (Number != 4);
    }

}


