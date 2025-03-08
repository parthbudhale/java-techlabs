package com.Test;

import com.model.Computer;

public class BuilderPatternDemo {
	public static void main(String[] args) {
	
        Computer gamingPC = new Computer.ComputerBuilder()
        		.setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1000)
                .setGPU("Nvidia RTX 4090")
                .setOS("Windows 11")
                .build();

        Computer officePC = new Computer.ComputerBuilder()
                .setCPU("AMD Ryzen 7")
                .setRAM(16)
                .setStorage(512)
                .setGPU("Integrated")
                .setOS("Ubuntu Linux")
                .build();

      
        gamingPC.showSpecifications();
        System.out.println("---------------------");
        officePC.showSpecifications();
	}

}