package com.creational.singleton.test;

import com.creational.singleton.model.DatabaseConnectionManager;

public class DatabaseConnectionManagerTest {
    public static void main(String[] args) {
        DatabaseConnectionManager dbManager1 = DatabaseConnectionManager.getInstance();
        dbManager1.connect();
        System.out.println("HashCode of dbManager1: " + dbManager1.hashCode());

        DatabaseConnectionManager dbManager2 = DatabaseConnectionManager.getInstance();
        dbManager2.disconnect();
        System.out.println("HashCode of dbManager2: " + dbManager2.hashCode());

        System.out.println("dbManager1 == dbManager2: " + (dbManager1 == dbManager2));
    }
}
