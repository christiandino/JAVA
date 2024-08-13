package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.exceptions.BusinessExceptions;

/*
 * Fazer um programa para ler os dados de uma conta bancária e depois realizar um
saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
saque da conta. 
 * */

public class POO_exercicio_Exception_ContaBancaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("TItular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo inicial: ");
		Double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		Double withdrawLimit = sc.nextDouble();
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		Double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.println("Novo saldo: " + String.format("%.2f", acc.getBalance()));
		}
		catch(BusinessExceptions e){
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
