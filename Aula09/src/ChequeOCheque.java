import java.util.Scanner;

public class ChequeOCheque {
	public static void main(String[] args) {
		//declaração dde variaveis
				double valorLote = 0;
				int qtdCheques = 0;
				double somaValorCheques = 0;
				int contadorCheques = 0;
				//leitor
				Scanner leitor = new Scanner(System.in);
				//entrada de dados
				System.out.println("digite a quantidade de cheques no lote");
				qtdCheques = leitor.nextInt();
				System.out.println("digite o valor do lote");
				valorLote = leitor.nextDouble();
				do {
					System.out.println("digite o valor do cheque");
					somaValorCheques += leitor.nextDouble();
					contadorCheques++;
					System.out.println("Digite <0> se houver mais cheques ou <1> para sair");
				}  while (leitor.nextInt() == 0);
		//fechar leitor
		leitor.close();
		//processamento
		if ((qtdCheques == contadorCheques) && (valorLote == somaValorCheques))
		{
			System.out.println("Lote Valido");
		} else {
			System.out.println("Fudeu");
		}
		
	}
}
