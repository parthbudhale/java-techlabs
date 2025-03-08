package com.test;

import com.model.File;
import com.model.Folder;

public class CompositePatternDemo {
	public static void main(String[] args) {
		File file1 = new File("Document1.txt");

		File file2 = new File("Image.png");

		File file3 = new File("Report.pdf");

		

		Folder folder1 = new Folder("Work Documents");

		Folder folder2 = new Folder("Personal Files");

		Folder root = new Folder("Root Folder");

		root.addComponent(folder1);
		

		root.addComponent (folder2);

		root.showdetails();

		}

		}
	
