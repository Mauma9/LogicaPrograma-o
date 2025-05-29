import java.util.Scanner;

public class BinaryDecimal {
	public static void main(String[] args) {
		//Variables
		Scanner leitor = new Scanner(System.in);
		
		String binary = "";
		int decimal = 0;
		
		//Data entry
		System.out.println("type the binary number:");
		binary = leitor.next();
		leitor.close();
		
		//Data processing
		for(int i = 0 ; i < binary.length() ; i++) {
			decimal += (Integer.parseInt(binary.substring(i, i + 1)) * Math.pow(2, binary.length() - 1 -i));
			
		}
		
		//Output
		System.out.println("decimal " + decimal);
	}
}
