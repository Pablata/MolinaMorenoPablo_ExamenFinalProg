package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Inicio {

	private JFrame frameInicio;
	private JTextField matriculaField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frameInicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameInicio = new JFrame();
		frameInicio.setTitle("Inicio");
		frameInicio.setBounds(100, 100, 450, 300);
		frameInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameInicio.getContentPane().setLayout(null);
		
		JButton btnEntrada = new JButton("Entrada");
		btnEntrada.setBounds(20, 33, 91, 66);
		frameInicio.getContentPane().add(btnEntrada);
		
		matriculaField = new JTextField();
		matriculaField.setText("Matricula");
		matriculaField.setBounds(131, 123, 157, 53);
		frameInicio.getContentPane().add(matriculaField);
		matriculaField.setColumns(10);
		
		JButton btnPago = new JButton("Pago  y Salida \r\nde Vehiculo");
		btnPago.setHorizontalAlignment(SwingConstants.LEFT);
		btnPago.setBounds(131, 33, 157, 66);
		frameInicio.getContentPane().add(btnPago);
		
		JButton btnCaja = new JButton("Caja");
		btnCaja.setBounds(313, 33, 91, 66);
		frameInicio.getContentPane().add(btnCaja);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(131, 196, 157, 42);
		frameInicio.getContentPane().add(btnRegistrar);
	}
}
