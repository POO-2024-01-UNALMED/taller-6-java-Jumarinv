import test.*;
import vehiculos.*;


public class Main {
	
	public static void main (String[] args) {
		
		Pais p = new Pais("Colombia");
		
		Fabricante f = new Fabricante("Renault", p);
		
		/*Vehiculo ve = new Automovil("AA", "Carro", 100, 20, f, 4);
		
		boolean ok = false;
		if(ve.getPuertas() == 4 && ve.getTraccion().equals("FWD")
				&& ve.getVelocidadMaxima() ==  100) {
			ok = true;
		}
		
		System.out.println("TestAutomovil: " + ok);
		
		Vehiculo ve = new Camioneta("CC", 5, "Ford", 500, 150, f, true);
		
		boolean ok = false;
		if(ve.getTraccion().equals("4X4")
				&& ve.getVelocidadMaxima() ==  90) {
			ok = true;
		
			}
		
		System.out.println("TestAutomovil: " + ok);*/
		
		
		Vehiculo ve = new Vehiculo("TEST", 4, 4, "SS", 100, 10, "AWD", f);
		
		boolean ok = false;
		if(ve.getPlaca().equals("TEST") && ve.getPuertas() == 4 && ve.getVelocidadMaxima() == 4
				&& ve.getNombre().equals("SS") && ve.getPrecio() ==  100 && ve.getPeso() == 10
				&& ve.getTraccion().equals("AWD")) {
			ok = true;
		}
		
		System.out.println("TestAutomovil: " + ok);
		
	}
}
