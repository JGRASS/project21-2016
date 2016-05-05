package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MoreInfo extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JTextField txtImeprezime;
	private JLabel lblBrTel;
	private JTextField txtBrTel;
	private JLabel lblEmail;
	private JTextField textField;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MoreInfo frame = new MoreInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MoreInfo() {
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
		contentPane.add(getTextField(), "cell 0 2,grow");
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
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblUplaceno() {
		if (lblUplaceno == null) {
			lblUplaceno = new JLabel("Uplaceno");
			lblUplaceno.setPreferredSize(new Dimension(50, 14));
			lblUplaceno.setFont(new Font("Tahoma", Font.BOLD, 13));
		}
		return lblUplaceno;
	}
	private JTextField getTxtUplaceno() {
		if (txtUplaceno == null) {
			txtUplaceno = new JTextField();
			txtUplaceno.setColumns(10);
		}
		return txtUplaceno;
	}
	private JButton getBtnIzmeni() {
		if (btnIzmeni == null) {
			btnIzmeni = new JButton("Izmeni");
		}
		return btnIzmeni;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
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
			btnCancel.setPreferredSize(new Dimension(100, 23));
		}
		return btnCancel;
	}
}