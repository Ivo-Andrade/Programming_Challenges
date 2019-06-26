import java.util.Scanner;
import java.util.HashSet;

/* Barbara Albuquerque 9037585
** Ivo de Andrade de Deus 8075238
** Alan Michel Thomaz 8922052 */

public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int frases = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < frases; i++){
			
			String frase = sc.nextLine();
			HashSet<Character> alfabeto = new HashSet<Character>();
			
			for(int j = 0; j < frase.length(); j++){
				
				char letra = frase.charAt(j);
				if(letra != ' ' && letra != ','){
					
					if(!alfabeto.contains(letra))
						alfabeto.add(letra);
					
				}
				
			}
			
			if(alfabeto.size() == 26) System.out.printf("frase completa\n");
			else if(alfabeto.size() >= 13) System.out.printf("frase quase completa\n");
			else System.out.printf("frase mal elaborada\n");
			
		}
		
		sc.close();
		
	}
	
}
