package MT1;
import java.util.regex.Matcher;//importing Matcher
import java.util.regex.Pattern;//importing Patern

public class regularExpression{
	public static void main( String[] args){
		// String to be scanned to find the pattern.
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(QT3)";//pattern that need to search
		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);
		// Now create matcher object.
		Matcher m = r.matcher(line);
		if (m.find( )) {
			System.out.println("Found value: " + m.group(0) );
		} 
		else {
			System.out.println("NO MATCH");
		}
	}
}