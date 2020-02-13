import java.util.*;


/*Escribe un programa en Java que:
 Pida al usuario que introduzca un número indeterminado de palabras. La introducción
de datos terminará cuando introduzca un “*” (que por supuesto no se tendrá en
cuenta para hacer lo que se pide en el ejercicio).
 Pida que se diga un número entero positivo num que no puede ser mayor que el
número de palabras distintas que se han dado.
 Muestre las num primeras palabras en orden alfabético de la lista de palabras que ha
dado el usuario.*/


public class ListarNumPalabrasOrdenadas {

	public static void main(String[] args) {
		int num = 0;
		String palabra;
		Scanner teclado = new Scanner(System.in);
		Set <String> obTreeSet = new TreeSet<>(); 
		Set <Integer> ob2TreeSet = null; 
		System.out.println("Introduce palabras por teclado, * para finalizar: ");

		do {
			palabra = teclado.nextLine();
			if (palabra.equals("*")) {
				obTreeSet.remove(palabra);
			}else {
				obTreeSet.add(palabra);
			}
		}while(!palabra.equals("*"));

		System.out.println("Dime un número entero positivo");

		do {
			num = teclado.nextInt();
			ob2TreeSet = new TreeSet<>(); 

		}while(num < 0 || num >= obTreeSet.size());

		System.out.println("Numero de objetos almacenados en la coleccion: " + obTreeSet.size());
		System.out.println("Numero de objetos almacenados en la coleccion: " + ob2TreeSet.size());

		//ordenados todos los valores de menor a mayor
		Iterator<String>  itr = obTreeSet.iterator();
		Leer.mostrarEnPantalla("\n\nValores de obTreeSet: ");
		while(itr.hasNext()) {
			palabra=itr.next();
			System.out.print(palabra + " ");
		}//while obTreeSet


		Leer.mostrarEnPantalla("\n");
		System.out.println("Valores de objTreeSet: " + obTreeSet.toString());
		teclado.close();


	}

}
