package com.cg.service;

import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IBookDao;
import com.cg.dao.ICategoryDao;
import com.cg.exception.BookstoreExcepton;
import com.cg.model.Book;
@Service
@Transactional
public class IBookServiceImpl implements IBookService{

	@Autowired
	IBookDao bookrepo;
	
	@Autowired
	ICategoryDao categoryrepo;
	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		//book.setCategory(categoryrepo.getOne(cId));
	    bookrepo.save(book);
		return book.getBookId();
		
	}

	@Override
	public List<Book> showBook()throws BookstoreExcepton {
		// TODO Auto-generated method stub
		List<Book> booklist;
		try {
		booklist=bookrepo.findAll();
		}
		catch(NullPointerException e)
		{
			throw new BookstoreExcepton("invalid id");
		}
		catch(Exception e)
		{
			throw new BookstoreExcepton("invalid id");
		}
		return  booklist;
	}

	@Override
	public boolean deleteBook(int bookId) throws BookstoreExcepton {
		// TODO Auto-generated method stub
		boolean flag2=false;
		try {
		bookrepo.deleteById(bookId);
		}
		catch(NullPointerException e)
		{
			throw new BookstoreExcepton("invalid id");
		}
		catch(Exception e)
		{
			throw new BookstoreExcepton("invalid id");
		}
    		
    		flag2=true;
    	
	return flag2;
	
}
}
