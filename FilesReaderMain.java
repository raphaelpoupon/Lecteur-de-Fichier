import java.io.IOException;

public class FilesReaderMain {
	
	// Chemin du fichier utilisé dans le main, le modifier modifiera simplement le fichier lu
	private static final String FILE_PATH = "/users/raphaelpoupon/Desktop/text";
	
	static public void main(String[] args) throws IOException {
		
		System.out.println("\nCONTENU DU FICHIER À L'ENDROIT\n");
		Reader fichierNormal = new ReaderTextNormally(FILE_PATH);
		System.out.println(fichierNormal.read());
		
		System.out.println("\nCONTENU DU FICHIER À L'ENVERS\n");
		Reader fichierInverse = new ReaderTextInReverse(FILE_PATH);
		System.out.println(fichierInverse.read());
		
		System.out.println("\nCONTENU DU FICHIER EN PALINDROME\n");
		Reader fichierPalindrome = new ReaderTextPalindrome(FILE_PATH);
		System.out.println(fichierPalindrome.read());
		
	}
	
}
