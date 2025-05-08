import java.util.Scanner;

public class AumentoSalario {
	public static void main (String[] args) {
		//variaveis
		int cargo = 0;
		double salario = 0;
		double nSalario = 0;
		//leitor
		Scanner leitor = new Scanner(System.in);
		//captação de dados
		System.out.println("Digite o código do seu cargo");
		cargo = leitor.nextInt();
		System.out.println("Digite o seu salário");
		salario = leitor.nextDouble();
		//fechar leitor
				leitor.close();
		//processamento
				if (cargo == 1) {
					nSalario = (salario * 1.1);
				} else if(cargo == 2) {
					nSalario = (salario * 1.15);
				} else if(cargo == 3) {
					nSalario = (salario * 1.25);
				} else System.out.println("Vati");
		//print
				System.out.println("Seu novo salário é " + nSalario);		
	}
}
//amd
