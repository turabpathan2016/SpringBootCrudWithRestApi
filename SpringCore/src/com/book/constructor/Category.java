package com.book.constructor;

public class Category {
	private String name;
	private Book book;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category(Book book) {
		this.book = book;
	}

public void show()
{
	System.out.println("name of book :"+name);
	System.out.println("book name :  "+book.getBookname()+"   book price :  "+book.getBookprice());
}
}
