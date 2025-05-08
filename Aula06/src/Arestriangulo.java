import java.util.Scanner;

public class Arestriangulo {
public static void main(String[] args) {
		//variaveis
		int ladoA = 0;
		int ladoB = 0;
		int ladoC = 0;
		//leitor
		Scanner leitor = new Scanner(System.in);
		//captação de dados
		System.out.println("Digite o tamanho do lado A");
		ladoA = leitor.nextInt();
		System.out.println("Digite o tamanho do lado B");
		ladoB = leitor.nextInt();
		System.out.println("Digite o tamanho do lado C");
		ladoC = leitor.nextInt();
		//fechar leitor
		leitor.close();
		//processamento
		if (ladoA == ladoB && ladoC == ladoB) {
			System.out.println("Triângulo Equilatero");
		} else if (ladoA == ladoB || ladoC == ladoB || ladoA == ladoC) {
			System.out.println("Triângulo Isoceles");
		} else 
			System.out.println("Triângulo Escaleno");
	}
}
