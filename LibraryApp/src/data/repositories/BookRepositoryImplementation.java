package data.repositories;

import data.models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImplementation implements BookRepository {
    private int count;
    private List<Book> books = new ArrayList<>();

    @Override
    public long count() {
        return books.size();
    }

    @Override
    public Book save(Book book) {
        if(isNew(book)) saveNew(book);
        else update(book);
        return book;
    }

    private void update(Book book) {
        books.remove(findById(book.getId()));
        books.add(book);
    }

    private void saveNew(Book book) {
        book.setId(++count);
        books.add(book);
    }

    private boolean isNew(Book book) {
        for(Book checkBook : books) {
            if(checkBook.getId() == book.getId())
                return false;
        }
        return true;
    }


    @Override
    public Book findById(int id) {
        if(id <= 0 || id > count) return null;
        return books.get(id - 1);
    }

    @Override
    public boolean existsById(int id) {
        return id > 0 && id <= count;
    }

    @Override
    public void deleteById(int id) {
        books.remove(findById(id));
    }

    @Override
    public void deleteAll() {
        books.clear();
    }


}
