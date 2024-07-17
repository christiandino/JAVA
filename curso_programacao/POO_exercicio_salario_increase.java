/*
 * 
 * Fazer uma programa para ler os dados de um funcionário (nome, salario bruto e imposto).
 * Em seguida, mostrar os dados do funcionário (nome e salário líquido).
 * Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem)
 * e mostrar novamente os dados do funcionário.  * 
 * 
 * 
 * */

package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class POO_exercicio_salario_increase {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee funcionario = new Employee();
		
		System.out.print("Digite o nome do funcionário: ");
		funcionario.name = sc.nextLine();
		
		System.out.print("Digite o salário: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.print("Digite o Tax: ");
		funcionario.Tax = sc.nextDouble();
		
		System.out.println("Employee: " + funcionario);
		System.out.println();
		System.out.println();
		System.out.printf("Employee: %s, $%.2f%n", funcionario.name, funcionario.NetSalary());
		
		System.out.println("Quer aumentar o salário bruto em quantos porcento? ");
		double percentage = sc.nextDouble();
		funcionario.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + funcionario);
		

	}

}
