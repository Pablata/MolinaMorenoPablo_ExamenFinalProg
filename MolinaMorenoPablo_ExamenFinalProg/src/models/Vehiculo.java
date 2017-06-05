package models;

import java.sql.Date;

public class Vehiculo {

	protected String matricula;
	protected String fechaEntrada;
	protected String fechaSalida;
	protected float precio;

	public Vehiculo(String matricula, String fechaEntrada, String fechaSalida, float precio) {
		super();
		this.matricula = matricula;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.precio = precio;
	}

	public Vehiculo() {
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida
				+ ", precio=" + precio + "]";
	}

}
