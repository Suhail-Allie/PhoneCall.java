package org.example;

    public class OutgoingPhoneCall extends PhoneCall {
        private int minutes;  // Time of the call in minutes

        // Constructor sets phone number, minutes, and price
        public OutgoingPhoneCall(String phoneNumber, int minutes) {
            super(phoneNumber);
            this.minutes = minutes;
            setPrice(minutes * 0.04); // 4 cents per minute
        }

        // Override method to return phone number
        @Override
        public String getPhoneNumber() {
            return phoneNumber;
        }

        // Override method to return the price
        @Override
        public double getPrice() {
            return price;
        }

        // Override method to display call details
        @Override
        public void displayInformation() {
            System.out.println("Outgoing Call Information:");
            System.out.println("Phone Number: " + getPhoneNumber());
            System.out.println("Rate: $0.04 per minute");
            System.out.println("Minutes: " + minutes);
            System.out.println("Total Price: $" + getPrice());
        }
    }


