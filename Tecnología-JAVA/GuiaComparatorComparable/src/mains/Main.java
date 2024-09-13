package mains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import comparators.ComparadorPorDIa;
import comparators.ComparadorPorFanatismo;
import comparators.ComparadorPorMes;
import comparators.ComparadorPorNombre;
import models.FechaFestiva;

public class Main {

	public static void main(String[] args) {
//		1. Crear una lista con 10 fechas o más (No es necesario ingresarlas por teclado).
//		Mientras más desordenado: ¡Mejor!
		ArrayList<FechaFestiva> festividades = new ArrayList<>();


        festividades.add(new FechaFestiva(25, 12, "Navidad", 0.9));
        festividades.add(new FechaFestiva(1, 1, "Año Nuevo", 0.8));
        festividades.add(new FechaFestiva(31, 10, "Halloween", 0.7));
        festividades.add(new FechaFestiva(14, 2, "San Valentín", 0.6));
        festividades.add(new FechaFestiva(8, 3, "Día Internacional de la Mujer", 0.6));
        festividades.add(new FechaFestiva(1, 5, "Día del Trabajo", 0.5));
        festividades.add(new FechaFestiva(1, 4, "Pascua", 0.6));
        festividades.add(new FechaFestiva(10, 2, "Año Nuevo Chino", 0.5));
        festividades.add(new FechaFestiva(22, 4, "Día de la Tierra", 0.7)); 
        festividades.add(new FechaFestiva(30, 7, "Día de la Amistad", 0.5));

//        Desordenar arraylist festividades
        Collections.shuffle(festividades);
        
//        2. Mostrar el listado completo de fechas. 
        System.out.println("------------------------------------------");
        System.out.println("2. Mostrar el listado completo de fechas.");
    
        for (FechaFestiva festividad : festividades) {
            System.out.println(festividad);
        }
        
//        3. Mostrar el listado ordenado por nombre.
        System.out.println("------------------------------------------");
        System.out.println("3. Mostrar el listado ordenado por nombre.");
        ComparadorPorNombre comPorNombre = new ComparadorPorNombre();
        festividades.sort(comPorNombre);
        
        for (FechaFestiva festividad : festividades) {
            System.out.println(festividad);
        }
        
//        4. Mostrar el listado ordenado por su ordenamiento natural.
        System.out.println("------------------------------------------");     
        System.out.println("4. Mostrar el listado ordenado por su ordenamiento natural.");
        festividades.sort(null);
        
        for (FechaFestiva festividad : festividades) {
            System.out.println(festividad);
        }
        
//        5. Mostrar ordenado por día.
        System.out.println("------------------------------------------");     
        System.out.println("5. Mostrar ordenado por día ");
        ComparadorPorDIa comPorDia = new ComparadorPorDIa();
        festividades.sort(comPorDia);
        
        for (FechaFestiva festividad : festividades) {
            System.out.println(festividad);
        }
        
//        6. Mostrar el listado de fechas por fanatismo de mayor a menor (reversed). 
        System.out.println("------------------------------------------");     
        System.out.println(" 6. Mostrar el listado de fechas por fanatismo de mayor a menor (reversed).");
        Comparator<FechaFestiva> comPorFanReversed = new ComparadorPorFanatismo().reversed();
        festividades.sort(comPorFanReversed);
        
        for (FechaFestiva festividad : festividades) {
            System.out.println(festividad);
        }
        
//        7. Mostrar ordenado por mes.
        System.out.println("------------------------------------------");     
        System.out.println(" 7. Mostrar ordenado por mes.");    
        ComparadorPorMes comPorMes = new ComparadorPorMes();
        festividades.sort(comPorMes);
        
        for (FechaFestiva festividad : festividades) {
            System.out.println(festividad);
        }
        
//        8. Mostrar ordenado por mes y día (Utilizando andThen).
        System.out.println("------------------------------------------");     
        System.out.println(" 8. Mostrar ordenado por mes y día (Utilizando andThen)");   
        Comparator<FechaFestiva> comPOrDiaYMes = comPorDia.thenComparing(comPorMes);
        festividades.sort(comPOrDiaYMes);
        
        for (FechaFestiva festividad : festividades) {
            System.out.println(festividad);
        }
        
//        9. DIFICIL: Mostrar el listado ordenado por fanatismo (ascendente) y nombre (decente).
        System.out.println("------------------------------------------");     
        System.out.println(" 9. DIFICIL: Mostrar el listado ordenado por fanatismo (ascendente) y nombre (desc) ");    

        Comparator<FechaFestiva> comPorFan = new ComparadorPorFanatismo();
        Comparator<FechaFestiva> comPorFanAscNombreDesc = comPorFan.thenComparing(comPorNombre.reversed());
        festividades.sort(comPorFanAscNombreDesc);
        
        for (FechaFestiva festividad : festividades) {
            System.out.println(festividad);
        }
	}

}
