import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class ReaderText implements Reader {
	
	private String path;
	
	// Le constructeur prend en paramètre le chemin du fichier à lire (filePath) et l'enregistre dans l'attribut path
	public ReaderText(String filePath) {
		this.path = filePath;
	}
	
	/*
	 *  Surcharge de la méthode read(), elle récupère le contenu texte du fichier et
	 *  le retourne en appelant la méthode transform() qui est surchargée dans les sous-classes
	 */
	public String read() {
		String fileContent = ""; 
		try {
			FileReader fileReader = new FileReader(this.path);
			try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
				String line = bufferedReader.readLine();
				while (line != null) {
					fileContent += line + "\n";
					line = bufferedReader.readLine();
				}
			}
		} catch (IOException e) {
			System.out.println("Fichier non trouvé");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return this.transform(fileContent);
	}
	
	// Méthode commune aux sous-classes, elle permet de transformer le contenu du fichier
	public abstract String transform(String fileContent);
		
}
