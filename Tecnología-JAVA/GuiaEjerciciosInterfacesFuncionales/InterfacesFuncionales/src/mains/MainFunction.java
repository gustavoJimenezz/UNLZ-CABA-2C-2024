package mains;

import java.util.Comparator;
import java.util.function.Function;

import modelos.Persona;
import modelos.Rectangulo;

public class MainFunction {

	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo(5, 10);
		Persona persona = new Persona("Ana", 25, 60.5, 1.65);
		
//		1. Crear un función que reciba un rectángulo y retorne su área 
		
		System.out.println("1. Crear un función que reciba un rectángulo y retorne su área ");
		Function<Rectangulo, Double> calcularArea = (rec) -> rec.getBase() * rec.getAltura();
		Double areaRec1 = calcularArea.apply(rectangulo);
		System.out.println(rectangulo);
		System.out.println("Area : " + areaRec1);
		System.out.println("------------------------------------------------------------------------------------");
		
//		2. Crear una función que reciba un rectángulo y retorne su perímetro
		System.out.println("2. Crear una función que reciba un rectángulo y retorne su perímetro");
		Function<Rectangulo, Double> calcularPerimetro = (rec) -> 2 * (rec.getBase() + rec.getAltura());
		double perimetroRec1 = calcularPerimetro.apply(rectangulo);
		System.out.println(rectangulo);
		System.out.println("Perimetro : " + perimetroRec1);
		System.out.println("------------------------------------------------------------------------------------");
		
//		3. Crear un función que reciba un double y retorne el triple de dicho numero 
		System.out.println("3. Crear un función que reciba un double y retorne el triple de dicho numero ");
		Double numDouble = 5.0;
		Function<Double, Double> triple = (num) -> num * 3;
		double perimetro = triple.apply(numDouble);
		System.out.println(numDouble);
		System.out.println("Triple : " + perimetro);
		System.out.println("------------------------------------------------------------------------------------");

//		4. Crear una función que retorne el triple del área de un rectángulo 
		System.out.println("4. Crear una función que retorne el triple del área de un rectángulo ");
		Function<Rectangulo, Double> tripleAreaRectangulos = (rec) -> triple.apply(calcularArea.apply(rec));
		double tripleAreaRec = tripleAreaRectangulos.apply(rectangulo);
		System.out.println(rectangulo);
		System.out.println("Triple del área de un rectángulo : " + tripleAreaRec);
		System.out.println("------------------------------------------------------------------------------------");

//		5. Crear una función que reciba una persona y retorne un rectángulo cuya altura es la
//		estatura de la persona y su base el peso. 
		System.out.println("5. Crear una función que reciba una persona y retorne un rectángulo cuya altura es la\r\n"
				+ "estatura de la persona y su base el peso.  ");
		Function<Persona, Rectangulo> convertirPersonaARectangulo = (per)-> new Rectangulo(per.getEstatura(), per.getPeso());
		Rectangulo rectangulo2 = convertirPersonaARectangulo.apply(persona);
		System.out.println(persona);
		System.out.println("Rectángulo : " + rectangulo2);
		System.out.println("------------------------------------------------------------------------------------");
		
//		6. Realizar una función que retorne el triple del área de una persona como si la misma
//		fuera un rectángulo (Siendo peso la base y estatura la altura) 
		
		System.out.println("5. Crear una función que reciba una persona y retorne un rectángulo cuya altura es la\r\n"
				+ "estatura de la persona y su base el peso.  ");
		Rectangulo recAux = convertirPersonaARectangulo.apply(persona);
		double tripleArea = tripleAreaRectangulos.apply(recAux);
		System.out.println(persona);
		System.out.println(recAux);
		System.out.println("Triple del área : " + tripleArea);
		System.out.println("------------------------------------------------------------------------------------");
	}

}
