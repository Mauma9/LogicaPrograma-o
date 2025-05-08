import java.util.Scanner;

public class TipoTriangulo {
	public static void main(String[] args) {
		//variaveis
		int ang1 = 0;
		int ang2 = 0;
		int ang3 = 0;
		//leitor
		Scanner leitor = new Scanner(System.in);
		//captação de dados
		System.out.println("Digite o ângulo 1");
		ang1 = leitor.nextInt();
		System.out.println("Digite o ângulo 2");
		ang2 = leitor.nextInt();
		System.out.println("Digite o ângulo 3");
		ang3 = leitor.nextInt();
		//fechar leitor
		leitor.close();
		//processamento
		if ((ang1 + ang2 + ang3) != 180) {
			System.out.println("N/A");
		} else if (ang1 <= 0 || ang2 <= 0 || ang3 <= 0) {
			System.out.println("Erro");
		}else if ((ang1 == 90) || (ang2 == 90) || (ang3 == 90)) {
			System.out.println("Obtusângulo");
		} else if (ang1 > 90 || ang2 > 90 || ang3 > 90) {
			System.out.println("Obtusângulo");
		} else  {
			System.out.println("Acutangulo");
		}
	}
}
