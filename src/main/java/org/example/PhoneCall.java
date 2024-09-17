package org.example;

    public abstract class PhoneCall {
        protected String phoneNumber;
        protected double price;

        // Constructor that takes the phone number and sets price to 0.0
        public PhoneCall(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            this.price = 0.0;
        }

        // Setter method for price
        public void setPrice(double price) {
            this.price = price;
        }

        // Abstract methods
        public abstract String getPhoneNumber();    // Get phone number
        public abstract double getPrice();          // Get price of the call
        public abstract void displayInformation();  // Display call information
    }

