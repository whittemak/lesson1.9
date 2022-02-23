package ru.skypro.task1;

public class Book {
    String name;
    int yearOfPublication;
    String Author;


    public Book(String name, String Author, int yearOfPublication) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.Author = Author;
    }

    public String getName() {
        return name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthor() {
        return Author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
