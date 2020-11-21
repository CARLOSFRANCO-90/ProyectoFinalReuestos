package factura;

public class NodoFactura {
	Factura datoFactura;
	NodoFactura next;
	
	//Constructores
	public NodoFactura(Factura datoFactura) {
		this.datoFactura = datoFactura;
		this.next = null;
	}
	
	public NodoFactura() {
		this.datoFactura = new Factura();
		this.next = null;
	}

	//Getters and Setters
	public Factura getDatoFactura() {
		return datoFactura;
	}

	public void setDatoFactura(Factura datoFactura) {
		this.datoFactura = datoFactura;
	}

	public NodoFactura getNext() {
		return next;
	}

	public void setNext(NodoFactura next) {
		this.next = next;
	}
}
