package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import entities.ConvertMoeda;

public class POO_exercicio_ConverterMoeda {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price?");
		double p = sc.nextDouble();
		System.out.printf("How many dollars will be bought?");
		double d = sc.nextDouble();
		
		double total = ConvertMoeda.CurrencyConverter(p,d);
		
		System.out.printf("Amount to be paid in reais: %.2f", total);


	}

}
