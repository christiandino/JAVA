package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		int i;
		for (i=0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] += sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for(i=0; i<n; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
