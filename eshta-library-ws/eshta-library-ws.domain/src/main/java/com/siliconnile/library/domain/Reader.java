package com.siliconnile.library.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.pearlox.framework.domain.BasicObject;

/**
 * User: morsy
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "reader", schema = "public")
public class Reader extends BasicObject {

	private String firstName;
	private String lastName;
	private Date regDate;
	private List<BookReader> bookReaderList = new ArrayList<BookReader>();

	@Column(name = "first_name")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "reg_date")
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	 @OneToMany(fetch = FetchType.LAZY, mappedBy = "reader")
	public List<BookReader> getBookReaderList() {
		return bookReaderList;
	}

	public void setBookReaderList(List<BookReader> bookReaderList) {
		this.bookReaderList = bookReaderList;
	}

}
