package com.siliconnile.library.dto;

import com.pearlox.framework.dto.BasicDTO;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: Andrew
 * Date: 6/27/13
 */
@XmlRootElement
public class BookDTO extends BasicDTO {
    
	private long id;
	private String title;
	private String author;
	private String isbn;
	private String coverImageUrl;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getCoverImageUrl() {
		return coverImageUrl;
	}
	public void setCoverImageUrl(String coverImageUrl) {
		this.coverImageUrl = coverImageUrl;
	}
	
	
	
}
