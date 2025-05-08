import java.util.Scanner;

public class VolEsfera {
	public static void main (String[] args) {
		//Captação de dados
		double raio = 0;
		double volume = 0;
		Scanner leitor = new Scanner(System.in);
		//Questionário
		System.out.println("Digite o raio");
		raio = leitor.nextDouble();
		//fechar leitor
		leitor.close();
		//saída de dados
		volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;
		System.out.println("volume é " + volume);
	}
}
