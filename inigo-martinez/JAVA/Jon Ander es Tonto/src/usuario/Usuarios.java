package usuario;

public class Usuarios {

	private String nombreLog;
	private String password;
	
	public String getNombreLog() {
		return nombreLog;
	}
	public void setNombreLog(String nombreLog) {
		this.nombreLog = nombreLog;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Usuarios(String nombreLog, String password) {
		super();
		this.nombreLog = nombreLog;
		this.password = password;
	}
}
