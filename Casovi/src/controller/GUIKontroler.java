package controller;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import view.GlavniProzor;

public class GUIKontroler {
	private static GlavniProzor glavniProzor;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					glavniProzor = new GlavniProzor();
					glavniProzor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void ugasi(){
		int opcija = JOptionPane.showConfirmDialog(glavniProzor.getContentPane(), "Da li zelite da zatvorite aplikaciju?","Izlaz",JOptionPane.YES_NO_OPTION);
		if(opcija == JOptionPane.YES_OPTION){
			System.exit(0);
		}
	}
}
