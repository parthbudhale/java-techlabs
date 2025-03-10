package com.aurionpro;
 public class Nurse extends HospitalStaff {
    private String shiftTimings;

    public Nurse(int staffId, String name, String department, String shiftTimings) {
        super(staffId, name, department);
        this.shiftTimings = shiftTimings;
    }

    @Override
    public void work() {
        System.out.println(name + " is assisting patients in the " + shiftTimings + " shift.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Shift Timings: " + shiftTimings;
    }
}