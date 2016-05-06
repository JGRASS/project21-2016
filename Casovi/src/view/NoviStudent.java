package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GUIKontroler;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NoviStudent extends JFrame {

	private JPanel contentPane;
	private JLabel lblImeIPrezime;
	private JTextField txtImeIPrezime;
	private JLabel lblBrojTelefona;
	private JTextField txtBrojtelefona;
	private JLabel lblEmail;
	private JTextField txtEmail;
	private JButton btnAdd;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoviStudent frame = new NoviStudent();
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
	public NoviStudent() {
		setResizable(false);
		setTitle("New Student");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 326, 198);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][][][grow][]"));
		contentPane.add(getLblImeIPrezime(), "cell 0 0,alignx left,growy");
		contentPane.add(getTxtImeIPrezime(), "cell 1 0,grow");
		contentPane.add(getLblBrojTelefona(), "cell 0 1,alignx left,growy");
		contentPane.add(getTxtBrojtelefona(), "cell 1 1,grow");
		contentPane.add(getLblEmail(), "cell 0 2,alignx left,growy");
		contentPane.add(getTxtEmail(), "cell 1 2,grow");
		contentPane.add(getBtnAdd(), "flowx,cell 1 4,grow");
		contentPane.add(getBtnCancel(), "cell 1 4,grow");
	}

	private JLabel getLblImeIPrezime() {
		if (lblImeIPrezime == null) {
			lblImeIPrezime = new JLabel("Ime i prezime");
			lblImeIPrezime.setFont(new Font("Tahoma", Font.BOLD, 13));
		}
		return lblImeIPrezime;
	}
	private JTextField getTxtImeIPrezime() {
		if (txtImeIPrezime == null) {
			txtImeIPrezime = new JTextField();
			txtImeIPrezime.setColumns(10);
		}
		return txtImeIPrezime;
	}
	private JLabel getLblBrojTelefona() {
		if (lblBrojTelefona == null) {
			lblBrojTelefona = new JLabel("Broj telefona");
			lblBrojTelefona.setFont(new Font("Tahoma", Font.BOLD, 13));
		}
		return lblBrojTelefona;
	}
	private JTextField getTxtBrojtelefona() {
		if (txtBrojtelefona == null) {
			txtBrojtelefona = new JTextField();
			txtBrojtelefona.setColumns(10);
		}
		return txtBrojtelefona;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
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
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.dodajStudenta(txtImeIPrezime.getText(),txtBrojtelefona.getText(),txtEmail.getText());
					dispose();
				}
			});
		}
		return btnAdd;
	}
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("Cancel");
		}
		return btnCancel;
	}
}
