package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

/*
 * A dona de um pensionato possui 10 quartos para alugar para estudantes, sendo que esses quartos identificados pelos números de 0 a 9.
 * 
 * Fazer um programa que inicie com todos os 10 quartos vazios, e depois leia uma quantidade N representando o número de estudantes que 
 * vão alugar os quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, informar
 * o nome e email do estudante, bem como qual dos quartos ele escolheu ( de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final,
 * seu programa deve imprimir um relatório de todas ocupações do pensionato, por ordem de quarto, conforme  exemplo.
 * 
 * */

public class Pensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine(); // usado para limpar o buffer
			String name = sc.nextLine(); // armazenando o nome
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();

			vect[roomNumber] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
		
	}

}
