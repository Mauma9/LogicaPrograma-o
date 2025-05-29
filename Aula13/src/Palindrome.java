import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		//Variables
		Scanner leitor = new Scanner(System.in);
		String text = "";
		boolean palindrome = true;
		
		//Data entry
		System.out.println("type a text:");
		text = leitor.nextLine();
		
		leitor.close();
		
		//Data processing
		text = text.toUpperCase();
		text = text.replaceAll(" ", "");
		text = text.replaceAll("-", "");
		text = text.replaceAll(",", "");
		text = text.replaceAll("\\.", "");
		for(int i = 0; i < (text.length()/2) ; i++) {
			if(text.charAt(i) != text.charAt(text.length() - 1 - i)) {
				palindrome = false;
			}
		}
		
		
		if(palindrome) {
			System.out.println("positive");
		} else {
			System.out.println("negative");
		}
	}
}
