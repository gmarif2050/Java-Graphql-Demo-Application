package com.aarif.graphqldemo.dao;

import com.aarif.graphqldemo.entity.Book;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BookRepository {

    private static Map<String, Book> bookData = new HashMap<>();

    static {
        Book book1 = new Book();
        book1.setId("book-1");
        book1.setTitle("Harry Potter and the Philosopher's Stone");
        book1.setIsbn("978-0747532699");
        book1.setPageCount(223);
        book1.setAuthor("J. K. Rowling");
        bookData.put(book1.getId(), book1);

        Book book2 = new Book();
        book2.setId("book-2");
        book2.setTitle("Moby Dick");
        book2.setIsbn("978-1503280786");
        book2.setPageCount(634);
        book2.setAuthor("Herman Melville");
        bookData.put(book2.getId(), book2);
    }

    public Book getBook(String id) {
        return bookData.get(id);
    }
}

