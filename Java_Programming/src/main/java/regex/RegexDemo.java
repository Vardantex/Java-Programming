package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	
	public static void main(String[] args) {
		
//		Potentially could use Pattern.compile()
		Pattern pattern = java.util.regex.Pattern.compile("RegEX", java.util.regex.Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher("Regular Expression");
		
		boolean matchFound = matcher.find();
		
		if(matchFound) {
			
			System.out.println("Match not found");
		} else {
			System.out.println("Match is found");
		}
		
		
	}
}
