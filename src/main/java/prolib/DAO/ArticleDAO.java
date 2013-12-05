package prolib.DAO;

import java.sql.SQLException;

import org.hibernate.mapping.Collection;

import prolib.Models.Article;

public interface ArticleDAO 
{
	public void addArticle(Article article) throws SQLException;
	public void editArticle(Article id,Article article) throws SQLException;
	public void deleteArticle(Article id) throws SQLException;
	public Article getArticleId(Article id) throws SQLException;
	public Collection getAllArticle() throws SQLException;
	public Collection getAllVideo() throws SQLException;
	
}
