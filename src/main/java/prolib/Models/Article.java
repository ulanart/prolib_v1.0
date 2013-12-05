package prolib.Models;

public class Article 
{
	private int news_id;
	private String news_short;
	private String news_full;
	
	public void Atricle(){}
	public Article(String article_short, String article_full)
	{
		this.news_short = article_short;
		this.news_full = article_full;
	}
	public int getNews_id() {
		return news_id;
	}
	public void setNews_id(int news_id) {
		this.news_id = news_id;
	}
	public String getNews_short() {
		return news_short;
	}
	public void setNews_short(String news_short) {
		this.news_short = news_short;
	}
	public String getNews_full() {
		return news_full;
	}
	public void setNews_full(String news_full) {
		this.news_full = news_full;
	}
	
}
