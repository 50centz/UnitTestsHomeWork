package ru.geekbrains.homework4_1;

import java.util.List;

public class BookService implements BookRepository{
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    public Book findBookById(String id) {

        return bookRepository.findById(id);
    }

    public List<Book> findAllBooks() {

        return bookRepository.findAll();
    }

    @Override
    public Book findById(String id) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }
}
