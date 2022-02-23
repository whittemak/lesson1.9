package ru.skypro.task2;

import com.sun.source.tree.BreakTree;

public class Author {
    String authorName;
    String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

}
