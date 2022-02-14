package com.Mapping;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int quantiy;

    public Book(int id, String name, String author, String publisher, int quantiy) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantiy = quantiy;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(int quantiy) {
        this.quantiy = quantiy;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", quantiy=" + quantiy +
                '}';
    }
}
