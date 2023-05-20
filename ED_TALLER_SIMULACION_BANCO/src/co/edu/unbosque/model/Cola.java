package co.edu.unbosque.model;

import co.edu.unbosque.model.Cola.Nodo;

public class Cola {
	
	class Nodo {

		int info;
		Nodo sig;
	}

	private Nodo raiz, fondo;

	public boolean vacia() {
		return raiz == null;

	}

	public void encolar(int info) {
		Nodo nuevo;
		nuevo = new Nodo();
		nuevo.info = info;
		nuevo.sig = null;
		if (vacia()) {
			raiz = nuevo;
			fondo = nuevo;
		} else {
			fondo.sig = nuevo;
			fondo = nuevo;
		}
	}

	public int decolar() {
		if (!vacia()) {
			int informacion = raiz.info;
			if (raiz == fondo) {
				raiz = null;
				fondo = null;
			} else {
				raiz = raiz.sig;
			}
			return informacion;
		} else
			return Integer.MAX_VALUE;

	}

	public void imprimir() {
		Nodo reco = raiz;
		System.out.println("Listado de todos los elementos de la cola, ");

		while (reco != null) {
			System.out.println(reco.info + "-");
			reco = reco.sig;
		}
		System.out.println();
	}

}
