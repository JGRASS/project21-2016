package controller.so;

import java.util.LinkedList;

import model.Student;

public class SOPronadjiStudenta {
	
	public static Student izvrsi(String brTel, LinkedList<Student> studenti) {
		for(int i = 0; i < studenti.size(); i++) {
			if(studenti.get(i).getBrTel().equals(brTel))
				return studenti.get(i);
		}
		return null;
	}
}
