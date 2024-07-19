package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		sc.nextLine();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		
		for(int i=0; i < n; i++) {
			System.out.printf("Dados da %da pessoa: \n", (i + 1) );
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		double soma_altura = 0;
		for (int i=0; i < n; i++) {
			soma_altura += altura[i];
		}
		double media_altura = soma_altura / n;
		
		int count_menor_16  = 0;
		for(int i=0; i<n; i++) {
			if(idade[i] < 16) {
				count_menor_16  ++;
			}
		}
		double taxa = (double) count_menor_16  / n * 100;
		
		
		System.out.printf("Altura média: %.2f%n", media_altura);
		
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", taxa);
		sc.close();
	}

}
