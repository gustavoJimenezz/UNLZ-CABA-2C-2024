package mains;

import animales.Perro;
import interfeces.Pesable;

public class Main {
	public static void main(String[] args) {
		Pesable miPerro = new Perro("Terry", 14);

		double pesoEnGr = miPerro.getPesoEnGr();
		double perosEnMgr = miPerro.getPesoEnKg();
		
		System.out.println("Peso en gramos : " + pesoEnGr);
		System.out.println("Peso en mili gramos : " + perosEnMgr);
	}
}
