package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.BookstoreException;

import com.cg.model.Book;
import com.cg.service.IBookService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class BookController {

	@Autowired
	IBookService bookservice;

	public IBookService getBookservice() {
		return bookservice;
	}

	public void setBookservice(IBookService bookservice) {
		this.bookservice = bookservice;
	}
	@PostMapping("/addBook")
	public int addBook(@RequestBody Book book)
	{
		return bookservice.addBook(book);
	}
	@GetMapping("/showBook")
	public List<Book> showBook()
	{
		try {
			return  bookservice.showBook(); 
		}
		catch(BookstoreException e)
		{
			return null;
		}
		
		
		
	}
	@DeleteMapping("/deleteBook/{bookId}")
	public boolean deleteAdmin(@PathVariable("bookId") int bookId)
	{
		
		
		try {
			return bookservice.deleteBook(bookId) ;
		}
		catch(BookstoreException e)
		{
			return false;
		}
		
	}
}
