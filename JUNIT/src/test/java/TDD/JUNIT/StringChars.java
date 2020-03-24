package TDD.JUNIT;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class StringChars {
	RemoveChars s;
	Scanner sc=new Scanner(System.in);
	String b;
	@BeforeEach
	void setup() {
		s=new RemoveChars();
		System.out.println("Enter a string");
		b=sc.next();
	}
	@Test
	void testRemoveChars() {
		assertEquals(s.revs(b),s.revs(b));
		System.out.println(s.revs(b));
	}

}
