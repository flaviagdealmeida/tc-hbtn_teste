import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

	Person pessoa;
	
	@BeforeEach
	public void setup() {
	pessoa = new Person();
	pessoa.setNome("Paul");
	pessoa.setSurnome("McCartney");
	pessoa.setBirthDate(1947);


	}
	
	@Test
	void show_full_name() {
		assertEquals("Paul McCartney", pessoa.fullName());
	}
	
	@Test
		  void test_calculateYearlySalary() {
		        pessoa.setSalary(1200f);
		        assertEquals(14400.0, pessoa.calculateYearlySalary());
		    
	}
	
	@Test
	void person_is_MEI(){
		pessoa.setAnotherCompanyOwner(false);
		pessoa.setPensioner(false);
		pessoa.setPublicServer(false);
		
		assertTrue(pessoa.isMEI());
	}
	@Test
	void person_is_not_MEI(){
		
		pessoa.setAnotherCompanyOwner(true);
		pessoa.setPensioner(true);
		pessoa.setPublicServer(true);
		
		assertFalse(pessoa.isMEI());
	}
}
