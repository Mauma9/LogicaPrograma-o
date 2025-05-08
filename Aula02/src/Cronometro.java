import java.util.Scanner;

public class Cronometro {
	public static void main (String[] args) {
		//Captação de dados
		int horas = 0;
		int minutos = 0 ; 
		int segundos = 0;
		int total = 0;
		Scanner leitor = new Scanner(System.in);
		//Questionário
		System.out.println("Digite as horas");
		horas = leitor.nextInt();
		System.out.println("Digite os minutos");
		minutos = leitor.nextInt();
		System.out.println("Digite os segundos");
		segundos = leitor.nextInt();
		//fechar leitor
		leitor.close();
		//processamento
		total = (horas * 3600) + (minutos * 60) + segundos;
		System.out.println("quantidade de segundos: " + total);
	}
}