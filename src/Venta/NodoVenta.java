package Venta;

public class NodoVenta {
	Venta datoVenta;
	NodoVenta sig;
	
	//Constructores
	public NodoVenta(Venta datoVenta) {
		super();
		this.datoVenta = datoVenta;
		this.sig = null;
	}
	
	public NodoVenta() {
		super();
		this.datoVenta = new Venta();
		this.sig = null;
	}

	
	//Getters and Setters
	public Venta getDatoVenta() {
		return datoVenta;
	}

	public void setDatoVenta(Venta datoVenta) {
		this.datoVenta = datoVenta;
	}

	public NodoVenta getSig() {
		return sig;
	}

	public void setSig(NodoVenta sig) {
		this.sig = sig;
	}
}
