package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
	
	public static class Book{
		String bookName;
		String bookType;
		
		public Book(String BookType, String bookname) {
			this.bookName= bookname;
			this.bookType = BookType;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getBookType() {
			return bookType;
		}
		public void setBookType(String bookType) {
			this.bookType = bookType;
		}
	}
	
	public static void main(String[] args) {
		
		List<Book> bookNames = new ArrayList<Book>();
		Book b = new Book("A","A Headfirst Java");
		bookNames.add(b);
		bookNames.add(new Book("B","Beggining in Java"));
		bookNames.add(new Book("A","Always in Java"));
		
		List<String> programmingBooks = bookNames.stream()
									.filter(book->"A".equals(book.getBookType()))
									.sorted((b1,b2)->b1.getBookName().length()-b2.getBookName().length())
									.map(Book::getBookName)
									.collect(Collectors.toList());
		
		programmingBooks.forEach(System.out::println);
	}

}
