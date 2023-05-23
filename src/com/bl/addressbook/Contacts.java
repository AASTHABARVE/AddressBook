package com.bl.addressbook;

public class Contacts {

        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private double zipcode;
        private double phoneNumber;
        private String email;


        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public double getZipcode() {
            return zipcode;
        }

        public void setZipcode(double zipcode) {
            this.zipcode = zipcode;
        }

        public double getPhoneNumber()
        {
            return phoneNumber;
        }

        public void setPhoneNumber(double phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
        @Override
        public String toString() {
            return "Contacts{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", address='" + address + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", zipcode=" + zipcode +
                    ", phoneNumber=" + phoneNumber +
                    ", email='" + email + '\'' +
                    '}';
        }
    }

