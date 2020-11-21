package Almacen;
import cliente.*;
import empleado.*;
import factura.*;
import repuesto.*;
import Venta.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Program {	
	static Scanner teclado = new Scanner(System.in);
	
	public static listaClienteDE listaCliente = new listaClienteDE();
	public static ArbEmpleado arbEmpleado = new ArbEmpleado();
	public static NodoEmpleado arbolE = new NodoEmpleado();
	public static arbRepuesto arbRepuesto = new arbRepuesto();
	public static NodoRepuesto arbolR = new NodoRepuesto();
	public static NodoRepuesto arbolR2 = new NodoRepuesto();
	public static ListaFacturas listaFactura = new ListaFacturas();
	public static colaVenta colaVenta = new colaVenta();
	
	
	public static void main(String[] args)throws NumberFormatException, IOException  {
		JFileChooser file = new JFileChooser();	
		file.showOpenDialog(null);			
		String fileName = file.getSelectedFile().getPath();
			
		int numeroClientes;
		int numeroRepuestos;
		int numeroEmpleados;
		int numeroFacturas;

		 FileReader fr;
	     String line;
	     String[] data;
	     try {
	    	 fr = new FileReader(fileName);
	         BufferedReader bf = new BufferedReader(fr);
	            
	         //Extraccion de numero de clientes
	         line = bf.readLine();
	         data = line.split(" ");
	         numeroClientes = Integer.parseInt(data[0]);
	         
	       //Adicion de Clientes
	       for (int i = 0; i < numeroClientes; i++) {
	    	   line = bf.readLine();
	           data = line.split(" ");
	           Cliente newCliente = new Cliente(Integer.parseInt(data[0]), data[1], Long.parseLong(data[2]), data[3]);
	           listaCliente.addCliente(newCliente);
	       }
	       
	     //Extraccion de numero de empleados
	         line = bf.readLine();
	         data = line.split(" ");
	         numeroEmpleados = Integer.parseInt(data[0]);
	         
	       //Adicion de Clientes
	       for (int i = 0; i < numeroEmpleados; i++) {
	    	   line = bf.readLine();
	           data = line.split(" ");
	           Empleado newEmpleado = new Empleado(Integer.parseInt(data[0]), data[1]);
	           NodoEmpleado nNodo = new NodoEmpleado(newEmpleado);
	           arbEmpleado.addEmpleado(arbolE, nNodo);
	       }
	       
	     //Extraccion de numero de repuestos
	         line = bf.readLine();
	         data = line.split(" ");
	         numeroRepuestos = Integer.parseInt(data[0]);
	         
	       //Adicion de Repuestos
	       for (int i = 0; i < numeroRepuestos; i++) {
	    	   line = bf.readLine();
	           data = line.split(" ");
	           Repuesto newRepuesto = new Repuesto(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]));
	           NodoRepuesto nNodo = new NodoRepuesto(newRepuesto);
	           arbRepuesto.addRepuesto(arbolR, nNodo);
	       }
	       
	     //Extraccion de numero de facturas
	         line = bf.readLine();
	         data = line.split(" ");
	         numeroFacturas = Integer.parseInt(data[0]);
	         
	       //Adicion de Facturas
	       for (int i = 0; i < numeroFacturas; i++) {
	    	   line = bf.readLine();
	           data = line.split(" ");
	           int idFactura = Integer.parseInt(data[0]);
	           int idCliente = Integer.parseInt(data[1]);
	           NodoCliente cliente = listaCliente.retornarClienteXId(idCliente);
	           arbRepuesto listaItems = new arbRepuesto();
	           
	           int id = Integer.parseInt(data[2]);
	           Repuesto newRepuesto = arbRepuesto.returnNodo(arbolR, id).getRepuesto();
	           newRepuesto.setCantidad(4);
	           newRepuesto.setPrecioTotal(newRepuesto.getPrecio()*newRepuesto.getCantidad());
	           NodoRepuesto nNodoR = new NodoRepuesto(newRepuesto);
	           listaItems.addRepuesto(arbolR2, nNodoR);
	           
	           id = Integer.parseInt(data[3]);
	           newRepuesto = arbRepuesto.returnNodo(arbolR, id).getRepuesto();
	           newRepuesto.setCantidad(6);
	           newRepuesto.setPrecioTotal(newRepuesto.getPrecio()*newRepuesto.getCantidad());
	           nNodoR = new NodoRepuesto(newRepuesto);
	           listaItems.addRepuesto(arbolR2, nNodoR);
	           
	           id = Integer.parseInt(data[4]);
	           newRepuesto = arbRepuesto.returnNodo(arbolR, id).getRepuesto();
	           newRepuesto.setCantidad(4);
	           newRepuesto.setPrecioTotal(newRepuesto.getPrecio()*newRepuesto.getCantidad());
	           nNodoR = new NodoRepuesto(newRepuesto);
	           listaItems.addRepuesto(arbolR2, nNodoR);
	           
	           Double valorFactura = listaItems.valorTotalFactura(arbolR);
	           Factura newFactura = new Factura(idFactura, cliente, listaItems, valorFactura);
	           listaFactura.addFactura(newFactura);
	       }
	       fr.close();
	     }  
	     catch (IOException e) {
	  }
	  //listaCliente.listarClientes();
	  //arbEmpleado.recorrerArbol(arbolE);
	  //arbRepuesto.recorrerArbol(arbolR);
	  //listaFactura.listarFacturas();
	     
	   //Menu de opciones para el sistema
         int valor = 1;
         do{
        	 System.out.println("1- Listar clientes.");
        	 System.out.println("2- Listar repuestos.");
        	 System.out.println("3- Listar empleados.");
        	 System.out.println("4- Listar facturas.");
        	 System.out.println("5- Agregar un nuevo cliente al sistema.");
        	 System.out.println("6- Agregar un nuevo repuesto al sistema.");
        	 System.out.println("7- Agregar un nuevo empleado al sistema.");
        	 System.out.println("8- Listar Facturas.");
        	 System.out.println("9- Mostrar cliente con mayor valor de compra");
        	 System.out.println("10- Mostrar cliente con menor valor de compra");
        	 System.out.println("11- Mostrar promedio de compras totales por cliente");
        	 System.out.println("12- Mostrar el valor total del inventario disponible");
        	 System.out.println("13- Añadir Cliente a fila de venta");
        	 System.out.println("14- Mostrar cola de venta");
        	 System.out.println("15- Generar factura a cliente en fila");
        	 System.out.println("0- SALIR");
        	 System.out.println("Seleccione una opción: ");
        	 valor = teclado.nextInt();
        	 switch(valor){
        	 	case 1: listaCliente.listarClientes(); break;
        	 	case 2: arbRepuesto.recorrerArbol(arbolR); break;
        	 	case 3: arbEmpleado.recorrerArbol(arbolE); break;
        	 	case 4: listaFactura.listarFacturas(); break;
        	 	case 5: Cliente cliente = cargarCliente(); listaCliente.addCliente(cliente); break;
        	 	case 6: NodoRepuesto repuesto = cargarRepuesto(); arbRepuesto.addRepuesto(arbolR, repuesto); break;
        	 	case 7: NodoEmpleado empleado = cargarEmpleado(); arbEmpleado.addEmpleado(arbolE, empleado); break;
        	 	case 8: listaFactura.listarFacturas();
        	 	case 9: listaCliente.clienteCompraMayor().getDatoCliente().estadoCliente();
        	 	case 10: listaCliente.clienteCompraMenor().getDatoCliente().estadoCliente();
        	 	case 11: listaCliente.promedioCompraClientes();
        	 	case 12: System.out.println("El valor total del inventario disponible es de: "+arbRepuesto.valorTotalInventario(arbolR)+" pesos.");
        	 	case 13: Venta venta = cargarClienteAFilaVenta(); colaVenta.addVenta(venta); break;
        	 	case 14: colaVenta.mostrar();
        	 	case 15: Factura factura = cargarFactura(); listaFactura.addFactura(factura); colaVenta.extraer(); break;
        	 }
         }while(valor!=0);
	}
	
	public static Cliente cargarCliente(){
        	System.out.println("Ingrese los datos del nuevo cliente:");
        	System.out.println("Id Cliente: ");
             int id = teclado.nextInt();
             System.out.println("Nombre Cliente: ");
             String nombre = teclado.next();
             System.out.println("Teléfono Cliente:");
             long telefono = Long.parseLong(teclado.next());
             System.out.println("Tipo Cliente: ");
             String tipo = teclado.next();
             Cliente cliente = new Cliente(id, nombre, telefono, tipo);
             return cliente;
     }	
	
	public static NodoRepuesto cargarRepuesto(){
    	System.out.println("Ingrese los datos del nuevo repuesto:");
    	System.out.println("Id Repuesto: ");
         int id = teclado.nextInt();
         System.out.println("Nombre Repuesto: ");
         String nombre = teclado.next();
         System.out.println("Stock:");
         int stock = Integer.parseInt(teclado.next());
         System.out.println("Precio: ");
         Double precio = Double.parseDouble(teclado.next());
         Repuesto repuesto = new Repuesto(id, nombre, stock, precio);
         NodoRepuesto nRepuesto = new NodoRepuesto(repuesto);
         return nRepuesto;
 }
	
	public static NodoEmpleado cargarEmpleado(){
    	System.out.println("Ingrese los datos del nuevo empleado:");
    	System.out.println("Id Empleado: ");
         int id = teclado.nextInt();
         System.out.println("Nombre Empleado: ");
         String nombre = teclado.next();
         Empleado  empleado = new Empleado(id, nombre);
         NodoEmpleado nEmpleado = new NodoEmpleado(empleado);
         return nEmpleado;
	}
	
	public static Venta cargarClienteAFilaVenta(){
    	System.out.println("Ingrese los datos del cliente a añadir a la cola de venta:");
    	System.out.println("Puesto en la cola: ");
        int idCola = teclado.nextInt();
    	System.out.println("Id Cliente: ");
        int idCli = teclado.nextInt();
        System.out.println("Id Empleado: ");
        int idEmp = teclado.nextInt();
        Venta venta = new Venta(idCola, listaCliente.retornarClienteXId(idCli), arbEmpleado.returnNodo(arbolE, idEmp));
         return venta;
 }	
	
	//Parametros para agregar una nueva factura
    static Factura cargarFactura(){
        System.out.println("Ingrese los datos de la nueva factura:");
        System.out.println("Id Factura: ");
        int id = teclado.nextInt();
        NodoCliente cliente = colaVenta.finalCola.getDatoVenta().getCliente();
        System.out.println("Lista articulos:");
        arbRepuesto listaItems = new arbRepuesto();
        int var = 1;
        do{
        	System.out.println("Ingrese el ID del repuesto que desea añadir: ");
            int idA = teclado.nextInt();
            Repuesto newArticulo = arbRepuesto.returnNodo(arbolR, idA).getRepuesto();
            System.out.println("Ingrese la cantidad que desea llevar:");
            int cant = teclado.nextInt();
            if(cant>newArticulo.getStock()){
            	System.out.println("No estan disponibles todas estas unidades.");
            	System.out.println("Desea ingresar otra cantidad menor a: " + newArticulo.getStock() + " unidades.");
            	System.out.println("1- SI");
            	System.out.println("0- NO");
            	System.out.println("Seleccione una opción: ");
                int a = teclado.nextInt();
                if(a == 1){
                	System.out.println("Ingrese la cantidad que desea llevar:");
                    cant = teclado.nextInt();
                    newArticulo.setCantidad(cant);
                    newArticulo.setPrecioTotal(newArticulo.getCantidad() * newArticulo.getPrecio());
                    arbRepuesto.returnNodo(arbolR, idA).getRepuesto().setStock(newArticulo.getIdRepuesto()-cant);
                    NodoRepuesto nRepuesto = new NodoRepuesto(newArticulo);
                    listaItems.addRepuesto(arbolR2, nRepuesto);
                }else{
                    listaItems.addRepuesto(null, null);
                }
            }else{
                newArticulo.setCantidad(cant);
                newArticulo.setPrecioTotal(newArticulo.getCantidad() * newArticulo.getPrecio());
                arbRepuesto.returnNodo(arbolR, idA).getRepuesto().setStock(newArticulo.getStock()-cant);
                NodoRepuesto nRepuesto = new NodoRepuesto(newArticulo);
                listaItems.addRepuesto(arbolR2, nRepuesto);
            }

            System.out.println("Desea añadir otro item a la factura:");
            System.out.println("1- SI");
            System.out.println("0- NO");
            System.out.println("Seleccione una opción: ");
            var = teclado.nextInt();
        }while(var!=0);
        Double valorFactura = listaItems.valorTotalFactura(arbolR2);
        Factura factura = new Factura(id, cliente, listaItems, valorFactura);
        return factura;
    }

}
