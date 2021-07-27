public class Modelo {
	private String nombre;
	private String apellidos;
  private String fecha_nacimiento;
  private String correo_institucional;
  private String correo_personal;
  private long celular;
  private long numero_fijo;
  private String programa;

	public Modelo(){

	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getApellidos(){
		return apellidos;
	}

	public void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}

	public String getFecha_nacimiento(){
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento){
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getCorreo_institucional(){
		return correo_institucional;
	}

	public void setCorreo_institucional(String correo_institucional){
		this.correo_institucional = correo_institucional;
	}

	public String getCorreo_personal(){
		return correo_personal;
	}

	public void setCorreo_personal(String correo_personal){
		this.correo_personal = correo_personal;
	}

	public long getCelular(){
		return celular;
	}

	public void setCelular(long celular){
		this.celular = celular;
	}

	public long getNumero_fijo(){
		return numero_fijo;
	}

	public void setNumero_fijo(long numero_fijo){
		this.numero_fijo = numero_fijo;
	}

	public String getPrograma(){
		return programa;
	}

	public void setPrograma(String programa){
		this.programa = programa;
	}

	public String toString(){
		return "Información del estudiante\nNombres: "+this.nombre+"\n"+"Apellidos: "+this.apellidos+"\n"+"Fecha nacimiento: "+this.fecha_nacimiento+"\n"+"Correo institucional: "+this.correo_institucional+"\n"+"Correo personal: "+this.correo_personal+"\n"+"Número de teléfono celular: "+(String)this.celular+"\n"+"Número de teléfono fijo: "+this.numero_fijo+"\n"+"Programa académico: "+this.programa;
	}
}