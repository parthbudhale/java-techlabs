package com.model;

public class NotificationFactory {
    private static NotificationFactory instance;
    private NotificationFactory() {
    	
    }
    public static NotificationFactory getInstance() {
        if (instance == null) {
            instance = new NotificationFactory();
        }
        return instance;
    }

  
    public Notification getNotification(String type) {
        if (type.equalsIgnoreCase("Email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (type.equalsIgnoreCase("Push")) {
            return new PushNotification();
        }
        return null;
    }
}