import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Barbara Albuquerque 9037585
 * Ivo de Andrade de Deus 8075238
 * Alan Michel Thomaz 8922052
 **/

public class Main {
	
	public static void main (String[] args) throws IOException{
		
		Scanner scan = new Scanner (System.in);
		int inicio, fim;
		String atual;
		int tamanho;
		int contador;
		boolean contem = false;
		while(scan.hasNextInt()){
			
			inicio = scan.nextInt();
			fim = scan.nextInt();
			contador = 0;
			contem = false;			
			
			for(int i = inicio; i <= fim; i++){
				
				Map<Character, Character> algorismos = new HashMap<Character, Character>();
				atual = Integer.toString(i);
				tamanho = atual.length();
				if (tamanho == 1){
					contador++;
					continue;
				}
				else{
					for(int j = 0; j < tamanho; j++){
						contem = algorismos.containsKey(atual.charAt(j));
						if(contem){
							break;
						}
						else{
							algorismos.put(atual.charAt(j), atual.charAt(j));
						}
					}
					if(!contem) contador++;
					continue;
				}
			}
			
			System.out.println(contador);
			
		}
		scan.close();
		
	}

}
