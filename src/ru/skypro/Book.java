package ru.skypro;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int pages) {
        this.name = name;
        this.author = author;
        this.year = pages;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
