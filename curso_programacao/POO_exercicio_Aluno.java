/*
 *  Fazer uma programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
 *  (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada).
 *  Ao final, mostrar qual a nota do aluno no ano.
 *  Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso de negativo, quantos pontos faltam
 *  para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver este problema * 
 * 
 * */

package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class POO_exercicio_Aluno {

	public static void main(String[] args) {
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		System.out.println("Digite o nome do aluno e as 3 notas dos trimestres: ");
		aluno.name = sc.nextLine();
		aluno.nota_1 = sc.nextDouble();
		aluno.nota_2 = sc.nextDouble();
		aluno.nota_3 = sc.nextDouble();
		
		System.out.println(aluno);
	}

}
