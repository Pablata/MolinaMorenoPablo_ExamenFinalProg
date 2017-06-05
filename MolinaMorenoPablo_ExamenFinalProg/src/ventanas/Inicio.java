package ventanas;

import java.awt.EventQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import container.Listas;

import models.Vehiculo;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Inicio {

	protected JFrame frameInicio;
	private JTextField matriculaField;
	private JButton btnEntrada;
	private JButton btnPago;
	private JButton btnCaja;
	private JButton btnRegistrar;
	private String entrada;

	

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

		btnEntrada = new JButton("Entrada");
		btnEntrada.setBounds(20, 33, 91, 66);
		btnEntrada.setEnabled(false);
		frameInicio.getContentPane().add(btnEntrada);

		matriculaField = new JTextField();
		matriculaField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				matriculaField.setText("");
			}
		});
		matriculaField.setText("Matricula");
		matriculaField.setBounds(131, 123, 157, 53);
		frameInicio.getContentPane().add(matriculaField);
		matriculaField.setColumns(10);

		btnPago = new JButton("Pago  y Salida \r\nde Vehiculo");
		btnPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Pago ventanaPago = new Pago();
				ventanaPago.framePagos.setVisible(true);
				frameInicio.dispose();

			}
		});
		btnPago.setHorizontalAlignment(SwingConstants.LEFT);
		btnPago.setBounds(131, 33, 157, 66);
		frameInicio.getContentPane().add(btnPago);

		btnCaja = new JButton("Caja");
		btnCaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Caja ventanaCaja = new Caja();
				ventanaCaja.frameCaja.setVisible(true);
				frameInicio.dispose();
				
			}
		});
		
		btnCaja.setBounds(313, 33, 91, 66);
		frameInicio.getContentPane().add(btnCaja);

		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				entrada = matriculaField.getText().replaceAll(" ", "").toUpperCase();
				boolean esCorrecto = false;

				// 4 numeros, 3 letras al final
				Pattern tresLetrasFinal = Pattern.compile("^\\d{4}[A-Za-z]{3}");
				Matcher matricula3letras = tresLetrasFinal.matcher(entrada);

				// 1 o2 letras, 4 numeros, 2 letras
				Pattern cuatroNumerosCentro = Pattern.compile("^\\d{1,2}[A-Za-z]{4}\\d{2}");
				Matcher matricula4numeros = cuatroNumerosCentro.matcher(entrada);

				if (matricula3letras.matches() || matricula4numeros.matches()) {

					for (Vehiculo c : Listas.listaVehiculos) {

						if (!c.getMatricula().contains(entrada)) {

							esCorrecto = true;
							JOptionPane.showMessageDialog(null,
									"La matricula " + entrada + " esta guardada, cree una nueva");

						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "Formato Matricula INcorrecto", "Error de formato",
							JOptionPane.ERROR_MESSAGE);

				}
				if (!esCorrecto) {

					JOptionPane.showMessageDialog(null, "La matricula " + entrada + " no esta guardada");

					
					
					
					
					
					
					Pago ventanaPago = new Pago();
					ventanaPago.matriculaField.setText(entrada);
					
					ventanaPago.framePagos.setVisible(true);

					frameInicio.dispose();

				}
			}
		});
		btnRegistrar.setBounds(131, 196, 157, 42);
		frameInicio.getContentPane().add(btnRegistrar);
	}

	public void run() {
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

}
