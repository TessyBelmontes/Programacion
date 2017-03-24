import java.io.*;
import java.util.*;
public class TestFecha{
  public static void main(String[] args) {

    int dia, mes, anio, opcion, opcion1;
    Scanner entrada = new Scanner(System.in);
    int[] fecha1 = new int [3];

do{

  System.out.println("\n\t1.-Para ver la Fecha actual");
  System.out.println("\t2.-Para ingresar el dia del mes");
  System.out.println("\t3.-Para ingresar el dia y mes del año");
  System.out.println("\t4.-Para ingresar el dia, mes y año.");
  System.out.println("\t5.-Para salir");

  opcion = entrada.nextInt();

  switch(opcion){
    case 1:
      Fecha uno = new Fecha();
      System.out.println("\n\tLa Fecha Actual es:");
      uno.asignarFecha();
      uno.obtenerFecha(fecha1);
      uno.verFecha(fecha1);
      break;

    case 2:
      Fecha dos = new Fecha();
      do{
        System.out.print("\n\tIngresa el dia del mes: ");
        dia = entrada.nextInt();
        dos.asignarFecha(dia);
      }while(dos.fechaCorrecta(dia) == false);
      dos.obtenerFecha(fecha1);
      System.out.println("\n\tLa fecha es:");
      dos.verFecha(fecha1);
        break;

    case 3:
      Fecha tres = new Fecha();
      do{
        System.out.print("\n\tIngresa el dia del mes: ");
        dia = entrada.nextInt();
        System.out.print("\tIngrese el mes del año: ");
        mes = entrada.nextInt();
        tres.asignarFecha(dia,mes);
      }while(tres.fechaCorrecta(dia,mes) == false);
        tres.obtenerFecha(fecha1);
        System.out.println("\n\tLa fecha es:");
        tres.verFecha(fecha1);
        break;

    case 4:
      Fecha cuatro = new Fecha();
      do{
        System.out.print("\n\tIngresa el dia del mes: ");
        dia = entrada.nextInt();
        System.out.print("\tIngrese el mes del año: ");
        mes = entrada.nextInt();
        System.out.print("\tIngresa el año: ");
        anio = entrada.nextInt();
        cuatro.asignarFecha(dia,mes,anio);
      }while(cuatro.fechaCorrecta(dia,mes,anio) == false);
      cuatro.obtenerFecha(fecha1);
      System.out.println("\n\tLa fecha es:");
      cuatro.verFecha(fecha1);
      break;

    default:  System.out.println("\n\nOpcion invalida");

    }
      System.out.println("\nPara volver a ingresar Presione [1], para salir cualquier numero");
      opcion1 = entrada.nextInt();
  }while(opcion1 == 1);


  }

}
