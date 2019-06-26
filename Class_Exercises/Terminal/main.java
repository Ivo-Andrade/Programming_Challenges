import java.util.Scanner;

public class Main {

	//TODO : DADOS DO TERMINAL, nao esqueca de inicializa-los (se necessario)
	static char[][] terminal = new char[10][10];
	static int cursorX = 0;
	static int cursorY = 0;
	static boolean modoDeSobrescrita = true;

	public static void main (String args[]) 
	{
		Scanner scan = new Scanner (System.in);
		int N = scan.nextInt();
		int numeroDoTeste = 1;
		while (N != 0){
			String linha = scan.nextLine();
			iniciarTerminal();
			cursorX = 0;
			cursorY = 0;
			System.out.println("Case " + numeroDoTeste);
			for (int contLinhas = 0; contLinhas < N; contLinhas++){
				linha = scan.nextLine();
				executar(linha);
			}
			imprimirTerminal();
			N = scan.nextInt();
			numeroDoTeste++;
		}
	}		  	

	static void iniciarTerminal(){
		// TODO  metodo sugerido, nao use se nao quiser
		int i; int j;
		for(i = 0; i <= 9; i++) {
			for(j = 0; j <= 9; j++) {
				terminal[i][j] = ' ';
			}
		}
	}

	static void imprimirTerminal(){
		System.out.println("+----------+");
		for (int i=0;i<10;i++){
			System.out.print("|");
			for (int j=0;j<10;j++){
				System.out.print(terminal[i][j]);
			}
			System.out.println("|");
		}
		System.out.println("+----------+");
	}


	static void executar(String linha){
		// TODO DICA: criar metodos auxiliares para cada operacao
            /* uma maneira de se pegar um dado caracter eh assim: char atual = linha.charAt(i);
             caracteres sao comparados usando aspas simples e nao duplas: if (atual == '^'){
             para limpar o terminal é necessario inserir espacos em branco nele: ' ' (note que este nao eh o valor padrao de um char recem inicializado) */
		int contLinha; char leitura;
		for(contLinha = 0; contLinha < linha.length(); contLinha++) {
			leitura = linha.charAt(contLinha);
			if(leitura != '^') {
				cursorY = insereCaractere(leitura, cursorX, cursorY);
			}
			else {
				contLinha++;
				leitura = linha.charAt(contLinha);
				switch(leitura) {
				
				case 'b':
					cursorY = 0;
					break;
					
				case 'c':
					iniciarTerminal();
					break;
					
				case 'd':
					if(cursorX < 9) cursorX++;
					break;
					
				case 'e':
					for(int tempCol = cursorY; tempCol <= 9; tempCol++)
						terminal[cursorX][tempCol] = ' ';
					break;
					
				case 'h':
					cursorX = 0;
					cursorY = 0;
					break;
					
				case 'i':
					modoDeSobrescrita = false;
					break;
					
				case 'l':
					if(cursorY > 0) cursorY--;
					break;
					
				case 'o':
					modoDeSobrescrita = true;
					break;
					
				case 'r':
					if(cursorY < 9) cursorY++;
					break;
					
				case 'u':
					if(cursorX > 0) cursorX--;
					break;
					
				case '^':
					cursorY = insereCaractere('^', cursorX, cursorY);
					break;
					
				case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9': 
					cursorX = Character.getNumericValue(leitura);
					contLinha++;
					leitura = linha.charAt(contLinha);
					cursorY = Character.getNumericValue(leitura);
					break;
				
				default:
					break;
					
				}
			}
		}
	}

	static int insereCaractere(char leitura, int contLin, int contCol) {
		if(modoDeSobrescrita) {
			terminal[contLin][contCol] = leitura;
		}
		else {
			char temp;
			for(int tempCol = contCol; tempCol <= 9; tempCol++) {
				temp = terminal[contLin][tempCol];
				terminal[contLin][tempCol] = leitura;
				leitura = temp;
			}
		}
		if(contCol < 9) contCol++;
		return contCol;
	}
}
