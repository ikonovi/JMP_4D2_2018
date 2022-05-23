package com.epm.jmp.d2.y2018.m11.t01.bookstore.service;

import com.epm.jmp.d2.y2018.m11.t01.bookstore.model.Book;
import com.epm.jmp.d2.y2018.m11.t01.bookstore.model.StoreItem;

import java.util.List;

public interface BookService {

    void createBook(StoreItem book);

    void updateBook(StoreItem book);

    void deleteBook(int id);

    Book getBookById(int id);

    List<Book> getBookList();

}
