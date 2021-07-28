public class Modelo {
	private String nombre;
	private String apellidos;
  private String fecha_nacimiento;
  private String correo_institucional;
  private String correo_personal;
  private long celular;
  private long numero_fijo;
  private String programa;

	public Modelo(String nombre,String apellidos, String fecha,String correo_institucional, String correo_personal, long celular, long numero_fijo, String programa){
  this.nombre = nombre;
  this.apellidos = apellidos;
  fecha_nacimiento = fecha;
  this.correo_institucional = correo_institucional;
  this.correo_personal = correo_personal;
  this.celular = celular;
  this.numero_fijo = numero_fijo;
  this.programa = programa;
  }

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

@Override
public String toString() {
  return "Información del estudiante" +"\n"+
  	"Nombres: " + nombre + "\n" +
    "Apellidos: " + apellidos + "\n" +
    "Fecha nacimiento: " + fecha_nacimiento + "\n" +
    "Correo institucional: " + correo_institucional + "\n" +
    "Correo personal: " + correo_personal + "\n" +
    "Número de teléfono celular: " + celular + "\n" +
    "Número de teléfono fijo: " + numero_fijo +"\n"+
    "Programa académico: " + programa ;
}
}