package cliente;

public class Cliente {
	int idcliente;
	String nobreCliente;
	long telefono;
	String tipoCliente;
	double cuentaTotal;
	
	//Constructores
	public Cliente(int idcliente, String nobreCliente, long telefono, String tipoCliente, double cuentaTotal) {
		this.idcliente = idcliente;
		this.nobreCliente = nobreCliente;
		this.telefono = telefono;
		this.tipoCliente = tipoCliente;
		this.cuentaTotal = cuentaTotal;
	}

	public Cliente() {
	}

	public Cliente(int idcliente, String nobreCliente, long telefono, String tipoCliente) {
		this.idcliente = idcliente;
		this.nobreCliente = nobreCliente;
		this.telefono = telefono;
		this.tipoCliente = tipoCliente;
	}
	
	//Getters and Setters
	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNobreCliente() {
		return nobreCliente;
	}

	public void setNobreCliente(String nobreCliente) {
		this.nobreCliente = nobreCliente;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public double getCuentaTotal() {
		return cuentaTotal;
	}

	public void setCuentaTotal(double cuentaTotal) {
		this.cuentaTotal = cuentaTotal;
	}

	@Override
	public String toString() {
		return "Cliente [idcliente=" + idcliente + ", nobreCliente=" + nobreCliente + ", telefono=" + telefono
				+ ", tipoCliente=" + tipoCliente + ", cuentaTotal=" + cuentaTotal + "]";
	}
	
	//MÃ©todo par mostrar el estado del cliente
    public void estadoCliente(){
    	System.out.println("ID: " + idcliente + " Nombre: " + nobreCliente + " Teléfono: " + telefono + ", Tipo Cliente: " + tipoCliente);
    }	
}
