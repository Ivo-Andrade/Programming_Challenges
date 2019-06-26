import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

/* Barbara Albuquerque 9037585
** Ivo de Andrade de Deus 8075238
** Alan Michel Thomaz 8922052 */

class Grafo{
	
	int numAlunos;
	ArrayList<No> alunos = new ArrayList<No>();
	ArrayList<Boolean> visitado = new ArrayList<Boolean>();
	
	Grafo(int numAlunos){
		
		this.numAlunos = numAlunos;
		
	}
	
	void addAluno(No aluno){
		
		this.alunos.add(aluno);
		this.visitado.add(false);
		
	}
	
}

class No{
	
	int nome;
	ArrayList<Integer> amigos = new ArrayList<Integer>();
	int sala = -1;
	
	No(int nome){
		
		this.nome = nome - 1;
		
	}
	
	void addAmigo(int amigo){
		
		this.amigos.add(amigo - 1);
		
	}
	
	void addSala(int sala){
		
		this.sala = sala;
		
	}
	
}

public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int numAlunos = sc.nextInt();
		
		while(numAlunos != 0){
			
			Grafo sala = new Grafo(numAlunos);
			
			for(int i = 0; i < numAlunos; i++){
				
				No aluno = new No(sc.nextInt());
				sc.nextLine();
				String[] linha = sc.nextLine().split(" ");
				for(int j = 0; j < linha.length; j++){
					
					aluno.addAmigo(Integer.parseInt(linha[j]));
					
				}
				
				sala.addAluno(aluno);
				
			}
			
			boolean invalido = false;
			int atual = 0;
			int numSala = 1;
			sala.alunos.get(atual).addSala(numSala);
			sala.visitado.set(atual, true);
			LinkedList<Integer> pendentes = new LinkedList<Integer>();
			pendentes.add(atual);
			
			while(!invalido && pendentes.size() > 0){
				
				atual = pendentes.remove();
				numSala = sala.alunos.get(atual).sala;
				
				ArrayList<Integer> amigosAtual = sala.alunos.get(atual).amigos;
				
				for(int i = 0; i < amigosAtual.size(); i++){
					
					int amigo = amigosAtual.get(i);
					
					if(sala.visitado.get(amigo) == false){
						
						if(numSala == 1) sala.alunos.get(amigo).addSala(2);
						else sala.alunos.get(amigo).addSala(1);
						sala.visitado.set(amigo, true);
						pendentes.add(amigo);
						
					}
					
					else if(sala.alunos.get(amigo).sala == sala.alunos.get(atual).sala) invalido = true;
					
					else continue;
					
				}
				
				
			}
			
			if(!invalido) System.out.printf("SIM\n");
			else System.out.printf("NAO\n");
			
			numAlunos = sc.nextInt();
			
		}
		
		sc.close();
		
	}
	
}
