import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;


/* Barbara Albuquerque 9037585
** Ivo de Andrade de Deus 8075238
** Alan Michel Thomaz 8922052 */


class Estacao{

	ArrayList<Integer> linhas = new ArrayList<Integer>();
	boolean visitado;
	
	Estacao(){
		
		this.visitado = false;
		
	}
	
	public void addLinha(int destino) {
		
		this.linhas.add(destino);
		
	}
	
	public void setVisitado() {
		
		this.visitado = true;
		
	}

}


public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, Estacao> conjuntoEstacoes = new HashMap<Integer, Estacao>();
		
		int numEstacoes = sc.nextInt();
		int numLinhas = sc.nextInt();
		int testes = 1;
		
		while(numLinhas != 0 && numEstacoes != 0) {
			
			System.out.printf("Teste %d\n", testes);
			for(int i = 0; i < numEstacoes; i++) {
				
				Estacao estacao =  new Estacao();
				conjuntoEstacoes.put(i + 1, estacao);
				
			}
			
			for(int i = 0; i < numLinhas; i++) {
				
				int estacaoOrigem = sc.nextInt();
				int estacaoDestino = sc.nextInt();
				conjuntoEstacoes.get(estacaoOrigem).addLinha(estacaoDestino);
				conjuntoEstacoes.get(estacaoDestino).addLinha(estacaoOrigem);
				
			}
			
			
			if(verificaFalha(conjuntoEstacoes)) {
				
				System.out.printf("falha\n\n");
				testes++;
				
			}
			
			else {
				
				System.out.printf("normal\n\n");
				testes++;
				
			}
			
			conjuntoEstacoes.clear();
			numEstacoes = sc.nextInt();
			numLinhas = sc.nextInt();
			
		}
		
		sc.close();
		
	}
	
	public static boolean verificaFalha(HashMap<Integer, Estacao> conjuntoEstacoes) {
		
		conjuntoEstacoes.get(1).setVisitado();
		verificaFalhaRecursao(conjuntoEstacoes, 1);
		
		for(int i = 0; i < conjuntoEstacoes.size(); i++) {
			
			if(!conjuntoEstacoes.get(i+1).visitado) return true;
			
		}
		
		return false;
		
	}
	
	public static void verificaFalhaRecursao(HashMap<Integer, Estacao> conjuntoEstacoes, int atual) {
		
		for(Integer estacaoVizinha : conjuntoEstacoes.get(atual).linhas) {
			
			if(!conjuntoEstacoes.get(estacaoVizinha).visitado) {
				
				conjuntoEstacoes.get(estacaoVizinha).setVisitado();
				verificaFalhaRecursao(conjuntoEstacoes, estacaoVizinha);
				
			}
			
		}
		
	}

}
