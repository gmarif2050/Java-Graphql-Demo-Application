package com.aarif.graphqldemo.entity;

import lombok.Data;

@Data
public class Book {
    private String id;
    private String title;
    private String author;
    private String isbn;
    private Integer pageCount;
}



