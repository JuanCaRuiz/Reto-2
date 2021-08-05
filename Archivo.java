import java.io.File;
import java.io.IOException;

public class Archivo {

  public Archivo(File archivo){
    if(archivo.exists()){
      System.out.println("El archivo ya existe");
    } else {
      try {
        archivo.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

	public void escribirArchivo(ArrayList<Modelo> estudiantes, File archivo){
    PrintWriter salida = null;

    try {
      salida = new PrintWriter(new BufferedWriter(new FileWriter(archivo)));
      for(int i = 0; i < estudiantes.size(); i++){
        salida.println(estudiantes.get(i).getNombre()+","+ estudiantes.get(i).getApellidos()+","+estudiantes.get(i).getFecha_nacimiento()+","+estudiantes.get(i).getCorreo_institucional()+","+estudiantes.get(i).getCorreo_personal()+","+estudiantes.get(i).getCelular()+","+estudiantes.get(i).getNumero_fijo()+","+estudiantes.get(i).getPrograma());
        salida.close();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


}