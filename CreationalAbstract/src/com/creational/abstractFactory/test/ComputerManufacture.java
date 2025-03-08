package com.creational.abstractFactory.test;

import java.util.Scanner;

import com.creational.abstractFactory.model.AMDFactory;
import com.creational.abstractFactory.model.AmdGpu;
import com.creational.abstractFactory.model.IAbstractFactory;
import com.creational.abstractFactory.model.ICPU;
import com.creational.abstractFactory.model.IGPU;
import com.creational.abstractFactory.model.IntelFactory;
import com.creational.abstractFactory.model.NvindiaGpu;

public class ComputerManufacture {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select CPU manufacturer (Intel / AMD): ");
        String cpuChoice = scanner.nextLine().trim().toLowerCase();

        System.out.println("Select GPU manufacturer (Nvidia / AMD): ");
        String gpuChoice = scanner.nextLine().trim().toLowerCase();

        IAbstractFactory factory;

        if (cpuChoice.equals("intel")) {
            factory = new IntelFactory();
        } else if (cpuChoice.equals("amd")) {
            factory = new AMDFactory();
        } else {
            System.out.println("Invalid CPU selection.");
            scanner.close();
            return;
        }

        ICPU selectedCPU = factory.createCpu();
        IGPU selectedGPU;

        // Manually selecting GPU since IntelFactory always returns Nvidia GPU
        if (gpuChoice.equals("nvidia")) {
            selectedGPU = new NvindiaGpu();
        } else if (gpuChoice.equals("amd")) {
            selectedGPU = new AmdGpu();
        } else {
            System.out.println("Invalid GPU selection.");
            scanner.close();
            return;
        }

        System.out.println("\nManufacturing System Output:");
        selectedCPU.assemble();
        selectedGPU.assemble();

        scanner.close();
    }

}

