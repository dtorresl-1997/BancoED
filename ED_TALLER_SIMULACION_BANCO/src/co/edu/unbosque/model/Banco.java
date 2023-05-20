package co.edu.unbosque.model;

import java.util.Random;

public class Banco {

	private Cajero t1 = new Cajero(transaccion(), 1);
	private Cajero t2 = new Cajero(transaccion(), 2);
	private Cajero t3 = new Cajero(transaccion(), 3);

	private Cola fila1 = new Cola();
	private Cola fila2 = new Cola();
	private Cola fila3 = new Cola();

	/*
	 * public void atenderCajero() { t1.start(); t2.start(); t3.start(); }
	 */

	public void atenderClientesPorIntervalo() {
		// 8:00 a 12:00 (5 clientes)
		atenderClientes(5);

		// 12:00 a 14:00 (10 clientes)
		atenderClientes(10);

		// 14:00 a 16:00 (3 clientes)
		atenderClientes(3);

		// Acciones adicionales después de atender a todos los clientes
		System.out.println("Todos los clientes han sido atendidos. Fin del programa.");
	}

	private void atenderClientes(int numClientes) {
		for (int i = 1; i <= numClientes; i++) {
			int nodoColar = 5;

			if (i <= 5) {
				Random random = new Random();
				int fila = 1 + random.nextInt(3);
				encolarClienteEnFila(nodoColar, fila);
			} else {

				encolarClienteEnFila(nodoColar, 1);

			}
		}
	}

	private void encolarClienteEnFila(int cliente, int fila) {
		if (fila == 1) {
			fila1.encolar(cliente);
		} else if (fila == 2) {
			fila2.encolar(cliente);
		} else {
			fila3.encolar(cliente);
		}
	}
	
	private int transaccion() {
		Random random = new Random();
		int transaccion = random.nextInt(4);
		int tiempo = 0;

		switch (transaccion) {
			case 0:
				tiempo = 3;
				break;
			case 1:
				tiempo = 5;
				break;
			case 2:
				tiempo = 8;
				break;
			case 3:
				tiempo = 12;
				break;
		}

		return tiempo;
	}

}

