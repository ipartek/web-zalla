package subastas;

import java.util.ArrayList;

public class Subasta {

	private String nombreObjeto = "";
	private Usuario usur1 = new Usuario("nombre");
	private boolean estado = true;
	private ArrayList<Double> listaPujas = new ArrayList<Double>();
	private double pujaMayor = 0.0;

	public String getNombreObjeto() {
		return nombreObjeto;
	}

	public void setNombreObjeto(String nombreObjeto) {
		this.nombreObjeto = nombreObjeto;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public ArrayList<Double> getListaPujas() {
		return listaPujas;
	}

	public void setListaPujas(ArrayList<Double> listaPujas) {
		this.listaPujas = listaPujas;
	}

	public double getPujaMayor() {
		return pujaMayor;
	}

	public void setPujaMayor(double pujaMayor) {
		this.pujaMayor = pujaMayor;
	}

}
