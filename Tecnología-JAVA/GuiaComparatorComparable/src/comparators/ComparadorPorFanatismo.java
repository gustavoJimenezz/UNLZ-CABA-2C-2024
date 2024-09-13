package comparators;

import java.util.Comparator;

import models.FechaFestiva;

public class ComparadorPorFanatismo implements Comparator<FechaFestiva>{

	@Override
	public int compare(FechaFestiva f1, FechaFestiva f2) {
		return Double.compare(f1.getFanatismo(), f2.getFanatismo());
	}
}
