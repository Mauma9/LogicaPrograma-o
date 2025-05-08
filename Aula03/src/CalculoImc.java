import java.util.Scanner;

public class CalculoImc {
	public static void main (String[] args) {
		//Variáveis
		double peso = 0;
		double altura = 0;
		double imc = 0;
		//Leitor teclado
		Scanner leitor = new Scanner(System.in);
		//captação de dados
		System.out.println("Digite seu peso");
		peso = leitor.nextDouble();
		System.out.println("Digite sua altura");
		altura = leitor.nextDouble();
		//fechar leitor
		leitor.close();
		//processamento
		imc = (peso / (altura * altura));
		//print
		System.out.println(" Você tem um imc de " + imc);
		//parametros
				if(imc < 18.5) {
					System.out.println("Abaixo do peso normal");
				} else if (imc >= 18.5 && imc < 24.9) {
					System.out.println("Peso normal");
				} else if (imc >= 25 && imc < 29.9) {
					System.out.println("Excesso de peso");
				} else if (imc >= 30 && imc < 34.9) {
					System.out.println("Excesso de peso");
				} else if (imc >= 30 && imc < 34.9) {
					System.out.println("Obesidade Nvl 1");
				}  else if (imc >= 35 && imc < 39.9) {
					System.out.println("Obesidade Nvl 2");
				} else if (imc > 40) {
					System.out.println("Obesidade Nvl 3");
				}
	}
}
