package curso_programacao;

/*
 * Uma empresa possui funcionários próprios e terceirizados.
 * Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora.
 * Funcionário terceirizado possuem ainda uma despesa adicional.
 * 
 * O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas,
 * sendo que os funcionários terceirizados ainda recebem um bonus correspondente a 110% de sua despesa adicional.
 * 
 * Fazer um programa para ler os dados de N funcionário ( N fornecido pelo usuário) e armazená-los em uma lista.
 * Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class POO_exercicio_OutsourcedEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee> todos = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		sc.nextLine(); // Consumir a nova linha pendente após nextInt()
		for(int i=1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			//sc.nextLine(); // Consumir a nova linha pendente após next()
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y'){
				System.out.println("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				todos.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				todos.add(new Employee(name, hours, valuePerHour));
				
			}
			
		}
		
		System.out.println("PAYMENTS: ");

		for (Employee emp: todos) {
			System.out.println(emp);
		}
		
		sc.close();

	}

}
