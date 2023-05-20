package co.edu.unbosque.model;

public class Cajero extends Thread{
	private boolean die = false;
	private int tiempo;
	private int numCajero;

	public Cajero(int tiempo, int cajero) {
		this.tiempo = tiempo;
		this.numCajero = cajero;
	}

	public void run() {
		System.out.println("Cajero:"+ this.numCajero+ " atendiendo cliente..");
		while (!die) {
			// do work here
			try {
				sleep(this.tiempo * 1000);
				die = true;
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
		}
		// set affairs in order: DEAD IS DEAD
		System.out.println("Fin Cajero:"+this.numCajero + " en:"+this.tiempo+" minutos");
	}

}
