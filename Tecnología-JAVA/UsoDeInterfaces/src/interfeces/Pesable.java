package interfeces;

public interface Pesable {

	public double getPesoEnKg();
	
	public default double getPesoEnGr() {
		return this.getPesoEnKg() / 1000;
	}
	
	public default double getPesoEnMgr() {
		return this.getPesoEnKg() / 1000000;
	}
}
