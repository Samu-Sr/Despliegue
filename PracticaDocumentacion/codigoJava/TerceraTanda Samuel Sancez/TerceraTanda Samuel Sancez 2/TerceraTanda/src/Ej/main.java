package Ej;

/**
 * @author Samuel
 * 
 * 25-03-2022
 * 
 * En la clase main esta construido el menú sobre el que 
 * el usuario hara sus peticiones.
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	public static void main(String []args) throws IOException {
		
		/**
		 * A traves de un switch el usuario podra realizar distintas gestiones.
		 * 
		 * 1. - Llama al metodo verDatos de la clase metodos.
		 * 2. - Llama al metodo añadir de la clase metodos.
		 * 3. - Llama al metodo cesta de la clase metodos.
		 * 4. - Llama al metodo eliminar de la clase metodos.
		 * 5. - Llama al metodo calcular de la clase metodos.
		 * 6. - Llama al metodo guardar de la clase metodos.
		 */
		
		Scanner sc = new Scanner(System.in);
		metodos m = new metodos();
		
		m.datos();
		
		int resp = 1;
		
		while (resp > 0 && resp < 7) {
			
			System.out.println("-----MENU-----");
			System.out.println(" ");
			System.out.println("1.- Mostrar los productos de la Tienda.");
			System.out.println("2.- Añadir productos a la cesta.");
			System.out.println("3.- Mostrar cesta.");
			System.out.println("4.- Eliminar Productos.");
			System.out.println("5.- Calcular Importe.");
			System.out.println("6.- Guardar Factura.");
			System.out.println("7.-Salir");
			
			resp = sc.nextInt();
			
			switch(resp) {
			
			case 1:
				m.verDatos();
				break;
			case 2:
				m.añadir();
				break;
			case 3:
				m.cesta();
				break;
				
			case 4:
				m.eliminar();
				break;
			case 5:
				m.calcular();
				break;
			case 6:
				m.guardar();
				break;
			default:
				break;
			
			}
			
		}
		
		System.out.println("Gracias por usar nuestro servicio");
		System.out.println("FIN DE PROGRAMA.");
		
	}

}
