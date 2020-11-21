package repuesto;

public class Repuesto {
	int idRepuesto;
	String nombrerepuesto;
	int stock;
	int cantidad;
	double precio;
	double precioTotal;
	
	//Constructores
	public Repuesto(int idRepuesto, String nombrerepuesto, int stock, int cantidad, double precio, double precioTotal) {
		this.idRepuesto = idRepuesto;
		this.nombrerepuesto = nombrerepuesto;
		this.stock = stock;
		this.cantidad = cantidad;
		this.precio = precio;
		this.precioTotal = precioTotal;
	}

	public Repuesto(int idRepuesto, String nombrerepuesto, int stock, double precio) {
		this.idRepuesto = idRepuesto;
		this.nombrerepuesto = nombrerepuesto;
		this.stock = stock;
		this.precio = precio;
	}

	public Repuesto() {
	}

	//Getters and Setters
	public int getIdRepuesto() {
		return idRepuesto;
	}

	public void setIdRepuesto(int idRepuesto) {
		this.idRepuesto = idRepuesto;
	}

	public String getNombrerepuesto() {
		return nombrerepuesto;
	}

	public void setNombrerepuesto(String nombrerepuesto) {
		this.nombrerepuesto = nombrerepuesto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	@Override
	public String toString() {
		return "Repuesto [idRepuesto=" + idRepuesto + ", nombrerepuesto=" + nombrerepuesto + ", stock=" + stock
				+ ", cantidad=" + cantidad + ", precio=" + precio + ", precioTotal=" + precioTotal + "]";
	}
	
	//Estado Repuesto
	public void estadoRepuesto(){
    	System.out.println("ID: " + idRepuesto + " Nombre: " + nombrerepuesto + " Stock: " + stock + "Precio: " + precio);
    }
	
	public void estadoRepuestoFactura(){
    	System.out.println("ID: " + idRepuesto + " Nombre: " + nombrerepuesto + " Cantidad: " + cantidad + " Precio: " + precio + "precioTotal: " + precioTotal);
    }	
	
}
