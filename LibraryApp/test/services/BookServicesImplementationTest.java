package services;

import data.models.Genre;
import data.repositories.BookRepository;
import data.repositories.BookRepositoryImplementation;
import dtos.requests.AddBookRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServicesImplementationTest {

    BookServices bookServicesImpl;
    BookRepository bookRepositoryImpl;
    @BeforeEach
    void setUp() {
        bookServicesImpl = new BookServicesImplementation();
        bookRepositoryImpl = new BookRepositoryImplementation();
    }

    @Test
    void addBook_CountIncreases() {
        AddBookRequest request = new AddBookRequest();
        request.setTitle("Title");
        request.setAuthor("Author");
        request.setEdition(3);
        request.setPages(504);
        request.setQuantity(5);
        request.setGenre(Genre.HORROR);
        request.setIsbn("isbn");
        request.setDescription("description");
        bookServicesImpl.addBook(request);
        assertEquals(1,bookRepositoryImpl.count());
    }

}