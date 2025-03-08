package com.test;

import java.util.Scanner;

import com.model.Notification;
import com.model.NotificationFactory;

public class NotificationServiceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NotificationFactory factory = NotificationFactory.getInstance(); // Get the Singleton instance

        while (true) {
            System.out.print("Enter notification method (Email/SMS/Push) or type 'exit' to quit: ");
            String method = scanner.nextLine();

            if (method.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Notification Service.");
                break;
            }

            Notification notification = factory.getNotification(method);

            if (notification != null) {
                System.out.print("Enter message to send: ");
                String message = scanner.nextLine();
                notification.sendNotification(message);
            } else {
                System.out.println("Invalid notification method. Please try again.");
            }
        }

        scanner.close();
    }
}








