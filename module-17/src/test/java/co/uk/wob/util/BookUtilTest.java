package co.uk.wob.util;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookUtilTest {
	
	@ParameterizedTest
	@CsvSource({"J.R.R. Tolkien, The Lord of the Rings", "J.R.K. Rowling, Harry Potter"})
	void generateTitle(String author, String title) {
		
		
		val fullTitle = title + " by " + author;
		System.out.println(fullTitle);
		assertEquals(fullTitle, BookUtil.generateTitle(author, title));
	}
	
}
