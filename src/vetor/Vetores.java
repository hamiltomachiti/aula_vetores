package vetor;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		int[] x = new int[4];
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < x.length;i++)
		{
			x[i] = entrada.nextInt();
		}
		
		for(int i = 0; i < x.length; i++)
		{
			System.out.println("x["+i+"]="+x[i]);
		}
		
		System.out.println("Olá");
		//0 1 2 3 4		
	}

}
