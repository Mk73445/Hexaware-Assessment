
package com.javaCode.sessionTwo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="library") 
public class Library implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "libraryId")
	private int id;
	private String libraryName;
	
	 @OneToMany(mappedBy="library", cascade = CascadeType.ALL)
	 private List<Books> books;

	public int getLibraryId() {
		return id;
	}
	public void setLibraryId(int id) {
		this.id = id;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public List<Books> getBooks() {
		return books;
	}
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Library [id=");
		builder.append(id);
		builder.append(", libraryName=");
		builder.append(libraryName);
		builder.append("]");
		return builder.toString();
	}

}
