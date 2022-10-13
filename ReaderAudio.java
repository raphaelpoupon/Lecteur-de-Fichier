
public abstract class ReaderAudio implements Reader {
	
	private String path;
	
	public ReaderAudio(String filePath) {
		this.path = filePath;
	}
	
	public abstract Object read();

}
