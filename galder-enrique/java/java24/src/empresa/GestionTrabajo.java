package empresa;

public class GestionTrabajo {
	
	public GestionTrabajo(){}
	
	public void tratarEmpleado(Empleado empleado){
		
		//try{
			if(empleado instanceof Administrativo){
				System.out.println("El empleado es un administrativo.");
				((Administrativo)empleado).trabajar();
			}else if (empleado instanceof Tecnico){
				System.out.println("El empleado es un técnico.");
				((Tecnico) empleado).trabajar();
			}else if (empleado instanceof Ingeniero){
				System.out.println("El empleado es un ingeniero.");
				((Ingeniero) empleado).trabajar();
				((Ingeniero) empleado).disenyar();
			}
		//}catch nullPointerException exc{
			//System.out.println("Debe ser el jefe.");
		//}
		
	}

}
