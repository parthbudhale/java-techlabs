package com.test;

import com.model.GoogleDrive;
import com.model.GoogleDriveAdapter;

public class AdapterPatternTest {
    public static void main(String[] args) {
    	GoogleDrive g = new GoogleDriveAdapter("upload");
    	GoogleDrive g1 = new GoogleDriveAdapter("download");
    	GoogleDrive g2 = new GoogleDriveAdapter("delete");
    	
    	g.upload("parth","upload");
    	g1.upload("bala","download");
    	g2.upload("boobbyy","delete");
    	
    }
}