package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import container.Listas;
import models.Vehiculo;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pago {

	protected JFrame framePagos;
	protected JTextField matriculaField;
	private JTextField entradaField;
	private JTextField salidaField;
	private JTextField importeField;
	private JButton btnSalir;
	private JButton  btnEntrada;
	private JButton btnPagos ;
	private JButton btnCaja ;
	private JLabel lblTotal;
	private JLabel lblCambio;
	private int indiceVehiculos;
	
	//horas y tiempo 
	
	private long time_start;
	private int hora;
	private int minutos;
	private int segundos;
	private int dia;
	private int mes;
	private int anio;
	private int diaSemana;
	private Calendar calendario;
	

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
		
		btnEntrada = new JButton("Entrada");
		btnEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Inicio ventanaInicio = new Inicio();
				ventanaInicio.frameInicio.setVisible(true);
				framePagos.dispose();
			}
		});
		btnEntrada.setBounds(28, 24, 91, 66);
		framePagos.getContentPane().add(btnEntrada);
		
		btnPagos = new JButton("Pago  y Salida \r\nde Vehiculo");
		btnPagos.setEnabled(false);
		btnPagos.setHorizontalAlignment(SwingConstants.LEFT);
		btnPagos.setBounds(139, 24, 157, 66);
		framePagos.getContentPane().add(btnPagos);
		
		btnCaja = new JButton("Caja");
		btnCaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Caja ventanaCaja = new Caja();
				ventanaCaja.frameCaja.setVisible(true);
				framePagos.dispose();
			}
		});
		btnCaja.setBounds(321, 24, 91, 66);
		framePagos.getContentPane().add(btnCaja);
		
		matriculaField = new JTextField();
//		matriculaField.addFocusListener(new FocusAdapter() {
//			@Override
//			public void focusGained(FocusEvent arg0) {
//				matriculaField.setText("");
//			}
//		});
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
		salidaField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				salidaField.setText("");
			}
		});
		salidaField.setText("Hora Salida\r\n");
		salidaField.setToolTipText("");
		salidaField.setColumns(10);
		salidaField.setBounds(28, 253, 222, 38);
		framePagos.getContentPane().add(salidaField);
		
		btnSalir = new JButton("Pagar y Salir del Parking");
		btnSalir.setBounds(28, 313, 222, 60);
		framePagos.getContentPane().add(btnSalir);
		
		lblTotal = new JLabel("Total a pagar:");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotal.setBounds(290, 127, 107, 45);
		framePagos.getContentPane().add(lblTotal);
		
		lblCambio = new JLabel("Cambio:");
		lblCambio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCambio.setBounds(290, 313, 107, 45);
		framePagos.getContentPane().add(lblCambio);
		
		importeField = new JTextField();
		importeField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				importeField.setText("");
			}
		});
		importeField.setText("ImporteEntregado");
		importeField.setBounds(278, 253, 119, 38);
		framePagos.getContentPane().add(importeField);
		importeField.setColumns(10);

		
//		if (!Listas.listaVehiculos.isEmpty()) {
//			Vehiculo c = Listas.listaVehiculos.get(indiceVehiculos);
//		
//		lblTotalGanado.setText("" + c.getPrecio());
//		
//		String fecha="";
//		for (Vehiculo c1: Listas.listaVehiculos){
//			fecha +=c1.getFechaEntrada();
//			
//	}
//		
//		entradaField.setText("" + fecha);
//	
//		}
		
		
		
		
		calendario = new GregorianCalendar();
		
		hora = calendario.get(Calendar.HOUR_OF_DAY);
		minutos = calendario.get(Calendar.MINUTE);
		segundos = calendario.get(Calendar.SECOND);
		dia = calendario.get(Calendar.DAY_OF_MONTH);
		mes = calendario.get(Calendar.MONTH);
		anio = calendario.get(Calendar.YEAR);
	
		
		entradaField.setText("" + hora);
	
		
		}
			
		
		
		
		
	

}
