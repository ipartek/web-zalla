package subastas;

import java.util.LinkedList;

public class Subasta {
	private String nombreProductoSubastado;
	private Usuario usuario;
	private boolean abierta;
	private LinkedList<Puja> listaDePujas;
	private Puja pujaMayor;

	public Subasta(String nombreProductoSubastado, Usuario usuario) {
		super();
		this.nombreProductoSubastado = nombreProductoSubastado;
		this.usuario = usuario;
		this.abierta = true;
		this.pujaMayor = null;
		this.usuario.SubastasRegistradas(this);
		this.listaDePujas = new LinkedList<Puja>();

	}

	public String getNombreProductoSubastado() {
		return nombreProductoSubastado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public boolean isAbierta() {
		return abierta;
	}

	public LinkedList<Puja> getListaDePujas() {
		return listaDePujas;
	}

	public Puja getPujaMayor() {
		return pujaMayor;
	}

	public void pujar(Usuario usuario, double cantidad) {

		// Evito posibles errores si pujaMayor no ha sido inicializada.
		double cantidadTemporal;
		if (this.pujaMayor == null) {
			cantidadTemporal = 0;
		} else {
			cantidadTemporal = this.pujaMayor.getCantidad();
		}
		// Compruebo si la puja se puede aceptar
		if (this.abierta == true && usuario.getCredito() > cantidadTemporal && this.usuario != usuario
				&& cantidad > cantidadTemporal) {
			Puja nuevaPuja = new Puja(usuario, cantidad);
			this.listaDePujas.addLast(nuevaPuja);
			if (this.pujaMayor == null) {
				this.pujaMayor = nuevaPuja;
			} else {
				if (cantidad > this.pujaMayor.getCantidad()) {
					this.pujaMayor = nuevaPuja;
				}
			}
		}

	}

	public void pujar(Usuario usuario) {
		Puja nuevaPuja = new Puja(usuario, this.pujaMayor.getCantidad() + 1);
		this.pujaMayor = nuevaPuja;
	}

	public boolean ejecutar() {
		if (pujaMayor != null) {
			this.abierta = false;
			this.pujaMayor.getUsuario().DecrementarCredito(this.pujaMayor.getCantidad());
			this.usuario.IncrementarCredito(this.pujaMayor.getCantidad());
			return true;
		} else {
			return false;
		}
	}

}
