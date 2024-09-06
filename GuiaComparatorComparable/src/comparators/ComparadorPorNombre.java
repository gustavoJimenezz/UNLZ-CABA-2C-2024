package comparators;

import java.util.Comparator;

import modelos.FechaFestiva;

//3. NOMBRE
//Utilizar el metodo compareTo de los String para poder armarlo

public class ComparadorPorNombre implements Comparator<FechaFestiva>{

	@Override
	public int compare(FechaFestiva f1, FechaFestiva f2) {
		return f1.getNombre().compareTo(f2.getNombre());
	}
}
