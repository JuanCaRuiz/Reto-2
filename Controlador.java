import java.util.Scanner;



public class Controlador {
private int opc;
private String n,a,f,ci,cp,p;
private long c,tf;

Dto dto = new Dto();
Scanner dato = new Scanner(System.in);

public void inicio(){

do{
Vista.menu();
System.out.println("Opción: ");

try{
  opc = dato.nextInt();
}catch(Exception e){
  System.out.println("Opción invalida, elección fuera de parametros");
  opc = 6;
}

if(opc > 6){
  System.out.println("Opción invalida");
  break;
}else{
  if(opc == 1){
    System.out.println("Ingresar estudiante");
    try{
      System.out.println("Ingresar nombres: ");
			dato.nextLine();
      n = dato.nextLine();  
    }catch(Exception e){
      System.out.println("No se pudo ingresar el nombre");
    }
    try{
      System.out.println("Ingresar apellidos:");
      a = dato.nextLine();
    }catch(Exception e){
      System.out.println("No se pudo ingresar los apellidos");
    }
    try{
      System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD):");
      f = dato.next();
    }catch(Exception e){
      System.out.println("Error en el formato de fecha ingresado");
    }
    try{
      System.out.println("Ingresar correo institucional: ");
      ci = dato.next();
      System.out.println("Ingresar correo personal: ");
      cp = dato.next();
    } catch(Exception e){
      System.out.println("Cuenta de correo incorrecta");
    }
    try{
      System.out.println("Ingresar número de celular: ");
      c = dato.nextLong();
      System.out.println("Ingresar número fijo: ");
      tf = dato.nextLong();
    }catch (Exception e){
      System.out.println("Solo carateres numericos");
    }
    try{
      System.out.println("Ingresar programa: ");
			dato.nextLine();
      p = dato.nextLine();
      }catch(Exception e){
        System.out.println("Caracter ingresado no permitido");
      }
      dto.crearEstudiante(n,a,f,ci,cp,c,tf,p);
      System.out.println("Se agregó el estudiante");
      }
    else if(opc == 2){
      System.out.println("Buscar estudiante");
      System.out.println("Ingresar correo institucional:");
      ci = dato.next();
      dto.obtenerEstudiante(ci);
    }
    else if(opc == 3){
      System.out.println("Modificar estudiante");
    }
    else if(opc == 4){
      System.out.println("Eliminar estudiante");
			System.out.println("Ingresar correo institucional:");
      ci = dato.next();
      dto.eliminarEstudiante(ci);
    }
    else if(opc == 5){
      System.out.println("El directorio de los estudiantes ");
      dto.obtenerEstudiantes().forEach(System.out::println);
		} else {
      System.out.println("Hasta pronto");
    }
  }
	} while (opc != 6);
	
  }
}