package com.siliconnile.library.domain;

import java.util.Date;

import com.pearlox.framework.domain.BasicObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.search.annotations.IndexedEmbedded;

/**
 * User: morsy
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "book_reader", schema = "public")
public class BookReader extends BasicObject {

	private Book book;
	private Reader reader;
	private Date date;

	@IndexedEmbedded
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_id", nullable = true)
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@IndexedEmbedded
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "reader_id", nullable = true)
	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}
	@Column(name = "date")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
