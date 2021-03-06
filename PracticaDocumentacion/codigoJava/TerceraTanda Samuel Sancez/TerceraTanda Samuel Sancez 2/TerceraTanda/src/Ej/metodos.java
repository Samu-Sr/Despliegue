package Ej;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**
 * 
 * @author Samuel
 * 
 * 25-03-2022
 * En esta clase se encuentran todos los metodos necesarios
 * para el funcionamiento de la pagina
 * 
 */
public class metodos {
	
	static ArrayList<productos>listaProd = new ArrayList<>();
	static ArrayList<productos>cesta = new ArrayList<>();
	
	/**
	 * En datos se guardan los productos disponibles en la tienda
	 * y todos sus datos. Son valores fijos, no son modificables.
	 */
	
	public void datos() {
		
		listaProd.add(new portatiles("Macbook Pro", "MP1", "M1 PRO", 500, "12h"));
		listaProd.add(new portatiles("Macbook Pro", "MP2", "M1 MAX", 1500, "24h"));
		
		listaProd.add(new sobremesa("Imac", "I1", "M1 PRO", 500, 27));
		listaProd.add(new sobremesa("Imac", "I2", "M1 MAX", 1000, 32));
		
		listaProd.add(new iphone("Iphone 13", "IP13", "Pro", 128));
		listaProd.add(new iphone("Iphone 13", "IPM13", "Pro Max", 1000));

		listaProd.add(new tablet("Ipad Pro", "IPT", 500));
		listaProd.add(new tablet("Ipad Pro", "IPT2", 720));

	}
	
	/**
	 * En este metod verDatos se hace una llamada por solicitud del usuario
	 * al metodo datos para cargar sus valores y que el usuario los pueda los
	 * pueda ver imprimidos en pantalla
	 */
	
	public void verDatos() {
		
		for(productos ord : listaProd) {
			
			if (ord instanceof portatiles) {
				
				System.out.println(((portatiles)ord).toString());
				
			} else if (ord instanceof sobremesa) {
				
				System.out.println(((sobremesa)ord).toString());
				
			} else if (ord instanceof iphone) {
				
				System.out.println(((iphone)ord).toString());
				
			} else if (ord instanceof tablet) {
				
				System.out.println(((tablet)ord).toString());
				
			}
			
		}
		
	}
	
	/**
	 * En el m?todo a?adir(), despues de que el usuario consulte
	 * los productos que hay en la tienda tiene una opcion que
	 * le permite a?adir los productos a un array que cumpliria
	 * la funcion de la cesta de la compra.
	 * 
	 * @param codigo - Ingresado por el usuario | Hace referencia al codigo del producto que desea
	 * 											  a?adir el usuario
	 * @param resp - Ingresado por el usuario | Guarda la respuesta dada por el usuario a una consulta
	 * 											que le hace el programa sobre si desea a?adir mas productos
	 * 
	 */
	
	public void a?adir() {
			
			Scanner sc = new Scanner(System.in);
			
			String codigo;
			String resp;
			
			do {
				
			System.out.println("Introduce el codigo del producto:");
			codigo = sc.next();
			
			for (productos produc : listaProd) {
				
				if (codigo.equalsIgnoreCase(produc.getCodigo())) {
					
					cesta.add(produc);
					System.out.println("Se ha guardado el producto.");
				} 
				
			}
			
			System.out.println("?Desea introducir otro producto? si/no");
			resp = sc.next();
			
			} while (resp.equals("si")); 
			
			System.out.println("Ha terminado la operaci?n en la cesta.");
			
		}
	
	/**
	 * En el metodo cesta se recorre el array que crea el usuario al a?adir productos
	 * a la cesta a traves del metodo a?adir(), el metodo cesta le muestra todos los
	 * productos que se han ido a?adiendo.
	 */
	
	
	public void cesta() {
		
		for (productos produc : cesta) {
			
			System.out.println(produc+"\n");
	
		}
	}
	
	/**
	 * 
	 * @param codigo
	 * @return
	 * 
	 * En este metodo se comprueba se hace una consulta al array
	 * cesta para comprobar el atributo codigo.
	 */
	
	public static boolean buscarCodigoCesta(String codigo) {

        for (productos aux : cesta) {

          if (aux.getCodigo().equalsIgnoreCase(codigo)) {
            return true;
          }
        }
        return false;
      }
	
	/**
	 * En este metodo el usuario introduce un codigo por teclado para eliminar
	 * el producto que coincida con dicho codigo, para ello utiliza el metodo buscarCodigoCesta
	 * creado anteriormente, si el codigo no existe emite un mensaje diciendo que no esta en la cesta
	 * y si el codigo existe lo elimina e imprime en pantalla un mensaje de confirmacion.
	 */
	
	public void eliminar() {
	     
		Scanner sc = new Scanner(System.in);
	    Iterator<productos> it = cesta.iterator();
	    boolean bol = false;
	    
	    System.out.println("Introduce el codigo del producto a eliminar:");	       
	    String codigo =sc.next();
	    
	    while(buscarCodigoCesta(codigo)==false) {
            System.out.println("No existe ese codigo\nElija un codigo valido: ");
            codigo=sc.next();
            }
	    
	    while (it.hasNext()) {
	         productos produc = it.next();
	         
	         if (produc.getCodigo().equalsIgnoreCase(codigo)) {
                 it.remove();
                 System.out.println("Producto borrado");
             }
	         
	    	}
	    }
	
	/**
	 * Metodo que permite hacer un calculo sobre los productos que tenemos en el metodo cesta
	 * @param precio - Es un atributo propio del metodo calcular, siempre va a ser 0
	 * 
	 * @param aux.precioPortatil - Es llamado de la clase portatiles, del metodo precioPortatil que segun sea el producto seleccionado nos da un precio u otro
	 * @param aux.precioSobremesa - Es llamado de la clase sobremesa, del metodo precioSobremesa que segun sea el producto seleccionado nos da un precio u otro
	 * @param aux.precioIphone - Es llamado de la clase iphone, del metodo pecioIphone que segun sea el producto seleccionado nos da un precio u otro
	 * @param aux.precioIpad - Es llamado de la clase tablet, del metodo precioIpad que segun sea el producto seleccionado nos da un precio u otro
	 */
	
	public void calcular() {
		
		Scanner sc = new Scanner(System.in);
		double precio = 0;
		
		Iterator<productos> it = cesta.iterator();
			DecimalFormat df = new DecimalFormat("#.00");
			it = cesta.iterator();
			while(it.hasNext()) {
				
				productos aux = it.next();
				
				if (aux.getCodigo().equals("MP1")){
					
					precio = precio + aux.precioPortatil();
					
				} else if (aux.getCodigo().equals("MP2")) {
					
					precio = precio + aux.precioPortatil();
					
				}
				
				if (aux.getCodigo().equals("I1")) {
					
					precio = precio + aux.precioSobremesa();
					
				} else if(aux.getCodigo().equals("I2")) {
					
					precio = precio + aux.precioSobremesa();
					
				}
				
				if (aux.getCodigo().equals("IP13")){
					
					precio = precio + aux.precioIphone();
				} else if(aux.getCodigo().equals("IPM13")) {
					
					precio = precio + aux.precioIphone();
					
				}
				
				if (aux.getCodigo().equals("IPT")){
					
					precio = precio + aux.precioIpad();
					
				} else if(aux.getCodigo().equals("IPT2")) {
					
					precio = precio + aux.precioIpad();
					
				}
				
			}
			
			System.out.println(precio);
						
	}
	
	
		/**
		 * Metodo que sirve para guardar una copia de la factura una vez se haga la compra.
		 */
	
		public void guardar() {
        try {
            ObjectOutputStream guardar = new ObjectOutputStream(
            new FileOutputStream("factura.dat"));

            guardar.writeObject(cesta);
            guardar.close();
            System.out.println("Factura guardada correctamente");
        } catch (FileNotFoundException a) {
            System.out.println("El archivo no es accesible");
        } catch (IOException b) {
            System.out.println("No se puede leer el archivo.");
        }
    }
		
}