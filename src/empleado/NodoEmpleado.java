package empleado;

public class NodoEmpleado {
	Empleado empleado;
	NodoEmpleado left;
	NodoEmpleado right;
	
	//Constructores
	public NodoEmpleado(Empleado empleado) {
		super();
		this.empleado = empleado;
		this.left = null;
		this.right = null;
	}
	
	public NodoEmpleado() {
		super();
		this.empleado = new Empleado();
		this.left = null;
		this.right = null;
	}

	//Getters and Setters
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public NodoEmpleado getLeft() {
		return left;
	}

	public void setLeft(NodoEmpleado left) {
		this.left = left;
	}

	public NodoEmpleado getRight() {
		return right;
	}

	public void setRight(NodoEmpleado right) {
		this.right = right;
	}
}
