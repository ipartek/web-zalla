package subastas;

public class Subasta {
	private String nombreObjeto;
	private boolean activo = true;
	private Usuario usuarioSubasta;
	private double mayorPuja = 0.0;
	//MÁXIMO DE SUBASTAS 4
	private int limiteSubasta=0;
	private static final int limiteMaximoSubasta= 4;

	public Subasta(String nombreObjeto, Usuario usuario, boolean activo) {
		this.nombreObjeto = nombreObjeto;
		this.usuarioSubasta = usuario;
		this.activo = activo;
	}

	public Subasta(String nombreObjeto, Usuario usuario, boolean activo, double mayorPuja, int limiteSubasta) {
		this.nombreObjeto = nombreObjeto;
		this.usuarioSubasta = usuario;
		this.activo = activo;
		this.mayorPuja = mayorPuja;
		this.limiteSubasta = limiteSubasta;
	}

	public double pujar() {
		return 0;
	}
	

	public int getLimiteMaximoSubasta() {
		return limiteMaximoSubasta;
	}

	public int getLimiteSubasta() {
		return limiteSubasta;
	}
	

	public void setLimiteSubasta() {
		this.limiteSubasta++;
	}

	public double getMayorPuja() {
		return mayorPuja;
	}

	public void setMayorPuja(double mayorPuja) {
		if (mayorPuja > this.mayorPuja && isActivo() == true) {
			this.mayorPuja = mayorPuja;
		} else {
			System.out.println(
					"La cantidad introducida (" + mayorPuja + ") es menos que la puja actual (" + this.mayorPuja + ")");
		}
	}

	public String getNombreObjeto() {
		return nombreObjeto;
	}

	public Usuario getUsuarioSubasta() {
		return usuarioSubasta;
	}

	public boolean isActivo() {
		if (activo == false) {
			System.out.println("Lo sentimos!! La subasta está inactiva");
		}
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Subasta [nombreObjeto=" + nombreObjeto + ", activo=" + activo + ", usuarioSubasta=" + usuarioSubasta
				+ ", mayorPuja=" + mayorPuja + ", limiteSubasta=" + limiteSubasta + ", limiteMaximoSubasta="
				+ limiteMaximoSubasta + "]";
	}

	// public Usuario getUsuarioSubasta() {
	// return usuarioSubasta;
	// }

	// public ArrayList<Double> getListaPujas() {
	// return listaPujas;
	// }
	//
	// public void setListaPujas(ArrayList<Double> listaPujas) {
	// this.listaPujas = listaPujas;
	// }

}
