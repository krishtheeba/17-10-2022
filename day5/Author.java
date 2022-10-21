public class Author {

	private String name;
	private int relatedArticle;
	
	
	public Author(String name, int relatedArticle) {
		super();
		this.name = name;
		this.relatedArticle = relatedArticle;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRelatedArticle() {
		return relatedArticle;
	}
	public void setRelatedArticle(int relatedArticle) {
		this.relatedArticle = relatedArticle;
	}
	
	
}
