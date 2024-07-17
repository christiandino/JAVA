/*
 *
 * Fazer um programa para ler os valores da largura e altura de um retangulo.
 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
 * Usar uma classe como mostrado no projeto ao lado.
 * 	
*/

package curso_programacao;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class POO_exercicio_fixacao {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Retangulo retangulo_1 = new Retangulo();
	
	System.out.println("Enter rectangle width and height");
	
	System.out.println("Digite o valor da largura e altura do retangulo: ");
	retangulo_1.width = sc.nextDouble();
	retangulo_1.height = sc.nextDouble();
	
	
	System.out.println("AREA: " + retangulo_1.totalAreaRetangulo());
	System.out.println("PERIMETER: " + retangulo_1.totalPerimetroRetangulo());
	System.out.println("DIAGONAL: " + retangulo_1.totalDiagonalRetangulo());
	
	}

}
