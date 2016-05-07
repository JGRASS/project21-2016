/**
 * 
 */
package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Jelena Marjanovic, Milos Ljubisavljevic, Djordje Nestorovic
 *
 */
public class StudentTest {
	
	private Student s;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		s = new Student();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		s = null;
	}

	/**
	 * Test method for {@link model.Student#setImePrezime(java.lang.String)}.
	 */
	@Test
	public void testSetImePrezimeOk() {
		s.setImePrezime("Pera Peric");
		assertEquals("Pera Peric", s.getImePrezime());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImePrezimeNull() {
		s.setImePrezime(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImePrezimeEmpty() {
		s.setImePrezime("");
	}

	/**
	 * Test method for {@link model.Student#setBrTel(java.lang.String)}.
	 */
	@Test
	public void testSetBrTelOk() {
		s.setBrTel("lalla");
		assertEquals("lalla", s.getBrTel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetBrTelNull() {
		s.setBrTel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetBrTelEmpty() {
		s.setBrTel("");
	}

	/**
	 * Test method for {@link model.Student#setEmail(java.lang.String)}.
	 */
	@Test
	public void testSetEmailOk() {
		s.setEmail("lalla@hotmail.com");
		assertEquals("lalla@hotmail.com", s.getEmail());
	}
	
	@Test 
	public void testSetEmailEmpty() {
		s.setEmail("");
		assertEquals("", s.getEmail());
	}

	/**
	 * Test method for {@link model.Student#setUplaceno(int)}.
	 */
	@Test
	public void testSetUplaceno() {
		s.setUplaceno(32);
		assertEquals(32, s.getUplaceno());
	}

	/**
	 * Test method for {@link model.Student#dodajCas(model.Cas)}.
	 */
	@Test
	public void testDodajCas() {
		Cas cas = new Cas("prvi","string","strlen");
		s.dodajCas(cas);
		assertEquals(true, s.getCasovi().contains(cas));
	}

}
