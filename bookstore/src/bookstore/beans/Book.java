package bookstore.beans;
import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
private int idBook;	
private int ISBN; 
private String title; 
private String author; 
private String category; 
private String editorial; 
private String price;
/**
 * 
 */
public Book() {
	super();
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getEditorial() {
	return editorial;
}
public void setEditorial(String editorial) {
	this.editorial = editorial;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public int getISBN() {
	return ISBN;
}
/**
 * @param iSBN
 * @param title
 * @param author
 * @param category
 * @param editorial
 * @param price
 */
public Book(int iSBN, String title, String author, String category, String editorial, String price) {
	super();
	ISBN = iSBN;
	this.title = title;
	this.author = author;
	this.category = category;
	this.editorial = editorial;
	this.price = price;
} 
}
