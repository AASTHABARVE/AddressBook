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

            public void editContact() {
                System.out.println("Enter the First Name to Edit : ");
                String FirstName = (sc.next());
                boolean IsAvaible = false;

                for (Contacts contact : contactArrayList) {
                    if (contact.getFirstName().equals(FirstName)) {
                        IsAvaible = true;

                        System.out.println("Enter the First Name : ");
                        contact.setFirstName(sc.next());
                        System.out.println("Enter the Last Name : ");
                        contact.setLastName(sc.next());
                        System.out.println("Enter the Address : ");
                        contact.setAddress(sc.next());
                        System.out.println("Enter the City : ");
                        contact.setCity(sc.next());
                        System.out.println("Enter the State : ");
                        contact.setState(sc.next());
                        System.out.println("Enter the Zipcode : ");
                        contact.setZipcode(sc.nextDouble());
                        System.out.println("Enter the Mobile Number : ");
                        contact.setPhoneNumber(sc.nextDouble());
                        System.out.println("Enter the Email Id : ");
                        contact.setEmail(sc.next());
                    }
                }

                if (IsAvaible == false) {
                    System.out.println("Not Availabe");
                }
            }
    public void deleteContact() {

        System.out.println("Enter the First Name to Delete: ");
        String FirstName = (sc.next());
        boolean IsAvaible = false;

        for (Contacts contact : contactArrayList) {
            if (contact.getFirstName().equalsIgnoreCase(FirstName)) {
                IsAvaible = true;
                contactArrayList.remove(contact);
                System.out.println("Deleted!!");
                break;
            }
        }
        if (IsAvaible == false) {
            System.out.println("Not Availabe");
        }
    }

        }





