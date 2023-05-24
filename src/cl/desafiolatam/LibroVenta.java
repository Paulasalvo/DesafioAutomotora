package cl.desafiolatam;
import java.io.File;
import java.io.FileWriter;
public class LibroVenta {

	private String nombreVenta;
	private int fechaVenta;
	
	public LibroVenta() {	
	}
	
	public LibroVenta(String nombreVenta, int fechaVenta) {
		this.nombreVenta = nombreVenta;
		this.fechaVenta = fechaVenta; 
	}
	
	public void guardarVenta (Cliente cliente, Vehiculo vehiculo) {
		crearDirectorio();
		File archivo = crearArchivo();
		try {
			FileWriter writer = new FileWriter(archivo);
			writer.write(vehiculo.getPatente());
			writer.write("\n");
			writer.write(Integer.toString (cliente.getEdad()));
			writer.write("\n");
			writer.write(Integer.toString (fechaVenta));
			writer.write("\n");
			writer.write(nombreVenta);
			writer.close();
			
		}catch(Exception e){
			System.out.print("error al escribir el archivo");
		}
		
	}

	private File crearArchivo() {
		File archivo = new File ("ficheros/"+ nombreVenta+".txt");
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			}catch (Exception e) {
				System.out.print("error al crear el archivo");
			}
		}
		return archivo;
	}

	private void crearDirectorio() {
		File ficheros = new File("ficheros");
		if (!ficheros.exists()) {
			System.out.print("crear carpeta ficheros");
			try {
				ficheros.mkdir();
			}catch(Exception e) {
				System.out.print("error al crear el directorio");
			}
		}
	}
	
	public String getNombreVenta() {
		return nombreVenta;
	}

	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
	}

	public int getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(int fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
	
}

