package factura;

import cliente.NodoCliente;

public class ListaFacturas {
	NodoFactura cabeza;	
	int tamano;
	
	//constructores
	public ListaFacturas(NodoFactura cabeza, int tamano) {
		this.cabeza = cabeza;
		this.tamano = tamano;
	}

	
	public ListaFacturas() {
		this.cabeza = null;
	}

	public NodoFactura getCabeza() {
		return cabeza;
	}

	public void setCabeza(NodoFactura cabeza) {
		this.cabeza = cabeza;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	
	//Método para adicionar una nueva factura 
    public void addFactura(Factura datosFactura){
        if (datosFactura == null) {
            return;
        }
        if(cabeza == null){
            cabeza = new NodoFactura();
            cabeza.datoFactura = datosFactura;
            tamano++;
        }
        else{
            if(buscarFacturaXId(datosFactura.idFactura)==false){
                NodoFactura tmp = cabeza;
                while(tmp.next != null) {
                	tmp = tmp.next;
                }
                NodoFactura newNode = new NodoFactura();
                newNode.datoFactura = datosFactura;
                tmp.next = newNode;
                tamano++;
                return;
            }else{
                System.out.println("La factura ya se encuentra registrado en el sistema.");
            }
        }
        return;
    }
    
  //MÃ©todo para buscar una factura en la lista por su id
    public boolean buscarFacturaXId(int idFacturaBuscar){
        boolean encontrado = false;
        if(!(cabeza==null)){
            NodoFactura temp = cabeza;
            while(temp != null && encontrado != true){
                if (idFacturaBuscar == temp.datoFactura.idFactura){
                    encontrado = true;
                }
                else{
                    temp = temp.next;
                }
            }
        }
        return encontrado;
    }
    
  //MÃ©todo para mostar todos los elementos de la lista
    public void listarFacturas(){
        if(!(cabeza==null)){
            NodoFactura temp = cabeza;
            while(temp != null){
            	System.out.println("====================================================================");
            	System.out.println("");
                temp.datoFactura.estadoFactura();
                temp = temp.next;
            }
        }else{
            System.out.println("No hay facturas registrados en el sistema.");
        }
    }
    
  //MÃ©todo para obtener el valor de todas las ventas
    public double totalVentas(){
    	double suma = 0;
    	if(!(cabeza==null)){
        	NodoFactura temp = cabeza;
            while(temp != null){
                suma += temp.datoFactura.valorFactura;
                temp = temp.next;
            }
        }else{
            System.out.println("No hay facturas registrados en el sistema.");
        }
        return suma;
    }
    
    //Método para obtener el promedio del valor de las facturas
    public double promedioFactura() {
    	return totalVentas()/tamano;
    }
    
  //Método para mostar todas las facturas de un cliente
    public void listarFacturaXCliente(int idCliente){
        int cont = 0;
        if(!(cabeza==null)){
            NodoFactura temp = cabeza;
            while(temp != null){
                if(temp.datoFactura.cliente.getDatoCliente().getIdcliente() == idCliente){
                    temp.datoFactura.estadoFactura();
                    System.out.println("================================================================================");
                    cont++;
                }
                temp = temp.next;
            }
            if(cont==0){
                System.out.println("No hay facturas a nombre de este cliente");
            }
        }else{
        	System.out.println("No hay facturas registradas en el sistema.");
        }
    } 
}
