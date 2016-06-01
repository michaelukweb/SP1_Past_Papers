//Program that determines if a year is a leap year  
public class May_2015_Exam_Q2 {
	
	public static void main (String [] args) {
		
		isLeapYear(2016);
	}
	
	public static boolean isLeapYear (int a ){
		
		if ((a % 4 == 0) || (a % 400 == 0) && (a % 100 != 0)) {
			
			System.out.println("Leap year");
			return true;
		} else
		
			System.out.println("Not a leap year");
			return false;
	}
	
}
