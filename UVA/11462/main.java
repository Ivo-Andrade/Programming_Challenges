// Ivo de Andrade de Deus 8075238

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
	       Scanner sc = new Scanner(System.in);
	       int numPessoas = sc.nextInt();
	       
	       while( numPessoas != 0 ){
	    	   
	    	   ArrayList<Integer> lista = new ArrayList<Integer>(); ;
	    	   
	    	   for(int n = 0; n < numPessoas; n++){
	    		   
	    		   lista.add(sc.nextInt());
	    		   
	    	   }
	    	   
	    	   Collections.sort(lista);
	    	   
	    	   int aux = 1;
	    	   
	    	   for (Integer idade : lista) {
	    	       
	    		   System.out.print(idade);
	    		   if(aux != numPessoas){
	    			   System.out.print(" ");
	    			   aux++;
	    		   }
	    		   
	    	   }
	    	   
	    	   System.out.println();
	    	   
	    	   numPessoas = sc.nextInt();
	    	   
	       }
	       
	       sc.close();
	       
       }
	       

}
