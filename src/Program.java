import cliente.*;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Program {
	
	public static void main(String[] args)throws NumberFormatException, IOException  {
		java.util.Date fecha = new Date();
		System.out.println(fecha.toString());
		
		Scanner teclado = new Scanner(System.in);
		JFileChooser file = new JFileChooser();	
		file.showOpenDialog(null);			
		String nameFile = file.getSelectedFile().getPath();
			
		int numeroClientes;
		int numeroRepuestos;

	}

}
