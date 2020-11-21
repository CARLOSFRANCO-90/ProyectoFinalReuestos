package empleado;

public class ArbEmpleado {
	NodoEmpleado root;
	int numeroEmpleados;
	
	//agregar un nuevo nodo al arbol
	public NodoEmpleado addEmpleado(NodoEmpleado arbTemp, NodoEmpleado nNodo){
			 if (arbTemp == null) {
		            arbTemp = nNodo;
		            numeroEmpleados++;
		            //System.out.println("El empleado " +nNodo.empleado.nombreEmpleado + " se agrego correctamente");
		     }else {
		    	 if (!(nNodo.getEmpleado().idEmpleado==arbTemp.getEmpleado().getIdEmpleado())) {
		    		 if (nNodo.getEmpleado().getIdEmpleado()<arbTemp.getEmpleado().getIdEmpleado()) {
		    			 arbTemp.setLeft(addEmpleado(arbTemp.left, nNodo));
		    		 }
		    		 if (nNodo.getEmpleado().getIdEmpleado()>arbTemp.getEmpleado().getIdEmpleado()){
			        	 arbTemp.setRight(addEmpleado(arbTemp.right, nNodo));
			         }	    		 
		    	 }else {
		 			System.out.println("El empleado " + nNodo.getEmpleado().getNombreEmpleado() + " ya se encuentra registrado");
				} 
			}
			 return arbTemp;
		 }
		 
		// recorrer el arbol 
		public void recorrerArbol(NodoEmpleado root){ 
				if (root == null) {
					System.out.println("No hay empleados registrados");
				}else {
					root.getEmpleado().estadoEmpleado();;
					if (root.getLeft() != null){
				        recorrerArbol(root.left);
				    }
				    if (root.getRight() != null){
				    	recorrerArbol(root.right);
				    }
				}
			}
			
			// retorna un metodo en especial apartir de la id
			public NodoEmpleado returnNodo(NodoEmpleado nodo, int id) {
				if (nodo == null) {
					return null;
				}
				if (nodo.getEmpleado().getIdEmpleado()==id) {
					return nodo;
				}else {
					if (nodo.getEmpleado().getIdEmpleado() <id ) {
						return returnNodo(nodo.right, id);
					}
					return returnNodo(nodo.left, id);
				}
			}
			
	
}
