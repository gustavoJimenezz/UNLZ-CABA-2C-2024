package comparators;

import java.util.Comparator;

import modelos.FechaFestiva;

public class ComparadorPorFanatismo implements Comparator<FechaFestiva>{

	@Override
	public int compare(FechaFestiva f1, FechaFestiva f2) {
		return Double.compare(f2.getFanatismo(), f1.getFanatismo());
	}

	
}
