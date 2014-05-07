package com.siliconnile.library.dao;

import java.util.List;

import com.pearlox.framework.dao.BasicDao;
import com.siliconnile.library.domain.Book;

/**
 * User: Andrew
 * Date: 6/18/13
 */
public interface BookDao extends BasicDao<Book> {
    
    public Book findById2(Long id);

	public List<Book> getBookListing(String searchParam);
}
