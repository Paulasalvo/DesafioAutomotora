package cl.desafiolatam;

public class MiniBus extends Bus{
	private String tipoViaje;
	
	
	public MiniBus() {
		
	}
	public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
		super (color, patente, cantidadDeAsientos);
		this.tipoViaje= tipoViaje;
		
	}
	public String getTipoViaje() {
		return tipoViaje;
	}
	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	}
	@Override
	public String toString() {
		return super.toString()+ "MiniBus [tipoViaje=" + tipoViaje + "]";
	}
	
	
}
