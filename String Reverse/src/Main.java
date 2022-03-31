import java.util.*;
public class Main {

	public static String reverseString(String S) {
		String result;
		int stringLength = S.length();
		char[] temp = new char[stringLength];
		char[] reverseChar = new char[stringLength];
		
		for(int i=0;i<stringLength;i++) {
			temp[i]=S.charAt(i);
		}
		
		for(int i=0;i<stringLength;i++) {
			reverseChar[i]=temp[stringLength-1-i];
		}
		
		result = String.valueOf(reverseChar);
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string you want to reverse:");
		String S = scanner.nextLine();
		System.out.println(reverseString(S));

	}

}
