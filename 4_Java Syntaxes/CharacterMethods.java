package javaLearning;

public class CharacterMethods {

	public static void main(String[] args) {
		char a='a';
		char b=' ';
		char c='1';
		char d='A';
		boolean result;
		char result2;
		String result3;
		result=Character.isLetter(a);
		System.out.println(result);
		result=Character.isLetter(c);
		System.out.println(result);
		result=Character.isDigit(c);
		System.out.println(result);
		result=Character.isWhitespace(b);
		System.out.println(result);
		result=Character.isUpperCase(a);
		System.out.println(result);
		result=Character.isLowerCase(a);
		System.out.println(result);
		result2=Character.toUpperCase(a);
		System.out.println(result2);
		result2=Character.toLowerCase(d);
		System.out.println(result2);
		result3=Character.toString(a);
		System.out.println(result3);
	}

}
