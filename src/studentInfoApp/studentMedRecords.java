package studentInfoApp;
import java.util.*;

public abstract class studentMedRecords {
		
	int immune; 
	
	public void immunization() {
		
		Scanner input = new Scanner(System.in);
		   
	    System.out.println("Up to date student immunization record?: 1-Yes or 2-No");
	   
	    immune = input.nextInt();
	   

	    if (immune<=1) {
	      System.out.println("Great we got your records");
	    }
	    else
	    {
	      System.out.println("Get your immunizations done");
	    }
	  }
	
	public abstract void sickdays();
	
	}

			
		
