package Ej;

/**
 * @author Samuel
 * 
 * 25-03-2022
 * En esta clase se almacenan los datos fijos del producto iphone.
 *
 */

public class iphone extends productos{
	
	/**
	 * Estos atributos hacen referencia al modelo del producto
	 * y a la capacidad de su memoria.
	 */
	private String modelo;
	private int memoria;
	
	

	public iphone() {
		// TODO Auto-generated constructor stub
	}
	
	public iphone(String producto, String codigo, String modelo, int memoria) {
		super(producto, codigo);
		this.modelo = modelo;
		this.memoria = memoria;
	}

	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getMemoria() {
		return memoria;
	}



	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	/**
	 * Esta funcion recoge los valores guardados en esta calse y en la clase padre en un array.
	 */
	@Override
	public String toString() {
		return "iphone [modelo=" + modelo + ", memoria=" + memoria + "]"+super.toString();
	}

	/**
	 * Este metodo lo utilizamos para declarar el precio del producto.
	 */
	@Override
	public double precioIphone() {
		
		/**
		 * El atributo precio puede tener dos valores que siempre van a ser fijos.
		 * Si no se cumple la condicion se retorna el precio base de lo contrario
		 * se retorna el precio calculado en el if.
		 */
		
		double precio = 1127.99;
		int suplemento = 250;
		
			if ( memoria == 1000) {
				precio = precio + suplemento;
			}
			
			return precio;
		
	}
	
}
