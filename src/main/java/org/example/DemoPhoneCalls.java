package org.example;
import java.util.Scanner;

public class DemoPhoneCalls {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            PhoneCall phoneCall; // Declare a PhoneCall reference
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
                    phoneCall = new IncomingPhoneCall(phoneNumber);
                } else if (callType.equals("O")) {
                    System.out.print("Enter the number of minutes: ");
                    minutes = Integer.parseInt(scanner.nextLine());
                    phoneCall = new OutgoingPhoneCall(phoneNumber, minutes);
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


