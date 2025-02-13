package com.aurionpro.FileHandling;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriting {
	public static void main(String[] args) {
		try {
			FileWriter file =new FileWriter("C:\\Users\\parth.budhale\\Desktop\\Aurionpro_training//text.txt");
			try {
				file.write("hello");
			}
			finally {
				file.close();
			}
			System.out.println("successful written ");
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
