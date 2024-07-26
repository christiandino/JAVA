package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

/*
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve haver repetição de id.
 * 
 * Em Seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
 * Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e aboradar a operação. Ao final, mostrar a listagem
 * atualizada dos funcionários, conforme exemplos.
 * 
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário pode ser aumentado com base
 * em uma operação de aumento por porcentagem dada.
 * 
 * */

public class Exercicio_Listas_Employee2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee2> list = new ArrayList<>();
		
		System.out.print("How many employees will be registred? ");
		int n = sc.nextInt();
		
		// pegando os dados dos funcionarios
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee2 emp = new Employee2(id, name, salary);
			list.add(emp);
			
			//list.add(new Employee2(id, name, salary));
				
		}
		
        // dando aumento para os funcionarios 
		
		System.out.println("---------------------");
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter de percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// imprimindo a lista dos funcionarios apos o aumento do salario
		
		System.out.println("---------------------");
		System.out.println("List of employees");
		for(Employee2 obj : list) {
			System.out.println(obj);
		}
		
			
		sc.close();
	}
		
	public static boolean hasId(List<Employee2> list, int id) {
		Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
