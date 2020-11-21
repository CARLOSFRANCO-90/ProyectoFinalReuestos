package factura;
import java.util.Date;

import cliente.*;
import repuesto.*;

public class Factura {
	java.util.Date fecha1 = new Date();
	
	int idFactura;
	Date fecha;
	NodoCliente cliente;
	arbRepuesto items;
	double valorFactura;
	
	
	
	//Constructores
	public Factura(int idFactura, NodoCliente cliente, arbRepuesto items, double valorFactura) {
		this.idFactura = idFactura;
		
		this.fecha = fecha1;
		this.cliente = cliente;
		this.items = items;
		this.valorFactura = valorFactura;
	}



	public Factura() {
	}


	//Getter and Setters
	public int getIdFactura() {
		return idFactura;
	}



	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public NodoCliente getCliente() {
		return cliente;
	}



	public void setCliente(NodoCliente cliente) {
		this.cliente = cliente;
	}



	public arbRepuesto getItems() {
		return items;
	}



	public void setItems(arbRepuesto items) {
		this.items = items;
	}



	public double getValorFactura() {
		return valorFactura;
	}



	public void setValorFactura(double valorFactura) {
		this.valorFactura = valorFactura;
	}



	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", fecha=" + fecha + ", cliente=" + cliente + ", items=" + items
				+ ", valorFactura=" + valorFactura + "]";
	}
	
	//Estado factura
	public void estadoFactura() {
		System.out.println("ID: " + idFactura + "     " + fecha.toString());
		System.out.println("Cliente: "+ cliente.getDatoCliente().getNobreCliente() 
				+ "Teléfono: " + cliente.getDatoCliente().getTelefono());
		System.out.println("Lista Items: ");
		items.recorrerArbolFactura();
		System.out.println("Valor Total: " + items.valorTotalFactura());		
	}
}
