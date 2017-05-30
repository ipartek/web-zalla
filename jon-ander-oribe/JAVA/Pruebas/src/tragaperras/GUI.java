package tragaperras;

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
	private JTextPane textPane;
	
	Maquina tragaperras=new Maquina();

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
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(317, 87, 117, 74);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funciones.jugar();
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		txtSaldo = new JTextField();
		txtSaldo.setBounds(0, 241, 434, 20);
		txtSaldo.setText("Saldo: " + tragaperras.getSaldo());
		frame.getContentPane().add(txtSaldo);
		txtSaldo.setColumns(10);
		
		
		JButton btnAgregarSaldo = new JButton("Agregar 20 euros");
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
		
		textPane = new JTextPane();
		textPane.setBounds(61, 11, 246, 132);
		frame.getContentPane().add(textPane);
		
		JButton btnSalirCorriendoCon = new JButton("Salir corriendo con la pasta".toUpperCase());
		btnSalirCorriendoCon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtSaldo.setText("Saldo OBTENIDO: " + tragaperras.getSaldo()+"!!!!!!!");
				tragaperras.borrarSaldo();
			}
		});
		btnSalirCorriendoCon.setBackground(Color.YELLOW);
		btnSalirCorriendoCon.setBounds(61, 168, 373, 62);
		frame.getContentPane().add(btnSalirCorriendoCon);
	}
}
