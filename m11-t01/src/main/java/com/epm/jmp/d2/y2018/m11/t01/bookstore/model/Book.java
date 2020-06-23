package com.epm.jmp.d2.y2018.m11.t01.bookstore.model;

public class Book extends StoreItem {

    private String title;
    private String author;
    private String description;

    public Book(int id, int price, String title, String author) {
        super(id, price);
        this.title = title;
        this.author = author;
    }

    public Book(int id, int price, String title, String author, String description) {
        super(id, price);
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String bookTitle) {
        this.title = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String bookAuthor) {
        this.author = bookAuthor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", description=" + description
                + ", " + super.toString() + "]";
    }



}
