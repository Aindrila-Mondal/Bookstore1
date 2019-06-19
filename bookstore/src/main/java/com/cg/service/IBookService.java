package com.cg.service;

import java.util.List;

import com.cg.exception.BookstoreExcepton;
import com.cg.model.Book;

public interface IBookService
{
	public int addBook(Book book);
	public List<Book> showBook() throws BookstoreExcepton;
	boolean deleteBook(int bookId) throws BookstoreExcepton;
}
