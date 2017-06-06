package subastas;

import java.util.ArrayList;

public class Subasta {

	private String nombreObjeto = "";
	private Usuario usur = new Usuario("nombre");
	private boolean estado = true;
	private ArrayList<Double> listaPujas = new ArrayList<Double>();
	private double pujaMayor = 0.0;
	
	public Subasta(String nombreObjeto,Usuario propietario,boolean estado){
		this.nombreObjeto=nombreObjeto;
		this.usur=propietario; 
		this.estado=estado;

	
		
	}

	@Override
	public String toString() {
		return "Subasta [Nombre del Objeto=" + nombreObjeto + ", Propietario=" + usur + ", Estado=" + estado + ", Puja Mayor=" + pujaMayor + "]";
	}

	public Subasta(String nombreObjeto,Usuario propietario,boolean estado,double pujaMayor){
		this.nombreObjeto=nombreObjeto;
		this.usur=propietario; 
		this.estado=estado;
		this.pujaMayor=pujaMayor;
		
	}
	
	
	public String getNombreObjeto() {
		return nombreObjeto;
	}

	public void setNombreObjeto(String nombreObjeto) {
		this.nombreObjeto = nombreObjeto;
	}
	
	public void setNombrePropietario(Usuario propietario){
		this.usur=propietario;
	}
	public Usuario getNombrePropietario(){
		return usur;
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
	
	
	public static void consultarCatalogo(){
		
	}

}
