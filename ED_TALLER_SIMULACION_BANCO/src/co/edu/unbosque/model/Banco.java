package co.edu.unbosque.model;

public class Banco {
	
	private Cajero t1 = new Cajero(18,1);
	private Cajero t2 = new Cajero(4,2);
	private Cajero t3 = new Cajero(12,3);

	public void atenderCajero() {
		t1.start();
		t2.start();
		t3.start();
	}
	

}
