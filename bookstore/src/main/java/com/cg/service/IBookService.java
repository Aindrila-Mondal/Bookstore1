package com.cg.service;

import java.util.List;

import com.cg.exception.BookstoreException;
import com.cg.model.Book;

public interface IBookService
{
	public int addBook(Book book);
	public List<Book> showBook() throws BookstoreException;
	boolean deleteBook(int bookId) throws BookstoreException;
}
