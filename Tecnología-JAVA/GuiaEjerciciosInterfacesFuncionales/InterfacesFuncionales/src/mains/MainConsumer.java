package mains;

import java.util.function.Consumer;

import modelos.Persona;
import modelos.Rectangulo;

public class MainConsumer {

	public static void main(String[] args) {
		Persona persona = new Persona("Fernando", 40, 90.0, 2.15);
		Persona persona1 = new Persona("Pedro", 40, 90.0, 1.85);
		
//		1. Realizar un consumidor que reciba una persona y muestre su edad por pantalla.
		System.out.println("1. Realizar un consumidor que reciba una persona y muestre su edad por pantalla.");
		Consumer<Persona> mostrarEdad = (per)-> System.out.println(per.getEdad());
		mostrarEdad.accept(persona);
		System.out.println("------------------------------------------------------------------------------------");
		
//		2. Realizar un consumidor que incremente la edad de una persona en 3.
		System.out.println("2. Realizar un consumidor que incremente la edad de una persona en 3.");
		System.out.println(persona);
		Consumer<Persona> triplicarEdad = (per)-> {
			int result = per.getEdad() * 3;
			per.setEdad(result);
		};
		triplicarEdad.accept(persona);
		System.out.println("Usando IcrementarEdadPorTres : " + persona);
		System.out.println("------------------------------------------------------------------------------------");
		
//		3. Realizar un consumidor que incremente la edad en 3 de una persona y luego muestre
//		su edad.
		System.out.println("3. Realizar un consumidor que incremente la edad en 3 de una persona y luego muestre su edad.");
		System.out.println(persona1);
		 Consumer<Persona> triplicarEdadYMostrar = (per) -> {
	            triplicarEdad.accept(per);  
	            mostrarEdad.accept(per);    
	        };
		triplicarEdadYMostrar.accept(persona1);
		System.out.println("------------------------------------------------------------------------------------");
		
		
//		4. Realizar un consumidor que transforme un rectángulo en un cuadrado, haciendo que
//		su base pase a valer lo que su altura. 
		System.out.println("4. Realizar un consumidor que transforme un rectángulo en un cuadrado, haciendo que su base pase a valer lo que su altura. ");
		Rectangulo rectangulo = new Rectangulo(10, 20);
		System.out.println(rectangulo);
		Consumer<Rectangulo> convertirRectanguloEnCuadrado = (rec) -> {
	             rec.setBase(rec.getAltura());
	        };
        convertirRectanguloEnCuadrado.accept(rectangulo);
		System.out.println(rectangulo);
		System.out.println("------------------------------------------------------------------------------------");
	}

}
