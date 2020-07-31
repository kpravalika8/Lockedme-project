package com.project1;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Users implements Info {
	static Scanner scan=new Scanner(System.in);
	List<String> retrieve= new ArrayList<String>();
	File[] files = new File("C:\\Users\\SHRAVAN KUMAR\\eclipse-workspace\\MyProject").listFiles();
	
     public void showAllFiles() {
	
		for(File file : files) {
			if(file.isFile()) {
				retrieve.add(file.getName());
				//System.out.println(file.getName());
			}
		}
		retrieve.forEach(System.out::println);
		
	}

	
	public void addFile() {
		
				System.out.println("Enter the file name which you want to add:");
				//scan.next();
				
				String filename=scan.nextLine();
				File F= new File(filename);
			
				try {
					if(F.createNewFile()) {
						System.out.println(filename+" file is added to the directory");
						Desktop.getDesktop().edit(F);
					}
					else {
						System.out.println("This file is already there");
					}
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		
	}

	public void deleteFile() {
		
				System.out.println("Enter the file which you want to delete:");
				//sc.next();
				String filename=scan.nextLine();
				scan.close();
				File F= new File(filename);
				if(F.delete())
					System.out.println(filename+" got Deleted");
				else
					System.out.println("File Not Found");
		
	}


	public void searchFile() {
		try {	
			Scanner scan1=new Scanner(System.in);
			File directory = new File("C:\\Users\\shravankumar\\eclipse-workspace\\LockedMe");
			System.out.println("Enter the file name you want to search:");
			String fileName=scan.nextLine();
            File[] files=directory.listFiles();
            int flag=0;
            for (File file : files) {
                String name = file.getName();
                if (name.equals(fileName)) {
                       // System.out.println("The filename "+fileName+" is present in the directory");
        				File f= new File(fileName);
        				Scanner scan2 = new Scanner(f);
        				scan2.close();
        				while(scan2.hasNextLine()) {
        				System.out.println(scan2.nextLine());
        				}
        			flag=1;	
                }
			}
        if(flag==0) {
        	System.out.println("File not found");
        }
        	
		}catch(FileNotFoundException ex) {
			System.out.println("file not found");
		}
		
	}

}
