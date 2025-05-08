import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		//variaveis
		double saldo = 0;
		int op = 0;
		double val = 0;
		double saldoF = 0;
		//leitor
		Scanner leitor = new Scanner(System.in);
		//captação de dados
		System.out.println("Digite o saldo inicial");
		saldo = leitor.nextDouble();
		System.out.println("Digite o código da operação 1 para saque 2 para depósito");
		op = leitor.nextInt();
		System.out.println("Digite o valor movimentado");
		val = leitor.nextDouble();
		//fechar leitor
		leitor.close();
		//processamento
		if(op == 1) {
			saldoF = saldo - val;
		} else if (op == 2) {
			saldoF = saldo + val;
		} else {
			saldoF = saldo;
		}
		//saída 
		System.out.println("Seu saldo atual é de " + "R$" + saldoF);
	}
}
