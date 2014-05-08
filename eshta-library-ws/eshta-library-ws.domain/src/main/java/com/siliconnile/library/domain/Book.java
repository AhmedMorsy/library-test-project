package com.siliconnile.library.domain;

import java.util.ArrayList;
import java.util.List;

import com.pearlox.framework.domain.BasicObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User: morsy
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "book", schema = "public")
public class Book extends BasicObject {

	private String title;
	private String author;
	private String isbn;
	private String coverImageUrl;
	List<BookReader> bookReaderList = new ArrayList<BookReader>();

	@Column(name = "author")
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "isbn")
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Column(name = "cover_image_url")
	public String getCoverImageUrl() {
		return coverImageUrl;
	}

	public void setCoverImageUrl(String coverImageUrl) {
		this.coverImageUrl = coverImageUrl;
	}

	@Column(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
	public List<BookReader> getBookReaderList() {
		return bookReaderList;
	}

	public void setBookReaderList(List<BookReader> bookReaderList) {
		this.bookReaderList = bookReaderList;
	}
}
