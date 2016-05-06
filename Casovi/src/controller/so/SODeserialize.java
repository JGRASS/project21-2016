package controller.so;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import model.Student;

public class SODeserialize {
	
	public static void izvrsi(String path, LinkedList<Student> studenti) {
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)))) {
					@SuppressWarnings("unchecked")
					LinkedList<Student> studenti2 =(LinkedList<Student>) in.readObject();
					studenti.clear();
					studenti.addAll(studenti2);
		} catch (EOFException e) {
			
		} catch (FileNotFoundException e1) {
		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
