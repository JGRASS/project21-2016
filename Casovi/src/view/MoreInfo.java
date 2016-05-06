package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GUIKontroler;
import model.Cas;
import model.Student;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class MoreInfo extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JTextField txtImeprezime;
	private JLabel lblBrTel;
	private JTextField txtBrTel;
	private JLabel lblEmail;
	private JTextField txtEmail;
	private JLabel lblUplaceno;
	private JTextField txtUplaceno;
	private JButton btnIzmeni;
	private JComboBox comboBox;
	private JLabel lblCasovi;
	private JButton btnSave;
	private JLabel lblOpisCasa;
	private JLabel lblDomaciZadatak;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JTextArea textAreaOpis;
	private JTextArea textAreaDomaci;
	private JButton btnCancel;
	private JButton btnDodajCas;
	private Student s;
	/**
	 * Create the frame.
	 */
	public MoreInfo(Student s) {
		setResizable(false);
		setTitle("More info...");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 403, 595);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow 20][][][][][][grow][][grow][]"));
		contentPane.add(getLabel(), "flowx,cell 0 0");
		contentPane.add(getTxtImeprezime(), "cell 0 0,grow");
		contentPane.add(getLblBrTel(), "flowx,cell 0 1,alignx left,growy");
		contentPane.add(getTxtBrTel(), "cell 0 1,grow");
		contentPane.add(getLblEmail(), "flowx,cell 0 2,alignx left,growy");
		contentPane.add(getTxtEmail(), "cell 0 2,grow");
		contentPane.add(getLblUplaceno(), "flowx,cell 0 3,grow");
		contentPane.add(getTxtUplaceno(), "cell 0 3,grow");
		contentPane.add(getBtnIzmeni(), "cell 0 3,grow");
		contentPane.add(getLblCasovi(), "flowx,cell 0 4");
		contentPane.add(getComboBox(), "cell 0 4,grow");
		contentPane.add(getLblOpisCasa(), "cell 0 5");
		contentPane.add(getScrollPane(), "cell 0 6,grow");
		contentPane.add(getLblDomaciZadatak(), "cell 0 7");
		contentPane.add(getScrollPane_1(), "cell 0 8,grow");
		contentPane.add(getBtnSave(), "flowx,cell 0 9,alignx trailing,growy");
		contentPane.add(getBtnCancel(), "cell 0 9");
		contentPane.add(getBtnDodajCas(), "cell 0 4");
		this.s = s;
		populate();
		
	}

	private void populate() {
		txtImeprezime.setText(s.getImePrezime());
		txtBrTel.setText(s.getBrTel());
		txtEmail.setText(s.getEmail());
		txtUplaceno.setText(String.valueOf(s.getUplaceno()));
		populateCombo(s.getCasovi());
	}
	
	private void populateCombo(LinkedList<Cas> casovi){
		for (Cas cas : casovi) {
			comboBox.addItem(cas.getNaziv());		
		}
		if(!casovi.isEmpty()){
			textAreaOpis.setText(casovi.getFirst().getOpis());
			textAreaDomaci.setText(casovi.getFirst().getDomaci());
		}
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
		}
		return label;
	}
	private JTextField getTxtImeprezime() {
		if (txtImeprezime == null) {
			txtImeprezime = new JTextField();
			txtImeprezime.setHorizontalAlignment(SwingConstants.CENTER);
			txtImeprezime.setFont(new Font("Tahoma", Font.BOLD, 30));
			txtImeprezime.setBorder(null);
			txtImeprezime.setEditable(false);
			txtImeprezime.setText("ImePrezime");
			txtImeprezime.setColumns(10);
		}
		return txtImeprezime;
	}
	private JLabel getLblBrTel() {
		if (lblBrTel == null) {
			lblBrTel = new JLabel("Broj telefona");
			lblBrTel.setPreferredSize(new Dimension(100, 14));
			lblBrTel.setFont(new Font("Tahoma", Font.BOLD, 13));
		}
		return lblBrTel;
	}
	private JTextField getTxtBrTel() {
		if (txtBrTel == null) {
			txtBrTel = new JTextField();
			txtBrTel.setColumns(10);
		}
		return txtBrTel;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setPreferredSize(new Dimension(100, 14));
			lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		}
		return lblEmail;
	}
	private JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField();
			txtEmail.setColumns(10);
		}
		return txtEmail;
	}
	private JLabel getLblUplaceno() {
		if (lblUplaceno == null) {
			lblUplaceno = new JLabel("Uplaceno");
			lblUplaceno.setPreferredSize(new Dimension(30, 14));
			lblUplaceno.setFont(new Font("Tahoma", Font.BOLD, 13));
		}
		return lblUplaceno;
	}
	private JTextField getTxtUplaceno() {
		if (txtUplaceno == null) {
			txtUplaceno = new JTextField();
			txtUplaceno.setEditable(false);
			txtUplaceno.setColumns(10);
		}
		return txtUplaceno;
	}
	private JButton getBtnIzmeni() {
		if (btnIzmeni == null) {
			btnIzmeni = new JButton("Izmeni");
			btnIzmeni.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtUplaceno.setEditable(true);
				}
			});
		}
		return btnIzmeni;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					textAreaDomaci.setText(s.getCasovi().get(comboBox.getSelectedIndex()).getDomaci());
					textAreaOpis.setText(s.getCasovi().get(comboBox.getSelectedIndex()).getOpis());
				}
			});
		}
		return comboBox;
	}
	private JLabel getLblCasovi() {
		if (lblCasovi == null) {
			lblCasovi = new JLabel("Casovi");
			lblCasovi.setPreferredSize(new Dimension(100, 14));
			lblCasovi.setFont(new Font("Tahoma", Font.BOLD, 13));
		}
		return lblCasovi;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			btnSave.setPreferredSize(new Dimension(100, 23));
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					s.setBrTel(txtBrTel.getText());
					s.setImePrezime(txtImeprezime.getText());
					s.setEmail(txtEmail.getText());
					s.setUplaceno(Integer.parseInt(txtUplaceno.getText()));
					GUIKontroler.osvezi(s);
					dispose();
				}
			});
		}
		return btnSave;
	}
	private JLabel getLblOpisCasa() {
		if (lblOpisCasa == null) {
			lblOpisCasa = new JLabel("Opis casa:");
			lblOpisCasa.setFont(new Font("Tahoma", Font.BOLD, 13));
		}
		return lblOpisCasa;
	}
	private JLabel getLblDomaciZadatak() {
		if (lblDomaciZadatak == null) {
			lblDomaciZadatak = new JLabel("Domaci zadatak:");
			lblDomaciZadatak.setFont(new Font("Tahoma", Font.BOLD, 13));
		}
		return lblDomaciZadatak;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextAreaOpis());
		}
		return scrollPane;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setViewportView(getTextAreaDomaci());
		}
		return scrollPane_1;
	}
	private JTextArea getTextAreaOpis() {
		if (textAreaOpis == null) {
			textAreaOpis = new JTextArea();
			textAreaOpis.setLineWrap(true);
			textAreaOpis.setWrapStyleWord(true);
		}
		return textAreaOpis;
	}
	private JTextArea getTextAreaDomaci() {
		if (textAreaDomaci == null) {
			textAreaDomaci = new JTextArea();
			textAreaDomaci.setWrapStyleWord(true);
			textAreaDomaci.setLineWrap(true);
		}
		return textAreaDomaci;
	}
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("Cancel");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnCancel.setPreferredSize(new Dimension(100, 23));
		}
		return btnCancel;
	}
	

	private JButton getBtnDodajCas() {
		if (btnDodajCas == null) {
			btnDodajCas = new JButton("Dodaj cas");
			btnDodajCas.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.pokreniDodajCasProzor(s);
					populate();
				}
			});
		}
		return btnDodajCas;
	}
}
