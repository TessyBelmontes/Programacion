import java.util.Scanner;

public class Calculadora{
	public static int opcion;
	public static double a, b, c, resultado;

	public static void main (String[] args){
		while (opcion !=5){
			Menu();
			Operaciones();
		}
	}

	public static void Menu(){
		System.out.println("Bienvenido a la calculadora\n");
		System.out.println("Elija la operacion a realizar\n");
		System.out.println(" 1.Suma\n 2.Resta\n 3.Multiplicacion\n 4.Division\n 5.Salir\n");
	}
	public static void Operaciones(){
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextInt();

		System.out.println("Ingrese el primer numero");
		a = sc.nextDouble();
		System.out.println("Ingrese el segundo numero");
		b = sc.nextDouble();

		if(opcion == 4 && b == 0){
			System.out.println("NO SE PUEDE DIVIDIR ENTRE CERO");
		}else{
			switch(opcion){
				case 1:
				c = OpSuma(a,b);
				System.out.println("El resultado es:" +c);
				break;
				case 2:
				c = OpResta(a,b);
				System.out.println("El resultado es:" +c);
				break;
				case 3:
				c = OpMultiplicacion(a,b);
				System.out. println("El resultado es:" +c);
				break;
				case 4:
				c = OpDivision(a,b);
				System.out.println("El resultado es:" +c);
				break;
				case 5:
				System.out.println("Salir");
				System.exit(0);
				break;
				default:
				System.out.println("OPCION NO VALIDA");
				break;
			}
		}
	}

	public static double OpSuma(double a, double b){
		resultado = a + b;
		return resultado;
	}
	public static double OpResta(double a, double b){
		resultado = a - b;
		return resultado;
	}
	public static double OpMultiplicacion(double a, double b){
		resultado = a*b;
		return resultado;
	}
	public static double OpDivision(double a, double b){
		resultado = a/b;
		return resultado;
	}
}