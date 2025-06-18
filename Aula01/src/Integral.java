import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Integral {
	
	static double function(double x) {
		
		return x * x + 45 * x / Math.sin(x) + Math.pow(2, x)/ (1 -x) ;
	}
	
	
	static double integrar(double inicio, double fim){
		
		double retorno = 0;
		double incremento = 0.001;
		for(double i = inicio ; i < fim ; i+=incremento) {
			retorno += ((incremento)* function(((2*i)+incremento)/2));
		}
		return retorno;
	}
	public static void main(String[] args) {
		
		//variables
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		double inicio = 0;
		double fim = 0;
		
		//data entry
		try {
			System.out.println("Digite o inicio");
			inicio = Double.parseDouble(leitor.readLine());
			
	} catch(Exception erro) {}
		
		try {
			System.out.println("Digite o fim");
			fim = Double.parseDouble(leitor.readLine());
			
	} catch(Exception erro) {}
		
		//procssamento
		
		System.out.println("resultado:" + integrar(inicio, fim));
	}
}
