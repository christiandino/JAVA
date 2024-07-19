/*
 * Fazer um programa para ler um número inteiro N e os dados (nome, e preço) de N Produtos.
 * Armazene os N produtos em um vetor. Em seguida, mostra o preço médio dos produtos.
 * 
 * */

package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos_Vetor;


public class Vetores_arrays_2 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		Produtos_Vetor[] vect = new Produtos_Vetor[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Produtos_Vetor(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum /vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}
	
}


