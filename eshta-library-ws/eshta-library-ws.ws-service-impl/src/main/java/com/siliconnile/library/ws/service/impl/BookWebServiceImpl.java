package com.siliconnile.library.ws.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.siliconnile.library.domain.Book;
import com.siliconnile.library.dto.BookDTO;
import com.siliconnile.library.service.api.BookService;
import com.siliconnile.library.ws.service.api.BookWebService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletResponse;

/**
 * User: Andrew
 * Date: 6/27/13
 */
public class BookWebServiceImpl implements BookWebService {
    
    @Autowired
    private BookService bookService;
    
    @Override
    public List <BookDTO> getBookListing(String sParam) {
        List <Book> books = bookService.getBookListing(sParam);
       List <BookDTO> result = null;
        if (books != null) {
            
        	result = new ArrayList<BookDTO>();

    		for (int i = 0; i < books.size(); i++) {
    			
    			BookDTO b = new BookDTO();
    			b.setId(books.get(i).getId());
    			b.setAuthor(books.get(i).getAuthor());
    			b.setCoverImageUrl(books.get(i).getCoverImageUrl());
    			b.setIsbn(books.get(i).getIsbn());
    			b.setTitle(books.get(i).getTitle());
    			result.add(b);
    			
    			
    		}
    			
        	
        	
        }
        return result;
    }
}
