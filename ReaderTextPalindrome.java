import java.io.IOException;

public class ReaderTextPalindrome extends ReaderText {

	public ReaderTextPalindrome(String filePath) throws IOException {
		super(filePath);
	}
	
	/*
	 * On récupère un atttribut String fileContent contenant le contenu du fichier
	 * On split ce String avec un StringBuilder sur les "\n"
	 * On parcourt le résultat à l'endroit puis à l'envers en inversant le sens des lignes 
	 * et en ajoutant chacune des lignes à l'attribut String palindromeFileContent
	 */
	public String transform(String fileContent) {
		String palindromeFileContent = "";
		String[] splitedFileContent = fileContent.split("\n");
		for(int line=0; line<=splitedFileContent.length-1; line++)
			palindromeFileContent += splitedFileContent[line] + "\n";
		for(int line=splitedFileContent.length-1; line>=0; line--)
			palindromeFileContent += new StringBuilder(splitedFileContent[line]).reverse().toString() + "\n";
		return palindromeFileContent;
	}

}
