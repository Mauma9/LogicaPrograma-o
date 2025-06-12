import java.util.Scanner;

public class StringManipulation {
	public static void main(String[] args) {
		//Variables
		Scanner leitor = new Scanner(System.in);
		String text = "";
		String remove = "";
		leitor.close();
		
		//Data entry
		System.out.println("type a text:");
		text = leitor.nextLine();
		
		System.out.println("type what do you want to remove:");
		remove = leitor.nextLine();
		//Data Processing
		System.out.println("First letter: " + text.substring(0,1));
		
		System.out.println("Last letter: " + text.substring(text.length() - 1));
		
		System.out.println("text Length: " + text.length());
		
		System.out.println("to Upper Case: " + text.toUpperCase());
		System.out.println("to Lower Case: " + text.toLowerCase());
		
		System.out.println("removed: " + text.replaceAll(remove, ""));
	}
}