package data.repositories;
import data.models.BorrowedBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BorrowedBookRepositoryImplementationTest {

        BorrowedBookRepository borrowedBookRepositoryImplementation;
        @BeforeEach
        void startWith() {
            borrowedBookRepositoryImplementation = new BorrowedBookRepositoryImplementation();
        }

        @Test
        void repositoryIsEmptyUponCreation(){
            assertEquals(0L,borrowedBookRepositoryImplementation.count());
        }

        @Test
        void saveBook_CountIncreases(){
            BorrowedBook book = new BorrowedBook();
            borrowedBookRepositoryImplementation.save(book);
            assertEquals(1L,borrowedBookRepositoryImplementation.count());
        }

        @Test
        void saveBook_BookIsReturned(){
            BorrowedBook book = new BorrowedBook();
            assertEquals(book, borrowedBookRepositoryImplementation.save(book));
        }

        @Test
        void saveBook_BookIdIsSet(){
            BorrowedBook book = new BorrowedBook();
            borrowedBookRepositoryImplementation.save(book);
            assertEquals(1,book.getBookId());
        }

        @Test
        void findById_BookIsReturned(){
            BorrowedBook book = new BorrowedBook();
            borrowedBookRepositoryImplementation.save(book);
            assertEquals(book, borrowedBookRepositoryImplementation.findById(1));
        }

        @Test
        void findByIdWithNumberGreaterThanCount_ReturnNull(){
            assertNull(borrowedBookRepositoryImplementation.findById(1));
        }

        @Test
        void findByIdWithNumberEqualTo0OrLessThan0_ReturnNull(){
            assertNull(borrowedBookRepositoryImplementation.findById(0));
            assertNull(borrowedBookRepositoryImplementation.findById(-1));
        }

        @Test
        void existsByIdTest(){
            BorrowedBook book = new BorrowedBook();
            borrowedBookRepositoryImplementation.save(book);
            assertTrue(borrowedBookRepositoryImplementation.existsById(1));
        }

        @Test
        void existsByIdWithInvalidIdTest(){
            assertFalse(borrowedBookRepositoryImplementation.existsById(1));
            assertFalse(borrowedBookRepositoryImplementation.existsById(-1));
            assertFalse(borrowedBookRepositoryImplementation.existsById(0));
        }

        @Test
        void deleteById_BookIsDeleted_CountDecreases(){
            BorrowedBook book = new BorrowedBook();
            borrowedBookRepositoryImplementation.save(book);
            borrowedBookRepositoryImplementation.deleteById(1);
            assertEquals(0L, borrowedBookRepositoryImplementation.count());
        }

        @Test
        void deleteAll_CountIs0(){
            BorrowedBook book = new BorrowedBook();
            borrowedBookRepositoryImplementation.save(book);
            borrowedBookRepositoryImplementation.deleteAll();
            assertEquals(0L, borrowedBookRepositoryImplementation.count());
        }

        @Test
        void saveBorrowedBookWithSameId(){
            BorrowedBook book = new BorrowedBook();
            borrowedBookRepositoryImplementation.save(book);
            BorrowedBook book2 = new BorrowedBook();
            book2.setBookId(1);
            borrowedBookRepositoryImplementation.save(book2);
            assertEquals(1L, borrowedBookRepositoryImplementation.count());
        }


}