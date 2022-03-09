import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(Lifecycle.PER_CLASS)
public class PersonTest {

	Person person;
	
	@BeforeAll
	public void setup() {
		 person = new Person();
	}

	@ParameterizedTest
	@ValueSource(strings = { "PaulMcCartney2", "NeilArms2" })
	void check_user_valid(String name) {
		assertTrue(person.checkUser(name));
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "Paul#McCartney", "Neil@Arms" })
	void check_user_not_valid(String name) {
		assertTrue(person.checkUser(name));
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "123456789", "#$%1234" })
	void does_not_have_letters(String senha) {
		assertFalse(person.checkPassword(senha));
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "Abcabcdefgh@", "#hbtn@%tc" })
	void does_not_have_numbers(String senha) {
		assertFalse(person.checkPassword(senha));
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "Abc@123", "12$@hbt" })
	void does_not_have_eight_chars(String senha) {
		assertFalse(person.checkPassword(senha));
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123" })
	void check_password_valid(String senha) {
		assertTrue(person.checkPassword(senha));
	}
}
