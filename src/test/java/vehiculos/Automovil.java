package vehiculos;

public class Automovil extends Vehiculo {
	
	private int puestos;
	
	private static int cantidadVehiculos;
	
	
	public Automovil (String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		
		this.puestos = puestos;
		
		//this.setPuertas(4); this.setVelocidadMaxima(100); this.setTraccion("FWD");
		
		//this.setPlaca (placa); this.setNombre(nombre); this.setPrecio(precio); this.setPrecio(precio); this.setPeso(peso); this.setFabricante(fabricante); this.puestos = puestos;
		
	}
	
	public int getPuestos () {return (this.puestos);}
	
	public void setPuestos(int puestos) {this.puestos = puestos;}
	
	//@Override No es necesario pues los metodos statics se ocultan, no son sobre escritos
	public static int getCantidadVehiculos () {return(cantidadVehiculos);}

}
