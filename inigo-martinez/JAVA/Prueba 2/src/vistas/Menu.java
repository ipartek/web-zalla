package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import objetos.*;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Menu extends JFrame implements ChangeListener {

	private JPanel contentPane;
	private JTextField tfTamanio;
	private JTextField tfTamanioMaq;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private static JLabel gifJug = new JLabel("");
	private JRadioButton rdBttnGoblins3 = new JRadioButton("Poderosos Goblins");
	private JRadioButton rdBttnOrcos2 = new JRadioButton("Orcos");
	private JRadioButton rdBttnHumanos1 = new JRadioButton("Humanos");
	private static JLabel gifMaq;
	private JRadioButton rdBttnGoblinsMaq3;
	private JRadioButton rdBttnOrcosMaq2;
	private JRadioButton rdBttnHumanosMaq1;
	static Menu frame = new Menu();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

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
	public Menu() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// BOTON SALIR
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(406, 338, 89, 23);
		contentPane.add(btnSalir);

		JButton btnComenzar = new JButton("Comenzar");
		btnComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tamanio = Integer.parseInt(tfTamanio.getText());
				List<Unidad> ejercJugador = new ArrayList<Unidad>();

				JRadioButton rdSelec = (JRadioButton) buttonGroup.getSelection();
				switch (rdSelec.getName().charAt(rdSelec.getName().length())) {

				case '1':

					crearEjercito("Humano", tamanio, ejercJugador);
					System.out.println(ejercJugador.get(0));
					break;

				case '2':

					crearEjercito("Orco", tamanio, ejercJugador);
					break;

				case '3':

					crearEjercito("Goblin", tamanio, ejercJugador);
					break;

				}

			}
		});
		btnComenzar.setBounds(406, 304, 89, 23);
		contentPane.add(btnComenzar);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 50, 250, 125);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblTamaoDelEjercito = new JLabel("Tama\u00F1o del ejercito");
		lblTamaoDelEjercito.setBounds(10, 11, 134, 23);
		panel.add(lblTamaoDelEjercito);

		tfTamanio = new JTextField();
		tfTamanio.setBounds(154, 12, 86, 20);
		panel.add(tfTamanio);
		tfTamanio.setColumns(10);

		buttonGroup_1.add(rdBttnHumanos1);
		rdBttnHumanos1.setBounds(10, 41, 109, 23);
		panel.add(rdBttnHumanos1);

		buttonGroup_1.add(rdBttnOrcos2);
		rdBttnOrcos2.setBounds(10, 67, 109, 23);
		panel.add(rdBttnOrcos2);

		buttonGroup_1.add(rdBttnGoblins3);
		rdBttnGoblins3.setBounds(10, 93, 184, 23);
		panel.add(rdBttnGoblins3);

		JLabel lblNewLabel = new JLabel("Ejercito del JUGADOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(36, 11, 204, 28);
		contentPane.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(10, 236, 250, 125);
		contentPane.add(panel_1);

		JLabel label = new JLabel("Tama\u00F1o del ejercito");
		label.setBounds(10, 11, 134, 23);
		panel_1.add(label);

		tfTamanioMaq = new JTextField();
		tfTamanioMaq.setColumns(10);
		tfTamanioMaq.setBounds(154, 12, 86, 20);
		panel_1.add(tfTamanioMaq);

		rdBttnHumanosMaq1 = new JRadioButton("Humanos");
		buttonGroup.add(rdBttnHumanosMaq1);
		rdBttnHumanosMaq1.setBounds(10, 41, 109, 23);
		panel_1.add(rdBttnHumanosMaq1);

		rdBttnOrcosMaq2 = new JRadioButton("Orcos");
		buttonGroup.add(rdBttnOrcosMaq2);
		rdBttnOrcosMaq2.setBounds(10, 67, 109, 23);
		panel_1.add(rdBttnOrcosMaq2);

		rdBttnGoblinsMaq3 = new JRadioButton("Poderosos Goblins");
		buttonGroup.add(rdBttnGoblinsMaq3);
		rdBttnGoblinsMaq3.setBounds(10, 93, 184, 23);
		panel_1.add(rdBttnGoblinsMaq3);

		JLabel lblEjercitoDelMquina = new JLabel("Ejercito del M\u00C1QUINA");
		lblEjercitoDelMquina.setHorizontalAlignment(SwingConstants.CENTER);
		lblEjercitoDelMquina.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEjercitoDelMquina.setBounds(36, 197, 204, 28);
		contentPane.add(lblEjercitoDelMquina);

		gifJug.setBounds(270, 50, 120, 125);
		contentPane.add(gifJug);

		gifMaq = new JLabel("");
		gifMaq.setBounds(270, 236, 120, 125);
		contentPane.add(gifMaq);

		rdBttnOrcos2.addChangeListener(this);
		rdBttnHumanos1.addChangeListener(this);
		rdBttnGoblins3.addChangeListener(this);
		rdBttnOrcosMaq2.addChangeListener(this);
		rdBttnHumanosMaq1.addChangeListener(this);
		rdBttnGoblinsMaq3.addChangeListener(this);

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub

		// Cambio GIF jugador
		if (rdBttnOrcos2.isSelected())
			gifJug.setIcon(new javax.swing.ImageIcon(
					"C:/desarrollo/web-zalla/inigo-martinez/JAVA/Prueba 2/src/img/orcos.gif"));
		else if (rdBttnHumanos1.isSelected())
			gifJug.setIcon(new javax.swing.ImageIcon(
					"C:/desarrollo/web-zalla/inigo-martinez/JAVA/Prueba 2/src/img/humans.gif"));
		else if (rdBttnGoblins3.isSelected())
			gifJug.setIcon(new javax.swing.ImageIcon(
					"C:/desarrollo/web-zalla/inigo-martinez/JAVA/Prueba 2/src/img/goblins.gif"));

		// Cambio GIF M�quina
		if (rdBttnOrcosMaq2.isSelected())
			gifMaq.setIcon(new javax.swing.ImageIcon(
					"C:/desarrollo/web-zalla/inigo-martinez/JAVA/Prueba 2/src/img/orcos.gif"));
		else if (rdBttnHumanosMaq1.isSelected())
			gifMaq.setIcon(new javax.swing.ImageIcon(
					"C:/desarrollo/web-zalla/inigo-martinez/JAVA/Prueba 2/src/img/humans.gif"));
		else if (rdBttnGoblinsMaq3.isSelected())
			gifMaq.setIcon(new javax.swing.ImageIcon(
					"C:/desarrollo/web-zalla/inigo-martinez/JAVA/Prueba 2/src/img/goblins.gif"));

	}

	public static void crearEjercito(String raza, int tamanio, List<Unidad> ejercito) {
		Unidad soldado;

		for (int i = 0; i < tamanio; i++) {

			switch (raza) {
			case "Humano":
				soldado = new Humano();
				ejercito.add(soldado);
				break;
			case "Orco":
				soldado = new Orco();
				ejercito.add(soldado);
				break;
			case "Goblin":
				soldado = new Goblin();
				ejercito.add(soldado);
				break;
			}

		}

	}
}
