package controller.so;

import java.util.LinkedList;

import model.Student;

public class SODodajStudenta {

	public static void izvrsi(Student student, LinkedList<Student> studenti) {
		if(student == null) throw new RuntimeException("Student ne sme biti null!");
		if(!studenti.contains(student))
			studenti.add(student);
			
	}

}
