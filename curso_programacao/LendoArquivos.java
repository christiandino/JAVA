package curso_programacao;

import java.io.BufferedReader;
import java.io.FileReader;


public class LendoArquivos {

	public static void main(String[] args) {
		
		String path = "c:\\TEMP\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
