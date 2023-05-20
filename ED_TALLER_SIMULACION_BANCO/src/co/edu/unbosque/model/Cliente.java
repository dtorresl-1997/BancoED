package co.edu.unbosque.model;

public class Cliente {
	
	public class Cliente {
		private String nombre;
		private Cliente siguiente;
		

		public Cliente(String nombre) {
			this.nombre = nombre;
			this.siguiente = null;
		}

		public String getNombre() {
			return nombre;
		}

		public Cliente getSiguiente() {
			return siguiente;
		}

		public void setSiguiente(Cliente siguiente) {
			this.siguiente = siguiente;
		}

}
