import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaskedEntry {
	//Declaração de funções
	/*int somar(int nmr1, int nmr2) 
	{
		int resultado;
		
		
		return resultado;
	}*/

	static int lerNumeroInteiro() 

	{
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		int retorno = 0;
		boolean continuar = false;
		
		do {
			try {
				System.out.println("digite um numero inteiro");
				retorno = Integer.parseInt(leitor.readLine());
				continuar = false;
			} catch(Exception erro) {
				System.out.println("erro");
				continuar = true;
			}
		} while(continuar);
		return retorno;
	}
	
	static double lerNumeroFracionario() 

	{
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		double retorno = 0;
		boolean continuar = false;
		
		do {
			try {
				System.out.println("digite um numero fracionado");
				retorno = Double.parseDouble(leitor.readLine());
				continuar = false;
			} catch(Exception erro) {
				System.out.println("erro");
				continuar = true;
			}
		} while(continuar);
		return retorno;
	}
	
	static String lerTextoTamanhoFixo(int tamanho) 

	{
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		String retorno = "";
		
		do 
		{
			try 
			{
			System.out.println("digite um texto do tamanho " + tamanho + ":");
			retorno = leitor.readLine();
			} catch (Exception erro) {}
		} while(retorno.length() != tamanho);
		return retorno;
	}
	
	//Metodo principal de execução da classe
		public static void main(String[] args) {
			//declaração de variaveis
			int a = 0;
			double b = 0;
			int tamanho = 0;
			BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
			//entrada de dados
			a = lerNumeroInteiro();
			//output
			System.out.println(a);
			//entrada de dados
			b = lerNumeroFracionario();
			//output
			System.out.println(b);
			//entrada de dados
			try {
				System.out.println("Digite o tamanho do texto: ");
				tamanho = Integer.parseInt(leitor.readLine());
			} catch(Exception erro) {
				System.out.println("erro");
			}
			lerTextoTamanhoFixo(tamanho);
		}
	
	
	
	
	
}
