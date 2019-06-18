package com.cg.service;

import java.util.List;

import com.cg.model.Book;

public interface IBookService
{
	public int addBook(Book book);
	public List<Book> showBook();
	boolean deleteBook(int bookId);
}
