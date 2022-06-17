package com.javaCode.sessionTwo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "books")
public class Books implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private String booksId;
	private String booksName;

	@ManyToOne
	@JoinColumn(name = "library_id")
	private Library library;

	public String getBooksId() {
		return booksId;
	}

	public void setBooksId(String booksId) {
		this.booksId = booksId;
	}

	public String getBooksName() {
		return booksName;
	}

	public void setBooksName(String booksName) {
		this.booksName = booksName;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Books [booksId=");
		builder.append(booksId);
		builder.append(", booksName=");
		builder.append(booksName);
		builder.append(", library=");
		builder.append(library);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
