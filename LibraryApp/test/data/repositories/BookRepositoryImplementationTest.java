package data.repositories;

import data.models.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryImplementationTest {

    BookRepository bookRepositoryImplementation;
    @BeforeEach
    void startWith() {
        bookRepositoryImplementation = new BookRepositoryImplementation();
    }

    @Test
    void repositoryIsEmptyUponCreation(){
        assertEquals(0L,bookRepositoryImplementation.count());
    }

    @Test
    void saveBook_CountIncreases(){
        Book book = new Book();
        bookRepositoryImplementation.save(book);
        assertEquals(1L,bookRepositoryImplementation.count());
    }

    @Test
    void saveBook_BookIsReturned(){
        Book book = new Book();
        assertEquals(book, bookRepositoryImplementation.save(book));
    }

    @Test
    void saveBook_BookIdIsSet(){
        Book book = new Book();
        bookRepositoryImplementation.save(book);
        assertEquals(1,book.getId());
    }

    @Test
    void findById_BookIsReturned(){
        Book book = new Book();
        bookRepositoryImplementation.save(book);
        assertEquals(book, bookRepositoryImplementation.findById(1));
    }

    @Test
    void findByIdWithNumberGreaterThanCount_ReturnNull(){
        assertNull(bookRepositoryImplementation.findById(1));
    }

    @Test
    void findByIdWithNumberEqualTo0OrLessThan0_ReturnNull(){
        assertNull(bookRepositoryImplementation.findById(0));
        assertNull(bookRepositoryImplementation.findById(-1));
    }

    @Test
    void existsByIdTest(){
        Book book = new Book();
        bookRepositoryImplementation.save(book);
        assertTrue(bookRepositoryImplementation.existsById(1));
    }

    @Test
    void existsByIdWithInvalidIdTest(){
        assertFalse(bookRepositoryImplementation.existsById(1));
        assertFalse(bookRepositoryImplementation.existsById(-1));
        assertFalse(bookRepositoryImplementation.existsById(0));
    }

    @Test
    void deleteById_BookIsDeleted_CountDecreases(){
        Book book = new Book();
        bookRepositoryImplementation.save(book);
        bookRepositoryImplementation.deleteById(1);
        assertEquals(0L, bookRepositoryImplementation.count());
    }

    @Test
    void deleteAll_CountIs0(){
        Book book = new Book();
        bookRepositoryImplementation.save(book);
        bookRepositoryImplementation.deleteAll();
        assertEquals(0L, bookRepositoryImplementation.count());
    }

    @Test
    void saveBookWithSameId(){
        Book book = new Book();
        bookRepositoryImplementation.save(book);
        Book book2 = new Book();
        book2.setId(1);
        bookRepositoryImplementation.save(book2);
        assertEquals(1L, bookRepositoryImplementation.count());
    }


}