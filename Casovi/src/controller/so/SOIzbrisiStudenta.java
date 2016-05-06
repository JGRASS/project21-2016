package controller.so;

import java.util.LinkedList;

import controller.GUIKontroler;
import model.Student;

public class SOIzbrisiStudenta {
		
	public static void izvrsi(Student student, LinkedList<Student> studenti) {
		studenti.remove(student);
	}
}
