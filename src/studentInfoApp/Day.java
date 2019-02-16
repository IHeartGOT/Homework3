package studentInfoApp;

public class Day {
	
	weekDays days;
	
	public Day() {}
	
	public Day(weekDays days) {
	this.days=days;
	
	}	
		public void whichDay(weekDays days) {
		switch(days) {
		
		case Monday:
		System.out.println("Today student has Math and Physics Class");
		break;
		case Tuesday:
		System.out.println("Today student has English and Gym Class");
		break;
		case Wednesday:
		System.out.println("Today student has History and Java Class");
		break;
		case Thursday:
		System.out.println("Today student hasDrama and Art class");
		break;
		case Friday:
		System.out.println("Today student has Philosphy and Chemistry class");
		break;
		case Saturday:
		System.out.println("student has day off");
		break;
		case Sunday:
		System.out.println("Get student ready for classes tomorrow");
		}
		

		
	}
	}

