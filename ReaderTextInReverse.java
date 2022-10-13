import java.io.IOException;

public class ReaderTextInReverse extends ReaderText {
	
	public ReaderTextInReverse(String filePath) throws IOException {
		super(filePath);
	}
	
	/*
	 * On récupère un atttribut String fileContent contenant le contenu du fichier
	 * On split ce String avec un StringBuilder sur les "\n"
	 * On parcourt le résultat à l'envers et on ajoute chaque ligne à l'attribut String reverseFileContent
	 */
	public String transform(String fileContent) {
		String reverseFileContent = "";
		String[] splitedFileContent = fileContent.split("\n");
		for(int line=splitedFileContent.length-1; line>=0; line--)
			reverseFileContent += splitedFileContent[line] + "\n";
		return reverseFileContent;
	}

}
