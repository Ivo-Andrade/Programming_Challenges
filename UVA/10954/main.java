// Ivo de Andrade de Deus 8075238

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
	       Scanner sc = new Scanner(System.in);
	       int numInteiros = sc.nextInt();
	       
	       while( numInteiros != 0 ){
	    	   
	    	   ArrayList<Integer> lista = new ArrayList<Integer>(); ;
	    	   
	    	   for(int n = 0; n < numInteiros; n++){
	    		   
	    		   lista.add(sc.nextInt());
	    		   
	    	   }
	    	   
	    	   Collections.sort(lista);
	    	   
	    	   int custo = lista.remove(0) + lista.remove(0);
	    	   
	    	   if(numInteiros == 2) System.out.println(custo);
	    	   
	    	   else{
	    		   
	    		   lista.add(custo);
	    		   Collections.sort(lista);
	    		   
//	    		   System.out.println(" > " + custo);
	    		   
	    		   while(lista.size() > 1){
	    			   
	    			   int soma = lista.remove(0) + lista.remove(0);
	    			   custo = custo + soma;
		    		   lista.add(soma);
		    		   Collections.sort(lista);
		    		   
//		    		   System.out.println(" > " + custo);
	    			   
	    		   }
	    		   
	    		   System.out.println(custo);
	    		   
	    	   }
	    	   
	    	   numInteiros = sc.nextInt();
	    	   
	       }
	       
	       sc.close();
	       
       }
	       

}
