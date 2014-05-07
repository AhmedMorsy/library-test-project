package com.siliconnile.library.service.api;

import java.util.List;

import com.siliconnile.library.domain.Book;

/**
 * User: Andrew
 * Date: 6/20/13
 */
public interface BookService {
    

    public List<Book> getBookListing(String searchParam);
}
