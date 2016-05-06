package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GUIKontroler;
import model.Student;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;
import view.models.TblModelStudent;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GlavniProzor extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenuItem mntmNewStudent;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenuItem mntmAbout;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnMoreInfo;
	private JButton btnDelete;
	private JButton btnBank;

	/**
	 * Create the frame.
	 */
	public GlavniProzor() {
		setTitle("Casovi");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				controller.GUIKontroler.ugasi();
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 599, 399);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.EAST);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmNewStudent());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}
	private JMenuItem getMntmNewStudent() {
		if (mntmNewStudent == null) {
			mntmNewStudent = new JMenuItem("New student");
			mntmNewStudent.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.pokreniNoviStudentProzor();
				}
			});
			mntmNewStudent.setIcon(new ImageIcon(GlavniProzor.class.getResource("/javax/swing/plaf/metal/icons/ocean/newFolder.gif")));
		}
		return mntmNewStudent;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.setIcon(new ImageIcon(GlavniProzor.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		}
		return mntmSave;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.setIcon(new ImageIcon(GlavniProzor.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		}
		return mntmExit;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.setIcon(new ImageIcon(GlavniProzor.class.getResource("/javax/swing/plaf/metal/icons/Inform.gif")));
		}
		return mntmAbout;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new MigLayout("", "[]", "[][][grow][grow 20]"));
			panel.add(getBtnMoreInfo(), "cell 0 0,grow");
			panel.add(getBtnDelete(), "cell 0 1,grow");
			panel.add(getBtnBank(), "cell 0 3,grow");
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
			table.setModel(new TblModelStudent(GUIKontroler.vratiListuStudenata()));
		}
		return table;
	}
	private JButton getBtnMoreInfo() {
		if (btnMoreInfo == null) {
			btnMoreInfo = new JButton("More info...");
		}
		return btnMoreInfo;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Delete");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow() == -1){
						GUIKontroler.upozoriDaBiraRed();
						return;
					}
					int opcija = JOptionPane.showConfirmDialog(getContentPane(), "Da li ste sigurni?","Brisanje",JOptionPane.YES_NO_OPTION);
					if(opcija == JOptionPane.YES_OPTION){
						TblModelStudent model = (TblModelStudent) table.getModel();
						Student s = model.vratiStudenta(table.getSelectedRow());
						GUIKontroler.izbrisiStudenta(s);
					}
					
				}
			});
		}
		return btnDelete;
	}
	private JButton getBtnBank() {
		if (btnBank == null) {
			btnBank = new JButton("Bank");
			btnBank.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.pokreniBankaProzor();
				}
			});
		}
		return btnBank;
	}
	
	public void osveziStudentTabelu() {
		TblModelStudent model = (TblModelStudent) table.getModel();
		model.staviStudenteUModel(GUIKontroler.vratiListuStudenata());
	}
}
