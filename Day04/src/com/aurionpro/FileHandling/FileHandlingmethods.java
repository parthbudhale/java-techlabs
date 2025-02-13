package com.aurionpro.FileHandling;
import java.io.*;
public class FileHandlingmethods {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\parth.budhale\\Desktop\\Aurionpro_training\\techlabs.txt");
		if(file.exists()) {
			System.out.println("file name" +file.getName());
			System.out.println("can be read"+file.canRead());
			System.out.println("can be written"+file.canWrite());
			System.out.println("File path"+file.getPath());
			
			
		}
		else {
			System.out.println("file doesnt exists");
	}


}
}
