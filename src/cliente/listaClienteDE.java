package cliente;

public class listaClienteDE {
	NodoCliente cabCliente;
	NodoCliente ultCliente;
	int tam;
	
	//Constructor
	public listaClienteDE() {
	}

	public listaClienteDE(NodoCliente cabCliente, NodoCliente ultCliente) {
		this.cabCliente = cabCliente;
		this.ultCliente = ultCliente;
	}

	//Getter and Setters
	public NodoCliente getCabCliente() {
		return cabCliente;
	}

	public void setCabCliente(NodoCliente cabCliente) {
		this.cabCliente = cabCliente;
	}

	public NodoCliente getUltCliente() {
		return ultCliente;
	}

	public void setUltCliente(NodoCliente ultCliente) {
		this.ultCliente = ultCliente;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}
	
    //M�todo para adicionar un nuevo cliente a la lista
    public void addCliente(Cliente datosCliente){
        if (datosCliente == null) {
            return;
        }
        if(cabCliente == null){
            cabCliente = new NodoCliente();
            cabCliente.datoCliente = datosCliente;
            ultCliente.datoCliente = datosCliente;
            tam++;
        }
        else{
            if(buscarClienteXId(datosCliente.idcliente)==false){
                NodoCliente tmp = ultCliente;
                NodoCliente newNode = new NodoCliente();
                newNode.datoCliente = datosCliente;
                tmp.sig = newNode;
                newNode.ant = tmp;
                ultCliente = tmp;
                tam++;
                return;
            }else{
                System.out.println("El cliente ya se encuentra registrado en el sistema.");
            }
        }
        return;
    }
    
  //Método para buscar un cliente en la lista por su id
    public boolean buscarClienteXId(int idClienteBuscar){
        boolean encontrado = false;
        if(!(cabCliente==null)){
            NodoCliente temp = cabCliente;
            while(temp != ultCliente && encontrado != true){
                if (idClienteBuscar == temp.datoCliente.idcliente){
                    encontrado = true;
                }
                else{
                    temp = temp.sig;
                }
            }
        }
        return encontrado;
    }
    
  //Método para retornar un cliente por su ID
    public NodoCliente retornarClienteXId(int idClienteRetornar) {
        NodoCliente temp = null;
        int count = 0;
        if (!(cabCliente == null)) {
            if(buscarClienteXId(idClienteRetornar)==true){
                temp = this.cabCliente;
                while ((count < tam) && !(temp.datoCliente.idcliente==idClienteRetornar)) {
                    temp = temp.sig;
                }
            }
        }
        return temp;
    }
       
  //Método para mostar todos los elementos de la lista
    public void listarClientes(){
        if(!(cabCliente==null)){
            NodoCliente temp = cabCliente;
            while(temp != ultCliente){
                temp.datoCliente.estadoCliente();
                temp = temp.sig;
            }
        }else{
            System.out.println("No hay clientes en el registrados sistema.");
        }
    }
    
    //Metodo que retorna el cliente con compra mayor
    public NodoCliente clienteCompraMayor() {
        NodoCliente temp = null;
        NodoCliente temp2 = null;
        double count = 0;
        if (!(cabCliente == null)) {
        	temp = cabCliente;
        	temp2 = cabCliente;
            while(temp != ultCliente){
            	if(temp.datoCliente.cuentaTotal>count) {
            		count = temp.datoCliente.cuentaTotal;
            		temp2 = temp;
            	}
                temp = temp.sig;
            }
        }
        return temp2;
    }
    
  //Metodo que retorna el cliente con compra menor
    public NodoCliente clienteCompraMenor() {
        NodoCliente temp = null;
        NodoCliente temp2 = null;
        if (!(cabCliente == null)) {
        	double count = cabCliente.datoCliente.cuentaTotal;
        	temp = cabCliente;
            while(temp != ultCliente){
            	if(temp.datoCliente.cuentaTotal<count) {
            		count = temp.datoCliente.cuentaTotal;
            		temp2 = temp;
            	}
                temp = temp.sig;
            }
        }
        return temp;
    }
    
    //Metodo que promedia el total de compras por cliente
    public double promedioCompraClientes(){
    	double count = 0;
    	if(!(cabCliente==null)){
        	NodoCliente temp = cabCliente;
            while(temp != ultCliente){
                count += cabCliente.datoCliente.cuentaTotal;
                temp = temp.sig;
            }
        }else{
            System.out.println("No hay clientes en el registrados sistema.");
        }
    	double promedio = count / tam;
        return promedio;
    }
}
