package subastas;

import java.util.ArrayList;

public class Subasta {

	private String nombreObjeto = "";
	private Usuario usur1 = new Usuario("nombre");
	private boolean estado = true;
	private ArrayList<Double> listaPujas = new ArrayList<Double>();
	private double pujaMayor = 0.0;
	
	public Subasta(String nombreObjeto,Usuario propietario,boolean estado){
		this.nombreObjeto=nombreObjeto;
		this.usur1=propietario; 
		this.estado=estado;

	
		
	}

	@Override
	public String toString() {
		return "Subasta [Nombre del Objeto=" + nombreObjeto + ", Propietario=" + usur1 + ", Estado=" + estado + ", Lista de Pujas="
				+ listaPujas + ", Puja Mayor=" + pujaMayor + "]";
	}

	public Subasta(String nombreObjeto,Usuario propietario,boolean estado,ArrayList<Double>listado,double pujaMayor){
		this.nombreObjeto=nombreObjeto;
		this.usur1=propietario; 
		this.estado=estado;
		this.listaPujas=listado;
		this.pujaMayor=pujaMayor;
		
	}
	
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
