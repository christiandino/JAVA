package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		
		System.out.println(list.size()); // para saber o tamanho da lista
		System.out.println();
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------");
		
		//list.remove("Anna"); // remove pelo conteudo
		//list.remove(1); // remove pelo indice
		list.removeIf(x -> x.charAt(0) == 'M'); // remover com predicado
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // devolve o indice
		System.out.println("Index of Bob: " + list.indexOf("Marco")); // quando nao tem ele retorna -1
		
		System.out.println("-----------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
