package parking;

import container.Listas;
import models.Vehiculo;
import ventanas.Inicio;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Vehiculo c1 = new Vehiculo("1234ABC", 0, null, 20);

		Vehiculo c2 = new Vehiculo("1234ABD", 0, null, 30);

		Vehiculo c3 = new Vehiculo("1234ABE", 0, null, 40);

		
		Listas.listaVehiculos.add(c1);
		Listas.listaVehiculos.add(c2);
		Listas.listaVehiculos.add(c3);

		
		Inicio t = new Inicio();
		t.run();
		
		
	}

}
