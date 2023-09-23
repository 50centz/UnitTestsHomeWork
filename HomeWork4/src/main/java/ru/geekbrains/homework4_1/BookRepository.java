package ru.geekbrains.homework4_1;

import java.util.List;

public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();
}
