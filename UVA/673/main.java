// Ivo de Andrade de Deus 8075238

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
	       Scanner sc = new Scanner(System.in);
	       int numCasos = sc.nextInt();
	       sc.nextLine();
	       
	       for( int n = 0; n < numCasos; n++) {

	    	   String linha = sc.nextLine();
	    	   if(linha == ""){
	    		   System.out.println("Yes");
	    		   continue;
	    	   }
	    	   
	    	   char atual;
	    	   ArrayList<Character> pilha = new ArrayList<Character>();
	    	   
	    	   for(int i = 0; i < linha.length(); i++){
	    		   
	    		   atual = linha.charAt(i);
	    		   if(pilha.size() == 0){
	    			   pilha.add(atual);
	    		   }
	    		   else if(atual == ')' && (pilha.get(pilha.size() - 1)) == '('
	    				   || atual == ']' && (pilha.get(pilha.size() - 1)) == '['){
	    			   pilha.remove(pilha.size() - 1);
	    		   }
	    		   else{
	    			   pilha.add(atual);
	    		   }
	    			   
	    		   }
	    		
	    	   if(pilha.size() == 0) System.out.println("Yes");
	    	   else System.out.println("No");
	    	   
	    	   }
	    	   
	       sc.close();
	       
       }
	       

}
