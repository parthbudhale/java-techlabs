package com.aurionpro.FileHandling;
import java.io.*;
public class FileHandling {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\parth.budhale\\Desktop\\Aurionpro_training\\techlabs.txt");
		try {
				if(file.createNewFile()) {
					System.out.println("successful");
				}
				else {
					System.out.println("file succesfull");
					
				}
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}

}
