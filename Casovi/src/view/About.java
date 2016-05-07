package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JLabel;

public class About extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel jelenaLbl;
	private JLabel djordjeLbl;
	private JLabel milosLbl;
	private JLabel lblJelenaMarjanovic;
	private JLabel lblMilosLjubisavljevic;
	private JLabel lblDjordjeNestorovic;
	private JLabel copyrightLbl;
	private JPanel panel_2;

	

	/**
	 * Create the frame.
	 */
	public About() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/javax/swing/plaf/metal/icons/Inform.gif")));
		setTitle("About");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.CENTER);
		contentPane.add(getPanel_1(), BorderLayout.SOUTH);
		contentPane.add(getPanel_2(), BorderLayout.NORTH);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getJelenaLbl());
			panel.add(getMilosLbl());
			panel.add(getDjordjeLbl());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setPreferredSize(new Dimension(10, 120));
			panel_1.add(getLblJelenaMarjanovic());
			panel_1.add(getLblMilosLjubisavljevic());
			panel_1.add(getLblDjordjeNestorovic());
			panel_1.add(getCopyrightLbl());
		}
		return panel_1;
	}
	private JLabel getJelenaLbl() {
		if (jelenaLbl == null) {
			jelenaLbl = new JLabel("");
			jelenaLbl.setPreferredSize(new Dimension(200, 200));
			ImageIcon imageIcon = new ImageIcon(new ImageIcon(About.class.getResource("/resources/Jelena.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
			jelenaLbl.setIcon(imageIcon);
		}
		return jelenaLbl;
	}
	private JLabel getDjordjeLbl() {
		if (djordjeLbl == null) {
			djordjeLbl = new JLabel("");
			djordjeLbl.setPreferredSize(new Dimension(200, 200));
			ImageIcon imageIcon = new ImageIcon(new ImageIcon(About.class.getResource("/resources/Djordje.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
			djordjeLbl.setIcon(imageIcon);
		}
		return djordjeLbl;
	}
	private JLabel getMilosLbl() {
		if (milosLbl == null) {
			milosLbl = new JLabel("");
			milosLbl.setPreferredSize(new Dimension(200, 200));
			ImageIcon imageIcon = new ImageIcon(new ImageIcon(About.class.getResource("/resources/Milos.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
			milosLbl.setIcon(imageIcon);
		}
		return milosLbl;
	}
	private JLabel getLblJelenaMarjanovic() {
		if (lblJelenaMarjanovic == null) {
			lblJelenaMarjanovic = new JLabel("Jelena Marjanovic");
			lblJelenaMarjanovic.setPreferredSize(new Dimension(170, 14));
		}
		return lblJelenaMarjanovic;
	}
	private JLabel getLblMilosLjubisavljevic() {
		if (lblMilosLjubisavljevic == null) {
			lblMilosLjubisavljevic = new JLabel("Milos Ljubisavljevic");
			lblMilosLjubisavljevic.setPreferredSize(new Dimension(170, 14));
		}
		return lblMilosLjubisavljevic;
	}
	private JLabel getLblDjordjeNestorovic() {
		if (lblDjordjeNestorovic == null) {
			lblDjordjeNestorovic = new JLabel("Djordje Nestorovic");
			lblDjordjeNestorovic.setPreferredSize(new Dimension(170, 14));
		}
		return lblDjordjeNestorovic;
	}
	private JLabel getCopyrightLbl() {
		if (copyrightLbl == null) {
			copyrightLbl = new JLabel("\u00A9 COPYRIGHT All rights recieved");
			copyrightLbl.setPreferredSize(new Dimension(620, 80));
//			ImageIcon imageIcon = new ImageIcon(new ImageIcon(About.class.getResource("/resources/Copyright.jpg")).getImage().getScaledInstance(100, 40, Image.SCALE_DEFAULT));
//			copyrightLbl.setIcon(imageIcon);
		}
		return copyrightLbl;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setPreferredSize(new Dimension(10, 30));
		}
		return panel_2;
	}
}
