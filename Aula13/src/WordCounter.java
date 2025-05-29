import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int counter = 0;
		int position = 0;
		String text = "";
		String search = "";
		
		//Data entry
		System.out.println("type a text:");
		text = leitor.nextLine();
		System.out.println("type what do you want to search: ");
		search = leitor.nextLine();
		leitor.close();
		
		//data Processing
		do {
			position = text.indexOf(search, position);
			if (position > -1) {
				counter++;
				position++;
			}
		}while (position > 0);
		
		//Output
		System.out.println(counter + " times");
	}
}
