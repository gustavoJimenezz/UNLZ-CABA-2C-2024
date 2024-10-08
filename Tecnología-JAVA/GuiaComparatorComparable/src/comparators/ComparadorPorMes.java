package comparators;

import java.util.Comparator;

import models.FechaFestiva;

public class ComparadorPorMes implements Comparator<FechaFestiva>{

	@Override
	public int compare(FechaFestiva f1, FechaFestiva f2) {
		int resultado;
		if(f1.getMes() < f2.getMes()) {
			resultado = -1;
		}else if(f1.getMes() > f2.getMes()) {
			resultado = 1;
		}else {
			resultado = 0;
		}
		return resultado;
	}
	
	
}
