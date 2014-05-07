package com.siliconnile.library.service.impl;

import java.util.List;

import com.siliconnile.library.dao.BookDao;
import com.siliconnile.library.domain.Book;
import com.siliconnile.library.service.api.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: Andrew
 * Date: 6/20/13
 */
@Service
public class BookServiceImpl implements BookService {
    
    @Autowired
    private BookDao bookDao;

	@Override
	public List<Book> getBookListing(String searchParam) {

		return bookDao.getBookListing(searchParam);
		
	}
    
  
}
