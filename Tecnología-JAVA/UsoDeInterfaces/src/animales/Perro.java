package animales;

import interfeces.Pesable;

public class Perro implements Pesable{

	public String nombre;
	public double pesoEnKg;
	
	public Perro(String nombre, double pesoEnKg) {
		super();
		this.nombre = nombre;
		this.pesoEnKg = pesoEnKg;
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPesoEnKg(double pesoEnKg) {
		this.pesoEnKg = pesoEnKg;
	}

	@Override
	public double getPesoEnKg() {
		return this.pesoEnKg;
	}

}
