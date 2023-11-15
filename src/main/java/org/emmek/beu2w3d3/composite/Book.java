package org.emmek.beu2w3d3.composite;

import java.util.ArrayList;
import java.util.List;

public class Book implements Page {

    List<Author> authors = new ArrayList<>();
    long price;

    List<Page> pages = new ArrayList<>();

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addPage(Page page) {
        pages.add(page);
    }

    @Override
    public int getPagesNumber() {
        return pages.stream().mapToInt(Page::getPagesNumber).sum();
    }

    @Override
    public void print() {
        System.out.println("Book");
        System.out.println("Authors:");
        authors.forEach(a -> System.out.println(a.getName()));
        pages.forEach(Page::print);
    }
}
