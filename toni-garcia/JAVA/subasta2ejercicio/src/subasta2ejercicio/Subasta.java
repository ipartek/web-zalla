package subasta2ejercicio;

import java.util.ArrayList;

public class Subasta {
	private String nombreObjeto;
	private boolean activo = true;
	private String usuarioSubasta;
	private double mayorPuja = 0.0;
	
	public Subasta(String nombreObjeto, String propietarioSubasta, boolean activo){
		this.nombreObjeto = nombreObjeto;
		this.usuarioSubasta = propietarioSubasta;
		this.activo = activo;
	}

	public Subasta(String nombreObjeto, String propietarioSubasta, boolean activo, double mayorPuja){
		this.nombreObjeto = nombreObjeto;
		this.usuarioSubasta = propietarioSubasta;
		this.activo = activo;
		this.mayorPuja = mayorPuja;
	}

	public double pujar() {
		return 0;
	}
	public double getMayorPuja() {
		return mayorPuja;
	}

	public void setMayorPuja(double mayorPuja) {
		if(mayorPuja > this.mayorPuja && isActivo()== true){
		this.mayorPuja = mayorPuja;
		}else{
			System.out.println("La cantidad introducida (" + mayorPuja +") es menos que la puja actual (" + this.mayorPuja + ")");
		}
	}


	public String getNombreObjeto() {
		return nombreObjeto;
	}
	

	public String getUsuarioSubasta() {
		return usuarioSubasta;
	}

	public boolean isActivo() {
		if(activo == false){
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
				+ ", mayorPuja=" + mayorPuja + "]";
	}

//	public Usuario getUsuarioSubasta() {
//		return usuarioSubasta;
//	}

//	public ArrayList<Double> getListaPujas() {
//		return listaPujas;
//	}
//
//	public void setListaPujas(ArrayList<Double> listaPujas) {
//		this.listaPujas = listaPujas;
//	}
	

}
