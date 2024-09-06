package comparators;

import java.util.Comparator;

import modelos.FechaFestiva;

public class ComparadorPorDIa implements Comparator<FechaFestiva> {

	@Override
	public int compare(FechaFestiva f1, FechaFestiva f2) {
		return Integer.compare(f1.getDia(), f2.getDia());
	}

}
