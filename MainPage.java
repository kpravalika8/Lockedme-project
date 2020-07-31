package com.project1;

import java.io.*;
import java.util.*;

public class MainPage {

	public static void main(String[] args) {
	
		welcomeScreen();
		try {
			menuDriven();
		} catch (FileNotFoundException e) {
			
		}	
	}

	public static void welcomeScreen() {
		System.out.println("Application Name : LOCKED ME \n");
		System.out.println("Developer : Developed by Katam Pravalika \n");
	}

	public static void menuDriven() throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		Users obj = new Users();
		int option;
		do {
		System.out.println("Select any one option from the following : \n");
		System.out.println("\t1. Retrieve current filenames in ascending order \n");
		System.out.println("\t2. User file operations in the  menu \n");
		System.out.println("\t3. Exit from the application \n");
		
		option=scan.nextInt();
		
		switch(option) {
		case 1:
			obj.showAllFiles();
			break;
		case 2:
			int ch;
		do {
			System.out.println("select your choice from the following :");
			System.out.println("\t1. Add a file to the application");
			System.out.println("\t2. Delete a file from the application");
			System.out.println("\t3. Search a file  in the application");
			System.out.println("\t4. Exit to the main menu");
			
			ch=scan.nextInt();
			
			switch(ch) {
			case 1:
				obj.addFile();
				break;
			case 2:
				obj.deleteFile();
				break;
			case 3:
				obj.searchFile();
				break;
			case 4:
				System.out.println("Exit from the lockedMe.com page...");
				System.out.println("------------------------------------\n");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(ch!=4);
		break;
		case 3:
			System.out.println("Exit from the application...");
			break;
		default:
			System.out.println("Invalid choice");scan.close();
		}
		
		//System.out.println("Press 0 to continue");
		}while(option!=3);
		
	}

	
}
