package MT1;
import java.util.regex.Matcher;//importing Matcher
import java.util.regex.Pattern;//importing Patern

//Regular expressions are used to pattern matching things 

public class regularExpression{
	public static void main( String[] args){
		// String to be scanned to find the pattern.
		String line = "I am NOT DOG right?";
		String pattern = "(DOG)";//pattern that need to search
		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);
		// Now create matcher object.
		Matcher m = r.matcher(line);
		if (m.find( )) {//m is a matching object,m.find do search is there a pattern in the line
			System.out.println("Found value: " + m.group(0) );//if true we access that by group method
		} 
		else {
			System.out.println("NO MATCH");
		}
	}
}
