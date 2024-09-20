package mains;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import modelos.Persona;
import modelos.Rectangulo;

public class MainComparator {
	public static void main(String[] args) {
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Ana", 25, 60.5, 1.65));
		personas.add(new Persona("Carlos", 35, 85.0, 1.80));
		personas.add(new Persona("Beatriz", 35, 55.0, 1.60));
		personas.add(new Persona("David", 28, 75.0, 1.75));
		personas.add(new Persona("Elena", 35, 68.0, 1.68));
		personas.add(new Persona("Fernando", 40, 90.0, 1.85));
		
//1. Crear un comparador que compare dos personas por altura.
		System.out.println("1. Crear un comparador que compare dos personas por altura.");
		Comparator<Persona> comparadorPorAltura = (o1, o2)-> Double.compare(o1.getEstatura(), o2.getEstatura());
		personas.sort(comparadorPorAltura);
		personas.forEach(persona -> System.out.println(persona));
		System.out.println("------------------------------------------------------------------------------------");

//2. Crear un comparador que compare personas por edad.
		System.out.println("2. Crear un comparador que compare personas por edad.");
		Comparator<Persona> comparadorPorEdad = (o1, o2)-> Integer.compare(o1.getEdad(), o2.getEdad());
		personas.sort(comparadorPorEdad);
		personas.forEach(persona -> System.out.println(persona));
		System.out.println("------------------------------------------------------------------------------------");
		
//3. Crear un comparador que compare personas por edad y si son iguales por estatura. 
		System.out.println("3. Crear un comparador que compare personas por edad y si son iguales por estatura.");
		Comparator<Persona> comparadorPorEdadYEstatura = comparadorPorEdad.thenComparing(comparadorPorAltura);
		personas.sort(comparadorPorEdadYEstatura);
		personas.forEach(persona -> System.out.println(persona));
		System.out.println("------------------------------------------------------------------------------------");
		
//4. Crear un comparador que compare personas por peso inversamente. 
		System.out.println("4. Crear un comparador que compare personas por peso inversamente. ");
		Comparator<Persona> comparadorPorPeso = (o1, o2)-> Double.compare(o1.getPeso(), o2.getPeso());
		personas.sort(comparadorPorPeso);
		personas.forEach(persona -> System.out.println(persona));
		System.out.println("------------------------------------------------------------------------------------");

//5. Crear un comparador que compare la base de dos rectángulos. 
		System.out.println("5. Crear un comparador que compare la base de dos rectángulos.");
		Rectangulo rectangulo1 = new Rectangulo(5, 10);
		Rectangulo rectangulo2 = new Rectangulo(3, 6);
		
		Comparator<Rectangulo> compararPorBase = (o1, o2)-> Double.compare(o1.getBase(), o2.getBase());
		int resultado = compararPorBase.compare(rectangulo1, rectangulo2);
		System.out.println(rectangulo1);
		System.out.println(rectangulo2);
		System.out.println("**Comparacion**");
        if (resultado < 0) {
            System.out.println("El rectángulo 1 tiene una base menor que el rectángulo r2.");
        } else if (resultado > 0) {
            System.out.println("El rectángulo 2 tiene una base mayor que el rectángulo r2.");
        } else {
            System.out.println("Ambos rectangulos tienen la misma base.");
        }
		System.out.println("------------------------------------------------------------------------------------");

		
	}
}
