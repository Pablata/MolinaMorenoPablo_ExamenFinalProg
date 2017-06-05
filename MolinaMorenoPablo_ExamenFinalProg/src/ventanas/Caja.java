package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import container.Listas;
import models.Vehiculo;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Caja {

	protected JFrame frameCaja;
	private JButton btnEntrada;
	private JButton btnCaja;
	private JButton btnPagos;
	private JLabel lblTotalGanado;
	private JLabel lblDia;
	private int indiceVehiculos;

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

		lblTotalGanado = new JLabel("Total Ganado");
		lblTotalGanado.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalGanado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotalGanado.setBounds(151, 200, 108, 19);
		frameCaja.getContentPane().add(lblTotalGanado);

		lblDia = new JLabel("Dia");
		lblDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblDia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDia.setBounds(151, 111, 108, 19);
		frameCaja.getContentPane().add(lblDia);

		btnCaja = new JButton("Caja");
		btnCaja.setBounds(317, 11, 91, 66);
		btnCaja.setEnabled(false);
		frameCaja.getContentPane().add(btnCaja);

		btnPagos = new JButton("Pago  y Salida \r\nde Vehiculo");
		btnPagos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pago ventanaPago = new Pago();
				ventanaPago.framePagos.setVisible(true);
				frameCaja.dispose();
			}
		});
		btnPagos.setHorizontalAlignment(SwingConstants.LEFT);
		btnPagos.setBounds(135, 11, 157, 66);
		frameCaja.getContentPane().add(btnPagos);

		btnEntrada = new JButton("Entrada");
		btnEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Inicio ventanaInicio = new Inicio();
				ventanaInicio.frameInicio.setVisible(true);
				frameCaja.dispose();
			}
		});
		btnEntrada.setBounds(24, 11, 91, 66);
		frameCaja.getContentPane().add(btnEntrada);
		
		calcular();
	}
	
	public void calcular() {

		if (!Listas.listaVehiculos.isEmpty()) {
			Vehiculo c = Listas.listaVehiculos.get(indiceVehiculos);
//		
//		lblTotalGanado.setText("" + c.getPrecio());
		
		float total=0;
		for (Vehiculo c1: Listas.listaVehiculos){
			total +=c1.getPrecio();
			
	}
		lblTotalGanado.setText("" + total);
	
		}
	}

	private int nextDia() {
		++indiceVehiculos;
		if (indiceVehiculos == Listas.listaVehiculos.size()) {
			indiceVehiculos = 0;
		}
		return indiceVehiculos;
	}

	private int prevDia() {
		--indiceVehiculos;
		if (indiceVehiculos < 0) {
			indiceVehiculos = Listas.listaVehiculos.size() - 1;
		}
		return indiceVehiculos;
	}
}
