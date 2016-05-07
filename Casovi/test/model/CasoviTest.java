package model;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Jelena Marjanovic, Milos Ljubisavljevic, Djordje Nestorovic
 *
 */
public class CasoviTest {
	private Casovi casovi;
	
	@Before
	public void setUp() throws Exception {
		casovi = new Casovi();
	}

	@After
	public void tearDown() throws Exception {
		casovi = null;
	}
	
	/**
	 * Test method for {@link model.Casovi#dodajStudenta(Student student)}.
	 */
	@Test
	public void testDodajStudentaOk() {
		Student s = new Student("Pera Peric", "lalala", "lala@gmail.com");
		casovi.dodajStudenta(s);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajStudentaNull(){
		Student s = null;
		casovi.dodajStudenta(s);
	}
	
	/**
	 * Test method for {@link model.Casovi#izbrisiStudenta(Student student)}.
	 */
	@Test
	public void testIzbrisiStudentaOk() {
		Student s = new Student("Pera Peric", "lalala", "lala@gmail.com");
		casovi.izbrisiStudenta(s);
	}

	/**
	 * Test method for {@link model.Casovi#serialize(String path)}.
	 */
	@Test
	public void testSerializeOk() {
		String path = "Text.out";
		casovi.serialize(path);
	}
	
	@Test
	public void testSerializeNULL(){
		String path = null;
		casovi.serialize(path);
	}
	
	@Test
	public void testSerializeEmpty(){
		String path = "";
		casovi.serialize(path);
	}

	/**
	 * Test method for {@link model.Casovi#deserialize(String path)}.
	 */
	@Test
	public void testDeserializeOk() {
		String path = "Text.out";
		casovi.deserialize(path);
	}
	
	@Test
	public void testDeserializeNULL(){
		String path = null;
		casovi.deserialize(path);
	}
	
	@Test
	public void testDeserializeEmpty(){
		String path = "";
		casovi.deserialize(path);
	}
	
	/**
	 * Test method for {@link model.Casovi#dodajCas(Cas cas, Student s)}.
	 */
	@Test
	public void testDodajCasOk() {
		Student s = new Student("Pera Peric", "lalala", "lala@gmail.com");
		Cas c = new Cas("prvi", "Bla bla", "Nema");
		casovi.dodajCas(c, s);
	}
	
	@Test
	public void testDodajCasNullCas() {
		Student s = new Student("Pera Peric", "lalala", "lala@gmail.com");
		Cas c = null;
		casovi.dodajCas(c, s);
	}
	
	@Test
	public void testDodajCasNullStudent() {
		Student s = null;
		Cas c = new Cas("prvi", "Bla bla", "Nema");
		casovi.dodajCas(c, s);
	}
	
	@Test
	public void testDodajCasNull() {
		Student s = null;
		Cas c = null;
		casovi.dodajCas(c, s);
	}
	
	
	/**
	 * Test method for {@link model.Casovi#updateStudenta(Student s)}.
	 */
	@Test
	public void testUpdateStudentaOk() {
		Student s = new Student("Pera Peric", "lalala", "lala@gmail.com");
		casovi.updateStudenta(s);
	}
	
	@Test
	public void testUpdateStudentaNull() {
		Student s = null;
		casovi.updateStudenta(s);
	}

}
