import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.script.Invocable;

/**
*  Ivo de Andrade de Deus 8075238
*  Barbara Alburquerque 9037585
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
    	
    	Map<Integer, Integer> quadrados = new HashMap<Integer, Integer>();
    	for(int i = 0; i < 101; i++) {
    		quadrados.put(i, i*i);
    	}
    	
    	Scanner scan = new Scanner (System.in);
    	int entrada;
    	int entrada2;
    	boolean primeiroCaso = true;
    	while(scan.hasNextLine()) {
    		
    		if(primeiroCaso){
    			//System.out.println();
    			primeiroCaso = false;
			}
			else{
			}
    		
    		entrada = Integer.parseInt(scan.nextLine());
    		if(entrada < 0) {
    			System.out.println("NO");
    			continue;
    		}
    		for(int i = 0; i < 101; i++) {
    			entrada2 = entrada - quadrados.get(i);
    			if(entrada2 < 0) {
    				System.out.println("NO");
    				break;
    			}
    			else {
    				if(quadrados.containsValue(entrada2)) {
    					System.out.println("YES");
    					break;
    				}
    			}
    		}
    	}
    	return;
    }
 
}
