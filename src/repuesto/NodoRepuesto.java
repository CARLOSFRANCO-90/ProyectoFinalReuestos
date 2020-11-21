package repuesto;

public class NodoRepuesto {
	Repuesto repuesto;
	NodoRepuesto left;
	NodoRepuesto right;
	
	//Constructores
	public NodoRepuesto(Repuesto repuesto) {
		this.repuesto = repuesto;
		this.left = null;
		this.right = null;
	}

	public NodoRepuesto() {
		this.repuesto = new Repuesto();
		this.left = null;
		this.right = null;
	}

	//Getters an Setters
	public Repuesto getRepuesto() {
		return repuesto;
	}

	public void setRepuesto(Repuesto repuesto) {
		this.repuesto = repuesto;
	}

	public NodoRepuesto getLeft() {
		return left;
	}

	public NodoRepuesto getRight() {
		return right;
	}

	public void setRight(NodoRepuesto right) {
		this.right = right;
	}

	public void setLeft(NodoRepuesto left) {
		this.left = left;
	}
}
