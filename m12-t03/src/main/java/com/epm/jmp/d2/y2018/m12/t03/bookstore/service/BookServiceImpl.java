package com.epm.jmp.d2.y2018.m12.t03.bookstore.service;

import com.epm.jmp.d2.y2018.m12.t03.bookstore.dao.BookDao;
import com.epm.jmp.d2.y2018.m12.t03.bookstore.model.Book;
import com.epm.jmp.d2.y2018.m12.t03.bookstore.model.StoreItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @SuppressWarnings("unused")
    private BookDao bookDao;
/*
    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }
*/

    private List<Book> books;
    {
        books = new ArrayList<>();

        Book b1 = new Book(0, 10, "bookTitle1", "bookAuthor1");
        b1.setDescription("description 1");
        books.add(b1);

        Book b2 = new Book(1, 20, "bookTitle2", "bookAuthor2");
        b2.setDescription("description 2");
        books.add(b2);

        Book b3 = new Book(2, 30, "bookTitle3", "bookAuthor3");
        b3.setDescription("description 3");
        books.add(b3);
    }



    @Override
    public void createBook(StoreItem book) {
        // TO-DO Auto-generated method stub
    }

    @Override
    public void updateBook(StoreItem book) {
        // TO-DO Auto-generated method stub
    }

    @Override
    public void deleteBook(int id) {
        books.remove(id);
    }

    @Override
    public Book getBookById(int id) {
        return books.get(id);
    }

    @Override
    public List<Book> getBookList() {
        return books;
    }


}
