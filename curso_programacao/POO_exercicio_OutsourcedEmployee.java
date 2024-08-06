package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class POO_exercicio_OutsourcedEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		Employee emp_out = new OutsourcedEmployee();
		
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		for(int i=1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.println("Outsourced (y/n)? ");
			String outsourced = sc.nextLine();
			if (outsourced == "n") {
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Hours: ");
				Integer hours = sc.nextInt();
				System.out.println("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				emp = new Employee(name, hours, valuePerHour);
			}
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Hours: ");
			Integer hours = sc.nextInt();
			System.out.println("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.println("Value per hour: ");
			Double additionalCharge = sc.nextDouble();
			emp_out = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
			
		}
		
		sc.close();

	}

}
