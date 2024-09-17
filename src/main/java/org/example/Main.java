package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //PhoneCall
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

    //IncomingPhoneCall
    public class IncomingPhoneCall extends org.example.PhoneCall {

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

    //OutgoingPhoneCall
    public class OutgoingPhoneCall extends org.example.PhoneCall {
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

    //DemoPhoneCalls
    public class DemoPhoneCalls {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            org.example.PhoneCall phoneCall; // Declare a PhoneCall reference
            String callType;      // Store the type of call
            String phoneNumber;   // Store the phone number
            int minutes;          // Store the duration of an outgoing call

            // Sentinel loop to continually prompt the user
            while (true) {
                System.out.println("Enter the type of call (I for Incoming, O for Outgoing, Q to Quit): ");
                callType = scanner.nextLine().toUpperCase();

                // Sentinel value to quit
                if (callType.equals("Q")) {
                    System.out.println("Exiting the program.");
                    break;
                }

                // Prompt for phone number
                System.out.print("Enter the phone number: ");
                phoneNumber = scanner.nextLine();

                // Create either an IncomingPhoneCall or OutgoingPhoneCall object
                if (callType.equals("I")) {
                    phoneCall = new org.example.IncomingPhoneCall(phoneNumber);
                } else if (callType.equals("O")) {
                    System.out.print("Enter the number of minutes: ");
                    minutes = Integer.parseInt(scanner.nextLine());
                    phoneCall = new org.example.OutgoingPhoneCall(phoneNumber, minutes);
                } else {
                    System.out.println("Invalid call type. Please try again.");
                    continue;
                }

                // Display the details of the call
                phoneCall.displayInformation();
                System.out.println();
            }

            scanner.close();
        }
    }



}