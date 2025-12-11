package services;

import data.models.Book;
import data.repositories.BookRepository;
import data.repositories.BookRepositoryImplementation;
import dtos.requests.AddBookRequest;
import dtos.responses.AddBookResponse;

import static utils.Mapper.map;

public class BookServicesImplementation implements BookServices {
    private BookRepository bookRepositoryImpl = new BookRepositoryImplementation();


    @Override
    public AddBookResponse addBook(AddBookRequest request) {
        Book book = map(request);
        bookRepositoryImpl.save(book);
        return map(book);
    }
}
