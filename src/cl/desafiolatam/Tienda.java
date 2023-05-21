package cl.desafiolatam;

public class Tienda extends Persona{
	private Vendedor vendedor;
	private Vehiculo vehiculo;
	private int stock;
	
	
	public Tienda () {
		vendedor = new Vendedor();
		vehiculo = new Vehiculo();
	}
	
	public Tienda (Vendedor vendedor, Vehiculo vehiculo, int stock) {
		this.vendedor =  vendedor;
		this.vehiculo = vehiculo;
		this.stock = stock; 
	}
	
	public int existeStock() {
		return(stock);
	}
	
}
