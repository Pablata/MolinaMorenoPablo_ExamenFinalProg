package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Caja {

	private JFrame frameCaja;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caja window = new Caja();
					window.frameCaja.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Caja() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameCaja = new JFrame();
		frameCaja.setTitle("Caja");
		frameCaja.setBounds(100, 100, 450, 300);
		frameCaja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCaja.getContentPane().setLayout(null);
		
		JLabel lblTotalGanado = new JLabel("Total Ganado");
		lblTotalGanado.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalGanado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotalGanado.setBounds(151, 200, 108, 19);
		frameCaja.getContentPane().add(lblTotalGanado);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblDia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDia.setBounds(151, 111, 108, 19);
		frameCaja.getContentPane().add(lblDia);
		
		JButton btnVolver = new JButton("Volver a Inicio");
		btnVolver.setBounds(151, 11, 99, 65);
		frameCaja.getContentPane().add(btnVolver);
	}
}
