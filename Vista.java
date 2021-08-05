import java.io.IOException;
import java.util.Scanner;

public class Vista {
    private Scanner dato;

    public Vista (){
      dato = new Scanner(System.in);
    }
    public void menu(){
      System.out.println("INSTITUTO LA FLORESTA");
      System.out.println("Seleccione tarea a realizar:");
      System.out.println("1. Ingresar estudiante");
      System.out.println("2. Buscar estudiante");
      System.out.println("3. Modificar estudiante");
      System.out.println("4. Eliminar Estudiante");
      System.out.println("5. Ver directorio de estudiantes");
      System.out.println("6. Salir");
    }

    public void mostrarMensaje(String mensaje){
      System.out.println(mensaje);
    }

    public String leerDatoString (String mensaje){
      mostrarMensaje(mensaje);
      String info = dato.nextLine();
      return info;
    }

    public long leerDatoLong (String mensaje){
      long info = 0;
      try {
        mostrarMensaje(mensaje);
        info = dato.nextLong();
        dato.nextLine();
      } catch (Exception e){
        dato.nextLine();
        mostrarMensaje("Solo se permiten caracteres numericos");
        info = 0;
      }
      return info;
    }	

    public int leerNumeroEntero (){
      int info = 0;
      try {
        info = dato.nextInt();
        dato.nextLine();
      } catch (Exception e){
        dato.nextLine();
        mostrarMensaje("Solo se permiten caracteres numericos");
        info = 0;
      }
      return info;
    }		


}