package curso_programacao;

public class condicao_ternaria {
	public static void main(String[] args) {
		
/*		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		} 
*/
		
		double preco = 34.5;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
	}
}
