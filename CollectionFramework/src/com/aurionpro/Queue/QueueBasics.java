package com.aurionpro.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueBasics {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();

		// Add Elements
		queue.add(50);
		queue.add(99);
		queue.add(33);
		queue.add(77);
		queue.add(66);

		// Display the elements using iterator
		System.out.println("Queue elements:");
		Iterator<Integer> i = queue.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println();

		System.out.println("Extracting min (removes smallest element): " + queue.poll());

		System.out.println("Peek at the min element: " + queue.peek());

		System.out.println("Is the queue empty? " + queue.isEmpty());

		System.out.println("Size of the queue: " + queue.size());

		queue.clear();
		System.out.println("Queue cleared.");
		System.out.println("Is the queue empty after clearing? " + queue.isEmpty());
	}
}
