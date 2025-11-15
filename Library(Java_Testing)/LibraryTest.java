import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LibraryTest {

	@Test
	public void testThatLibraryHasNoBook() {	
		Library library = new Library();			
		int result = library.totalNumberOfBooks();		
		assertEquals(result, 0);				

	}

	@Test
	public void testThatOneBookIsAddedToTheLibraryAndTheTotalNumberOfBooksIsOne() {	
		Library library = new Library();			
		String response = library.addBook("Femi and Funmi");	
		assertEquals(response, "Book added successfully!");				

	}


	@Test
	public void testThatOneBookIsAddedToTheLibraryAndTheTotalNumberOfBookIsOne() {
	Library library = new library();
	library.addBook("Eniife vs Ijapa");
	int result = library.totalNumberOfBooks();
	assertEquals(result, -1);



}