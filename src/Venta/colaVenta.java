package Venta;

public class colaVenta {
	public NodoVenta inicioCola, finalCola;
	public int tam;
	
	public colaVenta() {
		this.inicioCola = null;
		this.finalCola = null;
	}
	
	//metodo para comprobar que la cola no este vacia
	public boolean esVacia() {
		if(inicioCola==null) {
			return true;
		}else {
			return false;
		}
	}
	
	//Metodo para insertar a la cola
	public void addVenta(Venta datosVenta) {
		if (datosVenta == null) {
            return;
        }
		NodoVenta nNodo = new NodoVenta(datosVenta);
		if(esVacia()){
			inicioCola = nNodo;
			finalCola = nNodo;
		}else {
			finalCola.sig =nNodo;
			finalCola = nNodo;
		}
	}
	
	//Metodo para extraer el elemnto del frente
    public NodoVenta extraer() {
        if (inicioCola == null) {
            return null;
        } else {
            NodoVenta valorExtraer = inicioCola;//variable temporal
            System.out.println("Venta " + inicioCola.datoVenta.idVenta + " concluida");
            System.out.println("Cliente: " + inicioCola.datoVenta.cliente.getDatoCliente().getNobreCliente()
            		+ "     Empleado: " + inicioCola.datoVenta.empleado.getEmpleado().getNombreEmpleado());
            inicioCola = inicioCola.getSig();//cambiar el frente por el siguiente
            return valorExtraer;//devolver el valor extraido de la cola }
        }
    }
    
  //metodo para mostrar los elementos de la cola
    public void mostrar() {
        if (inicioCola != null) {
            NodoVenta temp = inicioCola;
            System.out.println("Los valores de la cola son :");
            while (temp != null) {
                temp.datoVenta.estadoVenta();
                temp = temp.getSig();
            }
        } else {
            System.out.println("La cola esta vacia");
        }
    }
}
