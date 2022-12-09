package negocio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public void Write(String msg,File file) {
		/*importar ler arquivo*/
		/*exportar escrever arquivo*/
	try {
		FileWriter arquivo = new FileWriter(file);
		arquivo.write(msg);
		arquivo.close();
	} catch (IOException e) {
		e.printStackTrace();
		}
	}
}
