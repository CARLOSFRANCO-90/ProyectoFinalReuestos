package empleado;

public class Empleado {
	int idEmpleado;
	String nombreEmpleado;
	float totalVentas;
	
	//Constuctores
	public Empleado(int idEmpleado, String nombreEmpleado, float totalVentas) {
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.totalVentas = totalVentas;
	}

	public Empleado() {
	}
	
	public Empleado(int idEmpleado, String nombreEmpleado) {
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
	}

	//Getter and Setter
	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public float getTotalVentas() {
		return totalVentas;
	}

	public void setTotalVentas(float totalVentas) {
		this.totalVentas = totalVentas;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", totalVentas="
				+ totalVentas + "]";
	}
	
	public void estadoEmpleado() {
		System.out.println("ID: " + idEmpleado + " Nombre: " + nombreEmpleado + " Total Ventas: "+ totalVentas);
	}
}
