package subastas;

import java.util.LinkedList;

public class Subasta {
	private String producto;
	private Usuario propietario;
	private boolean abierto;
	private LinkedList<Puja> listaPujas;
	private Puja pujaMayor;

	/**
	 * @param producto
	 * @param propietario
	 */
	public Subasta(String producto, Usuario propietario) {
		super();
		this.producto = producto;
		this.propietario = propietario;
		this.propietario.añadirSubasta(this);
		this.abierto = true;
		this.pujaMayor = null;
		this.listaPujas = new LinkedList<Puja>();
	}

	public boolean pujar(Usuario pujador, double cantidadPuja) {
		if ((this.abierto && pujador.getCredito() >= cantidadPuja) && (pujador != this.propietario)
				&& (this.pujaMayor == null || this.pujaMayor.getCantidadPuja() < cantidadPuja)) {
			
			Puja nuevaPuja = new Puja(pujador, cantidadPuja);
			this.listaPujas.add(nuevaPuja);
			this.pujaMayor = nuevaPuja;
			
			return true;
		} else {
			return false;
		}
	}
	
	public boolean pujar(Usuario pujador) {
		double puja;
		
		if (this.pujaMayor != null){
			puja = this.pujaMayor.getCantidadPuja() + 1;
		}
		else{
			puja = 1;
		}
		return this.pujar(pujador, puja);
	}
	public boolean ejecutar(){
		if (this.abierto && this.pujaMayor != null){
			this.pujaMayor.getUsuario().decrementarCredito(this.pujaMayor.getCantidadPuja());
			this.propietario.incrementarCredito(this.pujaMayor.getCantidadPuja());
			this.abierto = false;
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * @return the producto
	 */
	public String getProducto() {
		return producto;
	}

	/**
	 * @return the propietario
	 */
	public Usuario getPropietario() {
		return propietario;
	}

	/**
	 * @return the abierto
	 */
	public boolean isAbierto() {
		return abierto;
	}

	/**
	 * @return the listaPujas
	 */
	public LinkedList<Puja> getListaPujas() {
		return listaPujas;
	}

	/**
	 * @return the pujaMayor
	 */
	public Puja getPujaMayor() {
		return pujaMayor;
	}

}
