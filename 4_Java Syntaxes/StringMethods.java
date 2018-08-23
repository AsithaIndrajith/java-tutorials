package javaLearning;

//StringBuffer and StringBuilder methods
//String methods

public class StringMethods {

	public static void main(String[] args) {
		//creating StringBuffer
		//StringBuffer Methods
		StringBuffer sBuffer=new StringBuffer("Hello");
		System.out.println("StringBuffer:"+sBuffer);//
		
		sBuffer.append("World");//append string to string buffer 
		System.out.println("sBuffer.append(\"World\"):"+sBuffer);
		sBuffer.reverse();//reverse sting buffer
		System.out.println("sBuffer.reverse():"+sBuffer);
		sBuffer.delete(6,7);//delete range of sting buffer
		System.out.println("sBuffer.delete(6,7):"+sBuffer);
		sBuffer.insert(9,"Doggy");//insert string at a point
		System.out.println("sBuffer.insert(9,\"Doggy\"):"+sBuffer);
		sBuffer.replace(9,16,"Kitty");//replace string with another
		System.out.println("sBuffer.replace(9,16,\"Kitty\"):"+sBuffer);
		System.out.println("sBuffer.capacity():"+sBuffer.capacity());//print string buffer capacity
		System.out.println("sBuffer.charAt(0):"+sBuffer.charAt(0));//return character at index
		System.out.println("sBuffer.indexOf(\"t\"):"+sBuffer.indexOf("t"));//return index of string
		System.out.println("sBuffer.indexOf(\"t\",14):"+sBuffer.indexOf("t",14));
		System.out.println("sBuffer.lastIndexOf(\"t\"):"+sBuffer.lastIndexOf("t"));
		System.out.println("sBuffer.lastIndexOf(\"t\",14):"+sBuffer.lastIndexOf("t",14));
		System.out.println("sBuffer.length():"+sBuffer.length());//return length
		sBuffer.setCharAt(12,'Y');//set character at some index
		System.out.println("sBuffer.setCharAt(12,'Y'):"+sBuffer);
		sBuffer.setLength(20);//change string buffer's length
		System.out.println("sBuffer.setLength(20):"+sBuffer.length());
		sBuffer.toString();//convert string buffer to a string
		System.out.println("sBuffer.toString():"+sBuffer);
		
		
		//Concatenate Strings
		String s1="Hi";
		String s2="Kitty";
		String s3;
		s3=s1.concat(s2);
		System.out.println("\"Hi\".concat(\"Kitty\"):"+s3);
		
		//String Methods
		String text="Hello World";
		String text_2=new String("Hello World");
		String text_3="come";
		
		System.out.println("\"Hello World\".charAt(0):"+text.charAt(0));//return character at the index
		System.out.println("\"Hello World\".compareTo("+text_2+"<object>):"+text.compareTo(text_2));//compare with string object
		System.out.println("\"Hello World\".compareTo("+text_2+"):"+text.compareTo(text));//compare with string
		System.out.println("\"Hello World\".compareToIgnoreCase("+text+"):"+text.compareToIgnoreCase(text));
		System.out.println("\"Hello World\".concat("+text_3+"):"+text.concat(text_3));
		System.out.println("\"Hello World\".hashCode()"+":"+text.hashCode());
		System.out.println("\"Hello World\".indexOf('H')"+":"+text.indexOf('H'));
		System.out.println("\"Hello World\".indexOf('H',0)"+":"+text.indexOf('H',0));
		System.out.println("\"Hello World\".indexOf('World')"+":"+text.indexOf("World"));
		System.out.println("\"Hello World\".indexOf('World',0)"+":"+text.indexOf("World",0));
		System.out.println("\"Hello World\".replace('H','h')"+":"+text.replace('H','h'));
		System.out.println("\"Hello World\".replace(\"Hello\",\"Hy\")"+":"+text.replaceAll("Hello","Hy"));//replaces a whole string
		System.out.println("\"Hello World\".replaceFirst(\"Hello\",\"Hy\")"+":"+text.replaceFirst("Hello","Hy"));//replaces first occurrence
		
		String[] splitArray=text.split(" ");
		System.out.print("\"Hello World\".split(\" \",1):");//this split around the pattern given and return string array
		for(int i=0;i<splitArray.length;i++) {
			System.out.print(splitArray[i]);
		}
		System.out.println("");
		
		System.out.println("\"Hello World\".startsWith(\"H\")"+":"+text.startsWith("H"));//return true if the string starts with what we look
		System.out.println("\"Hello World\".substring(2,7)"+":"+text.substring(2,7));//return substring in that range
		System.out.println("\"Hello World\".toLowerCase()"+":"+text.toLowerCase());
		System.out.println("\"Hello World\".toUpperCase()"+":"+text.toUpperCase());
	}

}
