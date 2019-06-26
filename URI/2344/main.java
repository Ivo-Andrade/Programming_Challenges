import java.io.IOException;
import java.util.Scanner;
/**
        Ivo de Andrade de Deus - 8075238
        Fabio Yukio Massuda - 9877996
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner (System.in);
    	int nota = scan.nextInt();
    	if(nota <= 0) System.out.println("E");
    	if(nota > 0 && nota <= 35) System.out.println("D");
    	if(nota > 35 && nota <= 60) System.out.println("C");
    	if(nota > 60 && nota <= 85) System.out.println("B");
    	if(nota > 85) System.out.println("A");
    }
 
}
