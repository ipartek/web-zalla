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
		System.out.println("Subasta.Subasta()");
		this.producto = producto;
		this.propietario = propietario;
		this.propietario.añadirSubasta(this);
		this.abierto = true;
		this.pujaMayor = null;
		this.listaPujas = new LinkedList<Puja>();
	}

	public boolean pujar(Usuario pujador, double cantidadPuja) {
		
		System.out.println("Subasta.pujar()");
		
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
		
		System.out.println("Subasta.pujar()");
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
		
		System.out.println("Subasta.getProducto()");
		
		return producto;
	}

	/**
	 * @return the propietario
	 */
	public Usuario getPropietario() {
		
		System.out.println("Subasta.getPropietario()");
		
		return propietario;
	}

	/**
	 * @return the abierto
	 */
	public boolean isAbierto() {
		
		System.out.println("Subasta.isAbierto()");
		
		return abierto;
	}

	/**
	 * @return the listaPujas
	 */
	public LinkedList<Puja> getListaPujas() {
		
		System.out.println("Subasta.getListaPujas()");
		
		return listaPujas;
	}

	/**
	 * @return the pujaMayor
	 */
	public Puja getPujaMayor() {
		
		System.out.println("Subasta.getPujaMayor()");
		
		return pujaMayor;
	}

}
