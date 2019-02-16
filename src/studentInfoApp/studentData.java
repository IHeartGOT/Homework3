package studentInfoApp;

import java.util.*;

public class studentData extends studentMedRecords implements Student{

		
	int[] intIDs = new int[30];
	int n; 
	String[] sName= new String[30];
	String[] sAddress = new String[30];
	String s, a;
	
	public void studentBio() {
		
		
		System.out.println("Enter student ID number: ");
		Scanner reader = new Scanner(System.in);
		n = reader.nextInt();
		intIDs[0]=n;
		
		System.out.println("Enter student's name: ");
		Scanner reader2 = new Scanner(System.in);
		s= reader2.nextLine();
		sName[0]=s;
		
		
		System.out.println("Enter student's address:");
		Scanner reader3 = new Scanner(System.in);
		a = reader3.nextLine();
		sAddress[0]=a;
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Student ID: "+intIDs[0]);
		System.out.println("Student Name: "+sName[0].toUpperCase());
		System.out.println("Student Address: "+sAddress[0].toUpperCase());
		
	}

	public void name() {
		System.out.println("");
		
	}
		
	public void address() {
		System.out.println("");
		
	}
	
	public void hobby() {
		System.out.println("What's student's hobby: ");
		Scanner shobby = new Scanner(System.in);
		String studentHobby = shobby.nextLine();
		System.out.println("Student's hobby: "+studentHobby);
		
		
	}
	
	public void sickdays() {
		System.out.println("How many days student missed class: ");
		Scanner missed = new Scanner (System.in);
		int sd = missed.nextInt();
		 if (sd <= 0) {
		      System.out.println("Student has perfect attendance");
		    }
		    else {
		      System.out.println("Don't miss class");
	}
}
}

	