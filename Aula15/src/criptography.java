import java.io.BufferedReader;
import java.io.InputStreamReader;

public class criptography {
	public static void main(String[] args) {
		//Variables
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		String texto = "";
		String criptograma = "";
		
		//Data Entry
		try {
			System.out.println("Digite o texto");
			texto = leitor.readLine();
			
	} catch(Exception erro) {}
	
		//Data processing
		criptograma = encriptar(texto);
		
		//Output
		System.out.println(criptograma);
	}
	
	private static String encriptar(String texto) {
		String retorno = "";
		
		for(int i = 0 ; i < texto.length(); i++) {
			int letraOriginal = texto.charAt(i);
			int letraEncriptada = (letraOriginal + 13);
			
			if((letraOriginal < 97) || (letraOriginal > 122)) {
				letraEncriptada = letraOriginal;
			} else
			if( letraEncriptada > 122) {
				letraEncriptada -= 26;
			} 
			
			retorno += ((char)letraEncriptada);
		}
		
		return retorno;
	}
}
