package cliente;

public class NodoCliente {
	Cliente datoCliente;
	NodoCliente ant, sig;
	
	//Constructores
	public NodoCliente(Cliente datoCliente) {
		this.datoCliente = datoCliente;
		this.ant = null;
		this.sig = null;
	}
	
	public NodoCliente() {
		this.datoCliente = new Cliente();
		this.ant = null;
		this.sig = null;
	}
	

	//Getters and Setters
	public Cliente getDatoCliente() {
		return datoCliente;
	}

	public void setDatoCliente(Cliente datoCliente) {
		this.datoCliente = datoCliente;
	}

	public NodoCliente getAnt() {
		return ant;
	}

	public void setAnt(NodoCliente ant) {
		this.ant = ant;
	}

	public NodoCliente getSig() {
		return sig;
	}

	public void setSig(NodoCliente sig) {
		this.sig = sig;
	}	
}
