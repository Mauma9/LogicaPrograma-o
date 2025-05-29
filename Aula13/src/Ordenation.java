import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ordenation {
	public static void main(String[] args) {
		//Variables
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		String[] vetor = new String[10];
		
		//Data entry
		try {
		for(int i = 0 ; i < vetor.length ; i ++) {
			System.out.println("type the index text " + i + ": ");
			vetor[i] = leitor.readLine();
			
		}
		}catch(Exception erro) {
			System.out.println("erro");
		}
		
		//Data processing
		//for externo: do primeiro ao penultimo for interno do proximo ao último
		for(int i = 0 ; i < vetor.length - 1 ; i++) {
			for(int j = (i + 1) ; j < vetor.length ; j++) {
				if(vetor[i].compareTo(vetor[j]) > 0) {
					String temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
			}
		}
		//Output
		for(int i = 0 ; i < vetor.length ; i ++) {
			System.out.println(vetor[i]);
		}
	}
}