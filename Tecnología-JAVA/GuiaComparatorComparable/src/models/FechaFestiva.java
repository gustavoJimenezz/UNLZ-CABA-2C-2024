package models;

public class FechaFestiva implements Comparable<FechaFestiva> {

// 	dia (int): Representa el número del día en el mes.
//	mes (int): Representa el número del mes de la fecha.
//	nombre (String): Es el nombre de la festividad.
//	fanatismo (double): Un valor de -1 a 1 que indique cuánto les gusta esa festivida
	
	private int dia;
	private int mes;
	private String nombre;
	private double fanatismo;
	

	public FechaFestiva(int dia, int mes, String nombre, double fanatismo) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.nombre = nombre;
		this.fanatismo = fanatismo;
	}

//	2. CREAR METODOS BASICOS
//	Crear sus getters, setters, toString y contructor. 
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getFanatismo() {
		return fanatismo;
	}
	
	public void setFanatismo(double fanatismo) {
		this.fanatismo = fanatismo;
	}
	
	@Override
	public String toString() {
		return "FechaFestiva [dia=" + dia + ", mes=" + mes + ", nombre=" + nombre + ", fanatismo=" + fanatismo + ", dias totales=" + this.getDiasTotales() + "]";
	}
	
	/**
	 * 3. METODOS PARTICULARES
	 * getDiasTotales(): método que retorna cuántos días pasaron desde principio de año.
	 * (Asumiendo para el ejercicio que todos los meses tienen 30 días).
	 *
	 * @return El número total de días que han pasado desde el inicio del año.
	 *         <ul>
	 *             <li>Los días se calculan sumando los días de los meses anteriores, donde cada mes tiene 30 días.</li>
	 *             <li>El día actual también se incluye en el cálculo.</li>
	 *         </ul>
	 */
	public int getDiasTotales() {
	    int diasPrevios = (this.mes - 1) * 30;
	    return diasPrevios + this.dia;
	}


	/**
	 * 4. IMPLEMENTAR DE INTEFAZ
	 * Se requiere implementar la interfaz Comparable y definir como comparación natural la cantidad de días totales.
	 *
	 * @param otraFechaFestiva La instancia de FechaFestiva con la que se comparará.
	 * @return 
	 *         <ul>
	 *             <li>1 si esta instancia tiene más días totales que otraFechaFestiva</li>
	 *             <li>-1 si esta instancia tiene menos días totales que otraFechaFestiva</li>
	 *             <li>0 si ambas tienen la misma cantidad de días totales</li>
	 *         </ul>
	 */
	@Override
	public int compareTo(FechaFestiva otraFechaFestiva) {
		// TODO Auto-generated method stub
		int resultado = 0;
		if(this.getDiasTotales() > otraFechaFestiva.getDiasTotales()) {
			resultado = 1;
		}else if(this.getDiasTotales() < otraFechaFestiva.getDiasTotales()) {
			resultado = -1;
		}
		return resultado;
	}		
}
