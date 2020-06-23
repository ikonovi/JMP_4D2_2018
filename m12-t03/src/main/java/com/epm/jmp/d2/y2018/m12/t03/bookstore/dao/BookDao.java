package com.epm.jmp.d2.y2018.m12.t03.bookstore.dao;

import com.epm.jmp.d2.y2018.m12.t03.bookstore.model.Book;
import com.epm.jmp.d2.y2018.m12.t03.bookstore.model.StoreItem;

import java.util.List;

public interface BookDao {

    List<Book> getBooks();

    StoreItem readBookById(int id);

    void createBook(StoreItem book);

    void updateBook(StoreItem book);

    void deleteBookById(int id);

}
