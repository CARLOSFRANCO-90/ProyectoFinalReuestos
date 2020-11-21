package repuesto;

public class arbRepuesto {
NodoRepuesto root;
	
	int repuestoNumero =0;
	
	//agregar un nuevo nodo al arbol
	 public NodoRepuesto addRepuesto(NodoRepuesto arbTemp, NodoRepuesto nNodo){
		 if (arbTemp == null) {
	            arbTemp = nNodo;
	            repuestoNumero++;
	            System.out.println("El repuesto " +nNodo.repuesto.nombrerepuesto + " se agrego correctamente");
	     }else {
	    	 if (!(nNodo.getRepuesto().idRepuesto==arbTemp.getRepuesto().getIdRepuesto())) {
	    		 if (nNodo.getRepuesto().getIdRepuesto()<arbTemp.getRepuesto().getIdRepuesto()) {
	    			 arbTemp.setLeft(addRepuesto(arbTemp.left, nNodo));
	    		 }
	    		 if (nNodo.getRepuesto().getIdRepuesto()>arbTemp.getRepuesto().getIdRepuesto()){
		        	 arbTemp.setRight(addRepuesto(arbTemp.right, nNodo));
		         }	    		 
	    	 }else {
	 			System.out.println("El respuesto " + nNodo.getRepuesto().getNombrerepuesto() + " ya se encuentra registrado");
			} 
		}
		 return arbTemp;
	 }
	 
	// recorrer el arbol 
	public void recorrerArbol(NodoRepuesto root){ 
		if (root == null) {
			System.out.println("No hay repuestos registrados");
		}else {
			root.getRepuesto().estadoRepuesto();
			if (root.getLeft() != null){
		        recorrerArbol(root.left);
		    }
		    if (root.getRight() != null){
		    	recorrerArbol(root.right);
		    }
		}
	}
	
	// retorna un metodo en especial apartir de la id
	public NodoRepuesto returnNodo(NodoRepuesto nodo, int id) {
		if (nodo == null) {
			return null;
		}
		if (nodo.getRepuesto().getIdRepuesto()==id) {
			return nodo;
		}else {
			if (nodo.getRepuesto().getIdRepuesto() <id ) {
				return returnNodo(nodo.right, id);
			}
			return returnNodo(nodo.left, id);
		}
	}
	
	//Promedio de compras totales por cliente
	double totalCuenta=0;
	public double valorTotalInventario(NodoRepuesto root){ 
		if (root == null) {
			System.out.println("No hay repuestos en el sistema");
		}else {
			totalCuenta = totalCuenta + (root.getRepuesto().getStock()*root.getRepuesto().getPrecio());
			if (root.getLeft() != null){
				valorTotalInventario(root.left);
			}
			if (root.getRight() != null){
				valorTotalInventario(root.right);
			}
		}
		return totalCuenta;
	}
	
	//Listar repuestos que tengan un stock menor o igual a un numero ingresado
	public void repuestosStockMenor(NodoRepuesto root, int numero){ 
		if (root == null) {
			System.out.println("No hay repuestos en el sistema");
		}else {
			if(root.getRepuesto().getStock() <= numero) {
				root.getRepuesto().estadoRepuesto();
			}
			if (root.getLeft() != null){
				repuestosStockMenor(root.left, numero);
			}
			if (root.getRight() != null){
				repuestosStockMenor(root.right, numero);
			}
		}
	}
	
	//Listar repuestos que tengan un stock mayor o igual a un numero ingresado
	public void repuestosStockMayor(NodoRepuesto root, int numero){ 
		if (root == null) {
			System.out.println("No hay repuestos en el sistema");
		}else {
			if(root.getRepuesto().getStock() >= numero) {
				root.getRepuesto().estadoRepuesto();
			}
			if (root.getLeft() != null){
				repuestosStockMayor(root.left, numero);
			}
			if (root.getRight() != null){
				repuestosStockMayor(root.right, numero);
			}
		}
	}
}
