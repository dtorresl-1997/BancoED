package co.edu.unbosque.controller;

import co.edu.unbosque.model.Banco;

public class Controller {
	
Banco b;
	
	public Controller() {
		b = new Banco();
		b.atenderCajero();
	}

}
