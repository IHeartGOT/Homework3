package studentInfoApp;
import java.util.*;


/*this application application that will process student information for a college 
database system. 
By: Prodip Bhowmik
 */

public class testStudentApp{

	
	public static void main(String[] args) {
		
	
		Student s1 = new studentData();
		
		s1.studentBio();
	         
		s1.name();
		
		s1.address();
		
		studentMedRecords med = new studentData(); //Medical Records 
		med.immunization();
		
		System.out.println();
		
		studentData h1 = new studentData();
		h1.hobby();
		
		System.out.println();
	
        int choice1=1;
        int choice2=2;
        int choice3=3;
        
        System.out.println("For extra curricular activities choose the packages belows: ");
        System.out.println("Enter 1 for Dance($500.25) and Music($200");
        System.out.println("Enter 2 for Dance($500.25), music($200), and chess($100)");
        System.out.println("Enter 3 for Dance($500.25), music($200), chess($100) and swimming($250)");
        Scanner ex1 = new Scanner(System.in);
        int choice = ex1.nextInt();
        if(choice<=choice1)
        {
            System.out.println("You chose 1");
            extraCurricular c2 = new extraCurricular();
        	double cost = c2.costOfCurriculam(500.25, 200);
        	System.out.println("Cost of two extra curricular activities: $"+cost);
          }
          else if(choice<=choice2) {
            System.out.println("You chose 2");
            extraCurricular c3 = new extraCurricular();
        	double cost = c3.costOfCurriculam(500.25, 200, 150);
        	System.out.println("Cost of three extra curricular activities: $"+cost);
            }
            else if(choice<=choice3) {
            	System.out.println("You chose 3");
            	extraCurricular c4 = new extraCurricular();
            	double cost = c4.costOfCurriculam(500.25, 200, 150, 300);
            	System.out.println("Cost of four extra curricular activities: $"+cost);
            	}
            else{
            	System.out.println("You didn't choose right one");
            }
         if(choice<=choice1) {       	
		modExtraCurricular mc = new modExtraCurricular();
		double md = mc.extraCurricular(500.25, 200);
		System.out.println("Cost of two extra curricular activities and registraion($200): $"+md);
         }
		else if(choice<=2) {
			modExtraCurricular mc2 = new modExtraCurricular();
			double md2 = mc2.extraCurricular(500.25, 200, 150);
			System.out.println("Cost of three extra curricular activities and registraion($200): $"+md2);
		}
		else if(choice<=3) {
			modExtraCurricular mc3 = new modExtraCurricular();
			double md3 = mc3.extraCurricular(500.25, 200, 150, 250);
			System.out.println("Cost of four extra curricular activities and registraion($200): $"+md3);
         
		}
		
			
		
		System.out.println();
		
		studentData sd = new studentData();
		sd.sickdays();
	
		System.out.println();
		
		System.out.println("Today is Friday : ");
		
		Day today = new Day();
		today.whichDay(weekDays.Friday);
		
		
	
	}

}
