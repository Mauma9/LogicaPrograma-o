import java.util.Scanner;

public class SerieTaylor {
	public static void main(String[] args) {
		//declaração de variaveis
		Scanner leitor = new Scanner(System.in);
		
		double expoente = 0;
		double potencia = 1;
		double fatorial = 1;
		double resultado = 0;
		
		//entrada de dados
		System.out.println("digite o expoente");
		expoente = leitor.nextDouble();
		
		//fechar leitor
		leitor.close();
		
		//processamento
		for (int i = 0 ; i < 100 ; i++) {
			for (int j = 0 ; j < i ; j++) {
				potencia *= expoente;
			}
			for(double j = i ; j > 0 ; j--) {
				fatorial *= j;
			}
			
			
			resultado += (potencia / fatorial);
			potencia = 1;
			fatorial = 1;
			
		}
		System.out.println("e^" + expoente + "pelo java: " + Math.pow(Math.E, expoente));
		System.out.println("e^" + expoente + "pelo Taylor: " + resultado);
	}
}
