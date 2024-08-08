package enums;

public class Demo {

	public static void main(String[] args) {
		
		
		Day today = Day.WEDNESDAY;
		
		if(today == Day.WEDNESDAY) {
			System.out.println("It is Wednesday");
		}
		
		
		switch(today) {
		
			
		case MONDAY:
		
		case TUESDAY:
		
		case WEDNESDAY:
		
		case THURSDAY:
		
		case FRIDAY:
			System.out.println("It is a weekday");
			break;
		
		case SUNDAY:
		case SATURDAY:
			System.out.println("It is a weekend");
			break;
			
			default:
				System.out.println("None");
		
		
		}
		
	}
}
