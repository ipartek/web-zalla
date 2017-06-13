package subastas;

public class SubastaLimitada extends Subasta {
	
	private final int maximasPujas;
	

	public SubastaLimitada(String nombreProductoSubastado, Usuario usuario, int maximasPujas) {
		super(nombreProductoSubastado, usuario);
		this.maximasPujas = maximasPujas;
	}


	public int getMaximasPujas() {
		return maximasPujas;
	}
	
	public void pujar(Usuario usuario, double cantidad) {
		if (super.getListaDePujas().size() < this.maximasPujas){
			super.pujar(usuario, cantidad);
		}
	}

}
