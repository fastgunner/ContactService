import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class ContactTest {

	
	@Test
	void testContactCorrect() throws Exception {
		Contact c = new Contact("Dakota", "Cromer", "7705555555", "123 test Street");
	}
	void testContactIncorrect() throws Exception {
		Contact c = new Contact("Dakota", "Cromer", "77055555555555555555555555aaaaaaa", "123aaaaaaaaaaaaaaaaaaaaaaaa test Street");
	}
}
