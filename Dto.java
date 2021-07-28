import java.util.List;
import java.util.ArrayList;

public class Dto {
ArrayList<Modelo> usuarios = new ArrayList<>();

public void crearEstudiante(String nombre,String apellidos, String fecha,String correo_institucional,
String correo_personal, long celular, long numero_fijo, String programa){
usuarios.add(new Modelo(nombre,apellidos,fecha,correo_institucional,
correo_personal,celular,numero_fijo,programa));
}

public ArrayList<Modelo> obtenerEstudiantes(){
  return usuarios;
}

public void obtenerEstudiante(String correo){
  System.out.println("Información del estudiante");
  for(int i = 0; i < usuarios.size(); i++){
    if(usuarios.get(i).getCorreo_institucional().equals(correo)){
    System.out.println(usuarios.get(i));
		}
  }
}

public void eliminarCliente(String correo){
	try{
  int indice = 0;
  for(int i = 0; i < usuarios.size(); i++){
    if(usuarios.get(i).getCorreo_institucional().equals(correo)){
      indice = i;
    }
  }
  usuarios.remove(indice);
  System.out.println("Se eliminó el estudiante");
	} catch (Exception e){
		System.out.println("No encontro el correo ingresado asociado a los estudiantes registrados");
	}
}

}