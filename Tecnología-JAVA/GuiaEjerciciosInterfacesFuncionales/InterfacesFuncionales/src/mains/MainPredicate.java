package mains;

import java.util.function.Predicate;

import modelos.Persona;
import modelos.Rectangulo;

public class MainPredicate {
	public static void main(String[] args) {
		Persona persona = new Persona("Fernando", 40, 90.0, 2.15);
		Persona persona1 = new Persona("Pedro", 40, 90.0, 1.85);
		
//		1. Crear un predicado que evalúe si una persona mide más de dos metros
		System.out.println("1. Crear un predicado que evalúe si una persona mide más de dos metros ");
		Predicate<Persona> evaluarMideMasDeDosMetros = (per) -> per.getEstatura() > 2;
		boolean result = evaluarMideMasDeDosMetros.test(persona);
		System.out.println(persona);
		if(result)System.out.println("Mide mas de dos metros");
		System.out.println("------------------------------------------------------------------------------------");
		
//		2. Crear un predicado que evalúe si la persona no mide más de dos metros
		System.out.println("2. Crear un predicado que evalúe si la persona no mide más de dos metros");
		Predicate<Persona> evaluarMideMenosDeDosMetros = (per) -> per.getEstatura() < 2;
		boolean result2 = evaluarMideMenosDeDosMetros.test(persona1);
		System.out.println(persona1);
		if(result2)System.out.println("Mide menos de dos metros");
		System.out.println("------------------------------------------------------------------------------------");
		
//		3. Crear un predicado que evalúe si es mayor de edad
		System.out.println("3. Crear un predicado que evalúe si es mayor de edad");
		Predicate<Persona> evaluarMayorDeEdad = (per) -> per.getEdad() > 18;
		boolean result3 = evaluarMayorDeEdad.test(persona);
		System.out.println(persona);
		if(result3)System.out.println("Es mayor de edad");
		System.out.println("------------------------------------------------------------------------------------");
		
//		4. Crear un predicado que evalúe si una persona es mayor de edad o mide más de 2
//		metros
		System.out.println("4. Crear un predicado que evalúe si una persona es mayor de edad o mide más de 2\r\n"
				+ "//		metros");
		Predicate<Persona> evaluarMayorDeEdadOMideMasDeDosMetros = (per) -> evaluarMayorDeEdad.test(per) || evaluarMideMasDeDosMetros.test(per);
		boolean result4 = evaluarMayorDeEdadOMideMasDeDosMetros.test(persona);
		System.out.println(persona);
		if(result4)System.out.println("Es mayor de edad o Mide mas de dos metros");
		System.out.println("------------------------------------------------------------------------------------");
		
		
//		5. Crear un predicado que evalúe si un rectángulo es un cuadrado. 
		System.out.println("5. Crear un predicado que evalúe si un rectángulo es un cuadrado. ");
		
		Rectangulo rectangulo = new Rectangulo(10, 10);
		Predicate<Rectangulo> evaluarSiEsCuadrado = (rec) -> rec.getAltura() == rec.getBase();
		boolean result5 = evaluarSiEsCuadrado.test(rectangulo);
		System.out.println(rectangulo);
		if(result5)System.out.println("El rectangulo es un cuadrado");
		System.out.println("------------------------------------------------------------------------------------");

	}
}
