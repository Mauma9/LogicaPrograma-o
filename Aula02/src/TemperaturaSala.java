import java.util.Scanner;

public class TemperaturaSala {
	public static void main (String[] args) {
		//Captação de dados
		double tempC = 0;
		double tempF = 0;
		//Leitor do teclado
		Scanner leitor = new Scanner(System.in);
		//Questionário
		System.out.println("Digite a temperatura da sala em celcius");
		tempC = leitor.nextDouble();
		//fechar leitor
		leitor.close() ;
		//processamneto
		tempF = ((tempC / 5)* 9) + 32;
		//saída
		System.out.println("A temperatura em F° é: " + tempF);
		
		
	}
}
