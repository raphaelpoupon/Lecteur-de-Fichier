
public abstract class ReaderImage implements Reader {
	
	private String path;
	
	public ReaderImage(String filePath) {
		this.path = filePath;
	}
	
	public abstract Object read();

}
