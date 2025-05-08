import java.util.Scanner;

public class CompBordoCarro {
	public static void main (String[] args) {
		//variaveis
		double distancia = 0;
		double tempo = 0;
		double consumo = 0;
		double velMedia = 0;
		double autonomia = 0;
		//leitor teclado
		Scanner leitor = new Scanner(System.in);
		//captação de dados
		System.out.println("Digite a distancia da viagem");
		distancia = leitor.nextDouble();
		System.out.println("Digite o tempo gasto");
		tempo = leitor.nextDouble();
		System.out.println("Digite o consumo médio do carro");
		consumo = leitor.nextDouble();
		//fechar leitor
		leitor.close();
		//processameto
		velMedia = (distancia / tempo);
		autonomia = (distancia / consumo);
		//print
		System.out.println("A velocidade média é de " + velMedia + " Km/h");
		System.out.print(" com a autonomia de " + autonomia + " Km ");
	}
}
