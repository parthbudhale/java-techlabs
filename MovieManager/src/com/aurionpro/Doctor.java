package com.aurionpro;
	 public class Doctor extends HospitalStaff {
	    private String specialization;
	    private String[] patients;

	    public Doctor(int staffId, String name, String department, String specialization, String[] patients) {
	        super(staffId, name, department);
	        this.specialization = specialization;
	        this.patients = patients;
	    }

	    @Override
	    public void work() {
	        System.out.println(name + " is treating patients as a " + specialization);
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Specialization: " + specialization + ", Patients: " + String.join(", ", patients);
	    }
	}
	


