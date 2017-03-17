import java.io.*;
public class Diccionario{
	public static String[] palabras = newString[50];
	public static String[] traduccion =newString[50];
	public static String palabra, traducir;
	public static int i;
	public static boolean salir = false;

	public static void main (String[]args) throws IOException{

		InputStreamReader isr = InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		while (i<50 && salir != true){
			creacionDiccionario();
			System.out.println("¿Desea agregar una palabra?\n 1.SI/ 0.NO");

			int auxiliar = Interger.parseInt(br.readLine());
			if (auxiliar == 0){
				salir = true;

			}
			i++;
			public static void creacionDiccionario() throws IOException{
				BufferedReader br = newBufferedReader(newInputStreamReader(System.in));
				System.out.println(i+"Ingrese la palabra por traducir a Ingles");
				palabras[i] = br.readLine();
				System.out.println(i+"Ingrese la palabra por traducir a Español");
 
				traduccion[i] = br.readLine();
			}

			public static void traducir() throws IOException {
				BufferedReader br = new BufferedReader(newInputStreamReader(System.in));
				System.out.println(i+ "Ingrese la palabra por traducir");
				traducir = br readLine();

				for(i=0; i<palabras.length; i++){
					if (traducir.equalsIgnoreCase(palabras[i])){
						System.out.println("Traducción: "+traduccion[i]);

					}
				}

				for (i=0; i<traduccion.length; i++){
					if (traducir.equalsIgnoreCase(traduccion[i])){
						System.out.println("Traduccion:" + palabras[i]);
					}

				}
			}





		}

	}













}