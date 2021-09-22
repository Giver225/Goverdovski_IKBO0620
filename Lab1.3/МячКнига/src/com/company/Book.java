package com.company;

public class Book {
    private String name;
    private String author;
    private int pageCount;
    private int isbn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) throws Exception{
        if (pageCount <=0) throw new Exception("Книги без страниц не существует");
        this.pageCount = pageCount;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) throws Exception{
        if (isbn <=0) throw new Exception("Книги не существует в реестре");
        this.isbn = isbn;
    }

    public String toString() {
        return "Book{\n" +
                "name='" + name + '\'' +
                ",\nauthor='" + author + '\'' +
                ",\npageCount=" + pageCount +
                ",\nisbn=" + isbn +
                "\n}";
    }
}
