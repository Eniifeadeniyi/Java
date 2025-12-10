package data.repositories;

import data.models.Book;
import exceptions.BookRepositoryExceptions.InvalidIdException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryImplementationTest {

    BookRepositoryImplementation bookRepositoryImplementation;
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
    void findByIdWithNumberGreaterThanCount_ThrowException(){
        assertThrows(InvalidIdException.class, () -> bookRepositoryImplementation.findById(1));
    }

    @Test
    void findByIdWithNumberEqualTo0OrLessThan0_ThrowException(){
        assertThrows(InvalidIdException.class, () -> bookRepositoryImplementation.findById(0));
        assertThrows(InvalidIdException.class, () -> bookRepositoryImplementation.findById(-1));
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
    void deleteByIdWithInvalidId_ThrowException(){
        assertThrows(InvalidIdException.class, () -> bookRepositoryImplementation.deleteById(1));
        assertThrows(InvalidIdException.class, () -> bookRepositoryImplementation.deleteById(-1));
        assertThrows(InvalidIdException.class, () -> bookRepositoryImplementation.deleteById(0));
    }

    @Test
    void deleteAll_CountIs0(){
        Book book = new Book();
        bookRepositoryImplementation.save(book);
        bookRepositoryImplementation.deleteAll();
        assertEquals(0L, bookRepositoryImplementation.count());
    }


}