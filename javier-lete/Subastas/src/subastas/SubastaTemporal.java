package subastas;

public class SubastaTemporal extends SubastaLimitada {

	private final int periodoTiempo;
	private long tiempoRestante;
	private long momentoCreacion;

	public SubastaTemporal(String nombreProductoSubastado, Usuario usuario, int maximasPujas, int periodoTiempo) {
		super(nombreProductoSubastado, usuario, maximasPujas);
		this.periodoTiempo = periodoTiempo * 3600000;
		this.momentoCreacion = java.lang.System.currentTimeMillis();

	}

	public long getPeriodoTiempo() {
		return periodoTiempo;
	}

	public boolean quedaTiempo() {
		if (java.lang.System.currentTimeMillis() - this.momentoCreacion < this.periodoTiempo) {
			return true;
		} else {
			return false;
		}
	}

	public long getTiempoRestante() {
		return tiempoRestante;
	}

	public void pujar(Usuario usuario, double cantidad) {
		if (quedaTiempo()) {
			super.pujar(usuario, cantidad);
		}
	}

}
