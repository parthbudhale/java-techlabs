package com.aurionpro.FileHandling;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	 public static void main(String[] args) throws IOException {
		  try {
		   FileReader file = new FileReader("C:\\Users\\parth.budhale\\Desktop\\Aurionpro_training\\text.txt");
		   int i;
		   while ((i = file.read()) != -1) {
		    System.out.print((char) i);
		   }

		  } catch (FileNotFoundException e) {
		   e.printStackTrace();
		  }
		 }

		}


