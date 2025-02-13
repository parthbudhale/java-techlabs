package com.aurionpro.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.Model.Student;

public class StudentSerialization {
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		Student student = new Student(1,"parth","Budhale",5.5);
		
		String fileName = "C:\\Users\\parth.budhale\\Desktop\\Aurionpro_training\\ser.txt";
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(student);
		
		oos.close();
		fos.close();
		System.out.println("Serialization done  Successfull");  
		
		
//		 try (FileInputStream fis = new FileInputStream(fileName);
//	             ObjectInputStream ois = new ObjectInputStream(fis)) {
//	            
//	            Student deserializedStudent = (Student) ois.readObject(); // Reading object from file
//	            System.out.println("Deserialization successful: " + deserializedStudent);
//
//	        } catch (IOException | ClassNotFoundException e) {
//	            e.printStackTrace();
//	        }
		 
		
		FileInputStream fos1 = new FileInputStream(fileName);
		ObjectInputStream oos1 = new ObjectInputStream(fos1);
		Student s2 = (Student)oos1.readObject();    //Desiralizable
		
		System.out.println(s2.id);
		
		
		
	    }
	
		
	
	}


