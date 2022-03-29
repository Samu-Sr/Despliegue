package Ej;

/**
 * @author Samuel
 * 
 * 25-03-2022
 * En esta clase se encuentran los valores que tendran en comun las clases sobremesa
 * y portatiles.
 *
 */

public class ordenadores extends productos {
	
	/**
	 * Este atributo define el tipo de procesador que tendra el producto.
	 */

	private String procesador;
	
	public ordenadores() {
		super();
	}

	public ordenadores(String producto, String codigo, String procesador) {
		super(producto, codigo);
		this.procesador = procesador;
	}

	public ordenadores(String procesador) {
		super();
		this.procesador = procesador;;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	
	/**
	 * Esta funcion recoge los valores guardados en esta calse y en la clase padre en un array.
	 */
	
	@Override
	public String toString() {
		return "Ordenadores [Procesador=" + procesador +"]"+super.toString();
	}
	
}
