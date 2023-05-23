package com.bl.addressbook;
import java.util.ArrayList;
import java.util.Scanner;



public class AddressBook {



        Scanner sc = new Scanner(System.in);
        ArrayList<Contacts> contactArrayList = new ArrayList<Contacts>();
        public void addContact() {

            Contacts contact = new Contacts();

            System.out.println("Enter the First Name : ");
            contact.setFirstName(sc.next());
            System.out.println("Enter the Last Name : ");
            contact.setLastName(sc.next());
            System.out.println("Enter the Address: ");
            contact.setAddress(sc.next());
            System.out.println("Enter the City : ");
            contact.setCity(sc.next());
            System.out.println("Enter the State : ");
            contact.setState(sc.next());
            System.out.println("Enter the Zip code : ");
            contact.setZipcode(sc.nextDouble());
            System.out.println("Enter the Mobile Number : ");
            contact.setPhoneNumber(sc.nextDouble());
            System.out.println("Enter the Email ID : ");
            contact.setEmail(sc.next());

            contactArrayList.add(contact);
        }


        public void displayContact() {
            for (int i = 0; i < contactArrayList.size(); i++) {
                Contacts contact = contactArrayList.get(i);
                System.out.println(contact.toString());
            }

        }


    }
