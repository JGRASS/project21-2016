package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Dimension;

public class Banka extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblUkupnoUplaceno;
	private JTextField txtIznos;
	private JButton btnOK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Banka frame = new Banka();
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
	public Banka() {
		setResizable(false);
		setTitle("Bank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.SOUTH);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new MigLayout("", "[grow][]", "[][]"));
			panel.add(getLblUkupnoUplaceno(), "cell 0 0,alignx right");
			panel.add(getTxtIznos(), "cell 1 0,grow");
			panel.add(getBtnOK(), "cell 1 1,alignx right");
		}
		return panel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setFillsViewportHeight(true);
		}
		return table;
	}
	private JLabel getLblUkupnoUplaceno() {
		if (lblUkupnoUplaceno == null) {
			lblUkupnoUplaceno = new JLabel("Ukupno uplaceno:");
			lblUkupnoUplaceno.setFont(new Font("Tahoma", Font.BOLD, 13));
		}
		return lblUkupnoUplaceno;
	}
	private JTextField getTxtIznos() {
		if (txtIznos == null) {
			txtIznos = new JTextField();
			txtIznos.setColumns(10);
		}
		return txtIznos;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.setPreferredSize(new Dimension(100, 23));
		}
		return btnOK;
	}
}
