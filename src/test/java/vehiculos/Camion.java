package vehiculos;

public class Camion extends Vehiculo{
	
	private int ejes;
	
	private static int cantidadVehiculos;
	
	
	public Camion (String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		
		this.ejes = ejes;
		
		//this.setPuertas(2); this.setVelocidadMaxima(80); this.setTraccion("4X2");
		
		//this.setPlaca (placa); this.setNombre(nombre); this.setPrecio(precio); this.setPrecio(precio); this.setPeso(peso); this.setFabricante(fabricante); this.ejes = ejes;
		
	}
	
	public int getEjes () {return(this.ejes);}
	
	public void setEjes (int ejes) {this.ejes = ejes;}
	
	//@Override No es necesario pues los metodos statics se ocultan, no son sobre escritos
	public static int getCantidadVehiculos () {return(cantidadVehiculos);}

}
