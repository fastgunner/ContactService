import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	ContactService c = new ContactService();
	@Test
	void testAdd() throws Exception {
		c.createContact();
	}
	void testDelete() throws Exception{
		c.deleteContact(1);
	}
	void testUpdate() throws Exception{
		c.updateContact(1);
	}

}
