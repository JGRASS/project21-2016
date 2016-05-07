package controller.so;

import java.util.LinkedList;

import model.Student;

public class SOUpdate {

	public static void izvrsi(Student s, LinkedList<Student> studenti) {
		if(s == null){
			throw new RuntimeException("Student ne sme biti null!");
		}
		for (int i = 0; i < studenti.size(); i++) {
			if(studenti.get(i).equals(s)){
				studenti.set(i, s);
				return;
			}
		}
	}

}
