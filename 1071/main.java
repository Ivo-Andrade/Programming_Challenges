import java.util.Scanner;

class Main{
	
	static int soma (int a, int b){
		if(a-b>0){
			int aux = a;
			a = b;
			b = aux;
		}
		if (a%2 == 0) a++;
		else a+=2;
		int soma = 0;
		for(int n = a; n< b; n+=2) soma = soma + n;
		return soma;
	}
	public static void main(String[]args){
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		System.out.println(soma(a, b));
	}
}
