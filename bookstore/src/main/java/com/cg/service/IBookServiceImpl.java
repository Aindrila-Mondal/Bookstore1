package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IBookDao;
import com.cg.dao.ICategoryDao;
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
	public List<Book> showBook() {
		// TODO Auto-generated method stub
		List<Book> booklist=bookrepo.findAll();
		return  booklist;
	}

	@Override
	public boolean deleteBook(int bookId) {
		// TODO Auto-generated method stub
		boolean flag2=false;
    
 
    		
    		bookrepo.deleteById(bookId);
    		System.out.println("@@@@@@@@@@@@@@@@@@");
    		flag2=true;
    	
	return flag2;
	
}
}
