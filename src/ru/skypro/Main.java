package ru.skypro;

import ru.skypro.task1.Book;
import ru.skypro.task2.Author;

public class Main {

    public static void main(String[] args) {
        Book firstBook = new Book("Сказки", " Александр Пушкин", 2010);
        Book secondBook = new Book("Стихи", " Михаил Леромонтов", 1995);
        Author first = new Author("Александр", "Пушкин");
        Author second = new Author("Михаил", "Лермонтов");
        boolean sucses = Author.equals(authorName + authorSurname);
        if (!sucses) {
            System.out.println("Ошибка");
        }
        firstBook.setYearOfPublication(2020);
    }
}
