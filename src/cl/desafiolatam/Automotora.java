package cl.desafiolatam;

public class Automotora {

	public static void main(String[] args) {
		Taxi taxi1 = new Taxi("amarillo con negro", "BVGF22", 5000);
		int vuelto= taxi1.pagarPasaje(6000);
		System.out.println(vuelto);
		
		
		Bus bus1 = new Bus ("azul", "FFHN55", 34);
		int cantidadDeAsiento = bus1.getCantidadDeAsientos();
		System.out.println(cantidadDeAsiento);
		
		MiniBus minibus1 = new MiniBus("rosado", "GGFF54", 45, "rural");
		System.out.println(minibus1);
		
		Vendedor vendedor1 = new Vendedor("18487543", "Juanito", "los cipreces 23");
		
		Tienda tienda1= new Tienda (vendedor1, taxi1, 10);
		int stockfinal = tienda1.existeStock();
		System.out.println(stockfinal);
		
	}
	
	
	
	

}
