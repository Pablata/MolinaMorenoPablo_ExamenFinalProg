package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Pago {

	protected JFrame framePagos;
	private JTextField matriculaField;
	private JTextField entradaField;
	private JTextField salidaField;
	private JTextField importeField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pago window = new Pago();
					window.framePagos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pago() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framePagos = new JFrame();
		framePagos.setTitle("Pago y Salida de Vehiculo");
		framePagos.setBounds(100, 100, 450, 422);
		framePagos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePagos.getContentPane().setLayout(null);
		
		JButton btnEntrada = new JButton("Entrada");
		btnEntrada.setBounds(28, 24, 91, 66);
		framePagos.getContentPane().add(btnEntrada);
		
		JButton btnPagos = new JButton("Pago  y Salida \r\nde Vehiculo");
		btnPagos.setHorizontalAlignment(SwingConstants.LEFT);
		btnPagos.setBounds(139, 24, 157, 66);
		framePagos.getContentPane().add(btnPagos);
		
		JButton btnCaja = new JButton("Caja");
		btnCaja.setBounds(321, 24, 91, 66);
		framePagos.getContentPane().add(btnCaja);
		
		matriculaField = new JTextField();
		matriculaField.setText("Matricula");
		matriculaField.setToolTipText("");
		matriculaField.setBounds(28, 112, 222, 38);
		framePagos.getContentPane().add(matriculaField);
		matriculaField.setColumns(10);
		
		entradaField = new JTextField();
		entradaField.setText("Hora Entrada\r\n");
		entradaField.setToolTipText("");
		entradaField.setColumns(10);
		entradaField.setBounds(28, 184, 222, 38);
		framePagos.getContentPane().add(entradaField);
		
		salidaField = new JTextField();
		salidaField.setText("Hora Salida\r\n");
		salidaField.setToolTipText("");
		salidaField.setColumns(10);
		salidaField.setBounds(28, 253, 222, 38);
		framePagos.getContentPane().add(salidaField);
		
		JButton btnSalir = new JButton("New button");
		btnSalir.setBounds(28, 313, 222, 60);
		framePagos.getContentPane().add(btnSalir);
		
		JLabel lblTotal = new JLabel("Total a pagar:");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotal.setBounds(290, 127, 107, 45);
		framePagos.getContentPane().add(lblTotal);
		
		JLabel lblCambio = new JLabel("Cambio:");
		lblCambio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCambio.setBounds(290, 313, 107, 45);
		framePagos.getContentPane().add(lblCambio);
		
		importeField = new JTextField();
		importeField.setText("ImporteEntregado");
		importeField.setBounds(278, 253, 119, 38);
		framePagos.getContentPane().add(importeField);
		importeField.setColumns(10);
	}

}
