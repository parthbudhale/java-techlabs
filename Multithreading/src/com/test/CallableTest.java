package com.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException; // Correct import

import com.model.CallableDemo;

public class CallableTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        CallableDemo task1 = new CallableDemo("A");
        CallableDemo task2 = new CallableDemo("B");
        CallableDemo task3 = new CallableDemo("C");

        Future<String> future1 = executor.submit(task1);
        Future<String> future2 = executor.submit(task2);
        Future<String> future3 = executor.submit(task3);

        try {
            System.out.println(future1.get());
            System.out.println(future2.get());
            System.out.println(future3.get());
        } 
        catch (InterruptedException | ExecutionException e) { 
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            executor.shutdown();
        }
    }
}
