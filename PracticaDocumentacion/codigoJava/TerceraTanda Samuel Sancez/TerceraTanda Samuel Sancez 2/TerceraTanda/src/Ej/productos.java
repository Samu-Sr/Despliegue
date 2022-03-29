package Ej;

/**
 *  * @author Samuel
 * 
 * 25-03-2022
 * En esta clase se encuentran todos los valores comunes de los productos.
 * Es la clase padre y todos los productos heredan los atributos que se encuentran
 * en esta clase.
 */

import java.io.Serializable;

public class productos implements Serializable{
	
	/**
	 * Estos atributos definen el tipo de producto y el codigo de producto.
	 */
	
	private String producto;
	private String codigo;
	
	public productos() {
	}

	public productos(String producto, String codigo) {
		super();
		this.producto = producto;
		this.codigo = codigo;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Esta funcion almacena en un array los atributos de esta clase.
	 */

	@Override
	public String toString() {
		return "productos [producto=" + producto + ", codigo=" + codigo + "]";
	}
	
	/**
	 * En los siguientes metodos se llama a los metodos creados en las subclases de los productos
	 * como son: iphone, sobremesea, tablet y portatil para que sean llamados desde la clase metodos.
	 * @return
	 */
	
	public double precioIphone() {
		
		return this.precioIphone();
		
	}
	
	public double precioIpad() {
		
		return this.precioIpad();
	}
	
	public double precioSobremesa() {
		
		return this.precioSobremesa();
		
	}
	
	public double precioPortatil() {
		
		return this.precioPortatil();
		
	}
	
	
}

	
