package TDD.JUNIT;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class StringRemoveTest {
	RemoveChars s;
	@BeforeEach
	void setup() {
		s=new RemoveChars();
	}
	@Test
	void testRemoveCharsAt1() {
		assertEquals("BBCAA",s.revs("ABBCAA"));
	}
	@Test
	void testRemoveCharsAt2() {
		assertEquals("BBCAA",s.revs("AABBCAA"));
	}
	@Test
	void testRemoveChars() {
		assertEquals("BABCCAA",s.revs("BABCCAA"));
	}
	@Test
	void testRemoveCharsAt3() {
		assertEquals("ABBCAA",s.revs("AAABBCAA"));
	}
}
