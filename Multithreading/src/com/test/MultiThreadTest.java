package com.test;

import com.model.MultiThreadModel;

public class MultiThreadTest {

    public static void main(String[] args) {
        MultiThreadModel thread1 = new MultiThreadModel("Thread1", 1500);
        MultiThreadModel thread2 = new MultiThreadModel("Thread2", 1500);

        System.out.println("Thread1 state before start: " + thread1.getState());
        System.out.println("Thread2 state before start: " + thread2.getState());

        thread1.start();
        thread2.start();

        System.out.println("Thread1 state after start: " + thread1.getState());
        System.out.println("Thread2 state after start: " + thread2.getState());

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main method interrupted");
        }

        System.out.println("Thread1 state after completion: " + thread1.getState());
        System.out.println("Thread2 state after completion: " + thread2.getState());

        System.out.println("Both threads are completed");
    }
}
