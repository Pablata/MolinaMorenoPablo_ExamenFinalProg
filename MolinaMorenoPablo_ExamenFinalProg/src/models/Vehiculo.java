package models;

import java.sql.Date;

public class Vehiculo {

	
	
	protected String matricula;
	protected Date fechaEntrada;
	protected Date fechaSalida;
	protected float precio;
	

	
	public Vehiculo(String matricula, Date fechaEntrada, Date fechaSalida, float precio) {
		super();
		this.matricula = matricula;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.precio = precio;
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
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
