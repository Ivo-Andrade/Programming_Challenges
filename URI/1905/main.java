import java.util.Scanner;

/* Barbara Albuquerque 9037585
** Ivo de Andrade de Deus 8075238
** Alan Michel Thomaz 8922052 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int[][] labirinto = new int[5][5];
				
		for(int i = 0; i < casos; i++){
			
			for(int j = 0; j < 5; j++){
				for(int l = 0; l < 5; l++){
					labirinto[j][l] =  sc.nextInt();
				}
			}
			
			if(labirinto[0][0] == 1){
				System.out.println("ROBBERS");
				continue;
			}
			
			if(escapeLabirinto(labirinto, 0 , 0)){
				System.out.println("COPS");
			}
			
			else System.out.println("ROBBERS");
			
		}
		
	}
	
	static boolean escapeLabirinto(int labirinto[][], int x, int y){
		
		if(x == 3 && y == 4 || x == 4 && y == 3) return true;
		labirinto[x][y] = 1;
		if(y + 1 < 5 && labirinto[x][y+1] == 0 && escapeLabirinto(labirinto, x, y+1)) return true;
		else if(x + 1 < 5 && labirinto[x+1][y] == 0 && escapeLabirinto(labirinto, x+1, y)) return true;
		else if(y - 1 >= 0 && labirinto[x][y-1] == 0 && escapeLabirinto(labirinto, x, y-1)) return true;
		else if(x - 1 >= 0 && labirinto[x-1][y] == 0 && escapeLabirinto(labirinto, x-1, y)) return true;
		labirinto[x][y] = 0;
		return false;
	}
}
