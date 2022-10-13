import java.io.IOException;

public class ReaderTextNormally extends ReaderText {

	public ReaderTextNormally(String filePath) throws IOException {
		super(filePath);
	}
	
	/*
	 *  Méthode permettant de transformer le contenu du fichier récupéré par la méthode read()
	 *  Aucune transformation nécessaire, on retourne le paramètre sans le modifier
	 */
	public String transform(String fileContent) {
		return fileContent;
	}

}
