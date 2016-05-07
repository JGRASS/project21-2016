package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CasTest {
	private Cas cas;
	@Before
	public void setUp() throws Exception {
		cas = new Cas();
	}

	@After
	public void tearDown() throws Exception {
		cas = null;
	}

	@Test
	public void testSetNazivOk() {
		cas.setNaziv("Pera Peric");
		assertEquals("Pera Peric", cas.getNaziv());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetNazivNull() {
		cas.setNaziv(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetNazivEmpty() {
		cas.setNaziv("");
	}

	@Test
	public void testSetOpisOk() {
		cas.setOpis("Pera Peric");
		assertEquals("Pera Peric", cas.getOpis());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetOpisNull() {
		cas.setOpis(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetOpisEmpty() {
		cas.setOpis("");
	}

	@Test
	public void testSetDomaciOk() {
		cas.setDomaci("Pera Ricpe");
		assertEquals("Pera Ricpe", cas.getDomaci());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetDomaciNull() {
		cas.setDomaci(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetDomaciEmpty() {
		cas.setDomaci("");
	}

}
