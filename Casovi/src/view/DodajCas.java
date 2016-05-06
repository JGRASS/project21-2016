package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GUIKontroler;
import model.Student;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajCas extends JFrame {

	private JPanel contentPane;
	private JLabel lblNaziv;
	private JTextField txtNaziv;
	private JLabel lblOpis;
	private JTextArea txtOpis;
	private JLabel lblDomaciZadatak;
	private JTextArea txtDomaci;
	private JButton btnCancel;
	private JButton btnSave;
	private Student s;
	/**
	 * Create the frame.
	 */
	public DodajCas(Student s) {
		setTitle("Dodavanje casa");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 372, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][grow 150][grow][]"));
		contentPane.add(getLblNaziv(), "cell 0 0,alignx center,aligny center");
		contentPane.add(getTxtNaziv(), "cell 1 0,growx");
		contentPane.add(getLblOpis(), "cell 0 1,alignx center,aligny center");
		contentPane.add(getTxtOpis(), "cell 1 1,grow");
		contentPane.add(getLblDomaciZadatak(), "cell 0 2,alignx center,aligny center");
		contentPane.add(getTxtDomaci(), "cell 1 2,grow");
		contentPane.add(getBtnSave(), "flowx,cell 1 3,grow");
		contentPane.add(getBtnCancel(), "cell 1 3,grow");
		this.s = s;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv:");
			lblNaziv.setFont(new Font("Tahoma", Font.BOLD, 13));
		}
		return lblNaziv;
	}
	private JTextField getTxtNaziv() {
		if (txtNaziv == null) {
			txtNaziv = new JTextField();
			txtNaziv.setColumns(10);
		}
		return txtNaziv;
	}
	private JLabel getLblOpis() {
		if (lblOpis == null) {
			lblOpis = new JLabel("Opis:");
			lblOpis.setFont(new Font("Tahoma", Font.BOLD, 13));
		}
		return lblOpis;
	}
	private JTextArea getTxtOpis() {
		if (txtOpis == null) {
			txtOpis = new JTextArea();
		}
		return txtOpis;
	}
	private JLabel getLblDomaciZadatak() {
		if (lblDomaciZadatak == null) {
			lblDomaciZadatak = new JLabel("Domaci zadatak:");
			lblDomaciZadatak.setFont(new Font("Tahoma", Font.BOLD, 13));
		}
		return lblDomaciZadatak;
	}
	private JTextArea getTxtDomaci() {
		if (txtDomaci == null) {
			txtDomaci = new JTextArea();
		}
		return txtDomaci;
	}
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("Cancel");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
		}
		return btnCancel;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.dodajCas(txtNaziv.getText(), txtOpis.getText(), txtDomaci.getText(),s);
					dispose();
				}
			});
		}
		return btnSave;
	}
}
