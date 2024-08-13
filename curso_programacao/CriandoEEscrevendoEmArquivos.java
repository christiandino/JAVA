package curso_programacao;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CriandoEEscrevendoEmArquivos {

public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "c:\\TEMP\\out.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
