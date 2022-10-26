package najah.edu;

public class Test {
	
	
	public static int getYear(String string) {
	     int year = Integer.parseInt(string, 6, 10, 10);   
		return year;
		
	}
	
	public static int getMonth(String string) {
	     int month = Integer.parseInt(string, 3, 5, 10);   
		return month;
		
	}
	public static int getDay(String string) {
	     int day = Integer.parseInt(string, 0, 2, 10);   
		return day;
		
	}
	
	
	public static int geHours(String string) {
	     int day = Integer.parseInt(string, 0, 2, 10);   
		return day;
		
	}
	
	public static int getMin(String string) {
	     int day = Integer.parseInt(string, 3, 5, 10);   
		return day;
		
	}
	
	
}
