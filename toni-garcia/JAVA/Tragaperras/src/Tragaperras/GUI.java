package Tragaperras;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Color;

public class GUI {

	private JFrame frame;
	private JButton btnNewButton;
	private JTextField txtSaldo;
	private JTextPane textPane_3;
	
	Maquina tragaperras=new Maquina();
	private JTextPane textPane;
	private JTextPane textPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnNewButton = new JButton("Apostar");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(317, 87, 117, 74);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Funciones.jugar();
				tragaperras.setSaldo(-Maquina.precioPartida);
				txtSaldo.setText("Saldo: " + tragaperras.getSaldo() +"              "+"Premio: " + Funciones.premio);
				textPane.setText(Funciones.frutasArray[0].toUpperCase());
				textPane_1.setText(Funciones.frutasArray[1].toUpperCase());
				textPane_3.setText(Funciones.frutasArray[2].toUpperCase());
				Funciones.premio(Funciones.frutasArray);
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		txtSaldo = new JTextField();
		txtSaldo.setBounds(0, 241, 434, 20);
		txtSaldo.setText("Saldo: " + tragaperras.getSaldo());
		frame.getContentPane().add(txtSaldo);
		txtSaldo.setColumns(10);
		
		
		JButton btnAgregarSaldo = new JButton("Agregar 20$");
		btnAgregarSaldo.setBackground(Color.GREEN);
		btnAgregarSaldo.setForeground(Color.BLACK);
		btnAgregarSaldo.setBounds(317, 0, 117, 91);
		btnAgregarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tragaperras.setSaldo(20);
				txtSaldo.setText("Saldo: " + tragaperras.getSaldo());
				
			}
		});
		frame.getContentPane().add(btnAgregarSaldo);
		
		textPane_3 = new JTextPane();
		textPane_3.setBounds(213, 11, 94, 74);
		frame.getContentPane().add(textPane_3);
		
		JButton btnSalirCorriendoCon = new JButton("Salir corriendo con la pasta".toUpperCase());
		btnSalirCorriendoCon.setForeground(Color.WHITE);
		btnSalirCorriendoCon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tragaperras.setSaldo(Funciones.premio);
				txtSaldo.setText("Saldo OBTENIDO: " + tragaperras.getSaldo()+"$ !!!!!!!");
				tragaperras.borrarSaldo();
			}
		});
		btnSalirCorriendoCon.setBackground(Color.BLUE);
		btnSalirCorriendoCon.setBounds(30, 168, 373, 62);
		frame.getContentPane().add(btnSalirCorriendoCon);
		
		textPane = new JTextPane();
		textPane.setBounds(114, 11, 94, 74);
		frame.getContentPane().add(textPane);
		
		textPane_1 = new JTextPane();
		textPane_1.setBounds(10, 11, 94, 74);
		frame.getContentPane().add(textPane_1);
	}
}
