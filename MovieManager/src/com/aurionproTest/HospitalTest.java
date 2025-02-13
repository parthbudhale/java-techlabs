package com.aurionproTest;

import com.aurionpro.Doctor;
import com.aurionpro.HospitalStaff;
import com.aurionpro.Nurse;

public class HospitalTest {
    public static void main(String[] args) {
    	  // Creating objects of Doctor and Nurse
        Doctor doc1 = new Doctor(101, "Dr. Smith", "Cardiology", "Cardiologist", new String[]{"Alice", "Bob"});
        Nurse nurse1 = new Nurse(201, "Nurse Lily", "ICU", "Night");
  

        // Storing in an array of HospitalStaff
        HospitalStaff[] staffMembers = new HospitalStaff[3]; // Create an array of size 2
        staffMembers[0] = doc1;  // Assign the first element
        staffMembers[1] = nurse1; 
       
        
        

        // Displaying details and demonstrating polymorphism
        for (HospitalStaff staff : staffMembers) {
            System.out.println(staff);
            staff.work(); // Calls the overridden method
            System.out.println();
        }
    }
}