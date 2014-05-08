package com.siliconnile.library.dao.impl;

import java.util.List;

import com.pearlox.framework.dao.impl.BasicJpaDao;
import com.siliconnile.library.dao.BookDao;
import com.siliconnile.library.domain.Book;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

/**
 * User: Andrew
 * Date: 6/18/13
 */
@Repository
public class BookDaoImpl extends BasicJpaDao<Book> implements BookDao {
    public BookDaoImpl() {
        super(Book.class);
    }

    @Override
    public Book findById2(Long id) {
        Query query = getEntityManager().createQuery("select so from SampleObject so where so.id = :id");
        query.setParameter("id", id);
        return (Book) query.getSingleResult();
    }
    
    @SuppressWarnings("unchecked")
	@Override
    public List<Book> getBookListing(String searchParam) {
       
    	
    	Query query = getEntityManager().createQuery("from Book bo where bo.title like :sParam or bo.author like :sParam");
    	query.setParameter("sParam", searchParam  + "%");
        return (List<Book>) query.getResultList();
    }
    
}
