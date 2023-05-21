package cl.desafiolatam;

public class Taxi extends Vehiculo {
	private int valorPasaje;


	
	public Taxi() {
		
	}
	public Taxi(String color, String patente, int valorPasaje) {
		super (color, patente);
		this.valorPasaje= valorPasaje;
		
	}
	
	public int pagarPasaje(int monto) {
		if(valorPasaje <= monto) {
			return monto-valorPasaje;	
		}
		else 
		return monto; 
	}
	 
	public int getValorPasaje() {
		return valorPasaje;
	}
	public void setValorPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}
	@Override
	public String toString() {
		return "Taxi [valorPasaje=" + valorPasaje + "]";
	}
	
	
	
}
