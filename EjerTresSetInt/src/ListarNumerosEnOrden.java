import java.util.*;


/*Crea un proyecto que se llame ListarNumerosEnOrden
	Escribe un programa en Java que pida números al usuario hasta que teclee el -9999. Una vez
	dado ese valor escribe en orden creciente todos los elementos distintos de la secuencia de
	números introducida por el usuario.
	Para almacenar los números que diga el usuario se creará un objeto TreeSet<Integer>.*/

public class ListarNumerosEnOrden {

	public static void main(String[] args) {
		int num;
		Scanner teclado = new Scanner(System.in);
		Set <Integer> obTreeSet = new TreeSet<>(); 
		System.out.println("Teclea numeros, -9999 oara finalizar: ");

		do {
			num=teclado.nextInt();
			if (num == -9999) {
				obTreeSet.remove(num);
			}else {
				obTreeSet.add(num);
			}
		}while(num != -9999);

		//ordenados todos los valores de menor a mayor
		Iterator<Integer>  itr03 = obTreeSet.iterator();
		Leer.mostrarEnPantalla("\n\nValores de obTreeSet: ");
		while(itr03.hasNext()) {
			num=itr03.next();
			System.out.print(num + " ");
		}//while obTreeSet
		
		
		Leer.mostrarEnPantalla("\n");
		System.out.println("Valores de objTreeSet: " + obTreeSet.toString());
		teclado.close();

	}

}
