package com.aarif.graphqldemo.resolver;

import com.aarif.graphqldemo.dao.BookRepository;
import com.aarif.graphqldemo.entity.Book;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Query implements GraphQLQueryResolver {

    private BookRepository bookRepository;

    @Autowired
    public Query(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getBook(String id) {
        return this.bookRepository.getBook(id);
    }
}
