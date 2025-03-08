package com.test;

import com.model.Consumer;
import com.model.Producer;
import com.model.SharedProducerConsumerResources;

public class ProducerConsumerTest {
	public static void main(String[] args) {

		SharedProducerConsumerResources resource = new SharedProducerConsumerResources();

		Producer producer = new Producer (resource);

		Consumer consumer = new  Consumer (resource);

		producer.start();

		consumer.start();

}
}

