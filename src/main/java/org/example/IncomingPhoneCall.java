package org.example;

    public class IncomingPhoneCall extends PhoneCall {

        // Constructor sets the phone number and price
        public IncomingPhoneCall(String phoneNumber) {
            super(phoneNumber);
            setPrice(0.02); // 2 cents per call
        }

        // Override method to return phone number
        @Override
        public String getPhoneNumber() {
            return phoneNumber;
        }

        // Override method to return the price (which is the rate)
        @Override
        public double getPrice() {
            return price;
        }

        // Override method to display call details
        @Override
        public void displayInformation() {
            System.out.println("Incoming Call Information:");
            System.out.println("Phone Number: " + getPhoneNumber());
            System.out.println("Rate: $" + getPrice() + " per call");
            System.out.println("Price: $" + getPrice());
        }
    }


