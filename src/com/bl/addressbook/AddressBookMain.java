package com.bl.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args){
        System.out.println("Welcome to Address book");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        int Number;

        do {
            System.out.println(" 1. Add Contact \n 2. Display contact ");
            System.out.println("Enter the  Number: ");

            Number = sc.nextInt();

            switch (Number) {
                case 1 -> addressBook.addContact();
                case 2 -> addressBook.displayContact();
                default -> System.out.println(" Invalid Input!!! ");
            }
        } while (Number != 2);
    }

}


