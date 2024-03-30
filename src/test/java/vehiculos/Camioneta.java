package vehiculos;

public class Camioneta extends Vehiculo {
	
	private boolean volco;
	
	private static int cantidadVehiculos;
	
	
	public Camioneta (String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		
		this.volco = volco;
		
		//this.setVelocidadMaxima(90); this.setTraccion("4X4");
		
		//this.setPlaca(placa); this.setPuertas(puertas); this.setNombre(nombre); this.setPrecio(precio); this.setPrecio(precio); this.setPeso(peso); this.setFabricante(fabricante); this.volco = volco;

	}
	
	public boolean isVolco () {return(this.volco);}
	
	//@Override No es necesario pues los metodos statics se ocultan, no son sobre escritos
	public static int getCantidadVehiculos () {return(cantidadVehiculos);}
}
