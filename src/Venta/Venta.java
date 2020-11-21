package Venta;

import cliente.*;
import empleado.*;
import factura.*;

public class Venta {
	int idVenta;
	NodoCliente cliente;
	NodoEmpleado empleado;
	NodoFactura factura;
	
	//Constructores
	public Venta(int idVenta, NodoCliente cliente, NodoEmpleado empleado, NodoFactura factura) {
		this.idVenta = idVenta;
		this.cliente = cliente;
		this.empleado = empleado;
		this.factura = factura;
	}
	
	public Venta(int idVenta, NodoCliente cliente, NodoEmpleado empleado) {
		this.idVenta = idVenta;
		this.cliente = cliente;
		this.empleado = empleado;
	}

	public Venta(int idVenta, NodoCliente cliente) {
		this.idVenta = idVenta;
		this.cliente = cliente;
	}

	public Venta() {
	}

	//Getters an Setters
	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public NodoCliente getCliente() {
		return cliente;
	}

	public void setCliente(NodoCliente cliente) {
		this.cliente = cliente;
	}

	public NodoEmpleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(NodoEmpleado empleado) {
		this.empleado = empleado;
	}

	public NodoFactura getFactura() {
		return factura;
	}

	public void setFactura(NodoFactura factura) {
		this.factura = factura;
	}
	

	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", cliente=" + cliente + ", empleado=" + empleado + ", factura=" + factura
				+ "]";
	}

	public void estadoVenta() {
		System.out.println("ID: " + idVenta + ", Cliente: " + cliente.getDatoCliente().getNobreCliente() 
				+ ", Cajero: " + empleado.getEmpleado().getNombreEmpleado());
	}
}
