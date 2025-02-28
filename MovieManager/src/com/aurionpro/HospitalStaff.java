package com.aurionpro;

	public abstract class HospitalStaff {
	    private int staffId;
	    protected String name;
	    private String department;

	    public HospitalStaff(int staffId, String name, String department) {
	        this.staffId = staffId;
	        this.name = name;
	        this.department = department;
	    }

	    public abstract void work(); // Abstract method

	    @Override
	    public String toString() {
	        return "Staff ID: " + staffId + ", Name: " + name + ", Department: " + department;
	    }
	}
