import java.util.*;


public class EjerDosListString {

	public static void main(String[] args) {

		int veces;
		String nom;
		String []nombres = {"este", "montaña", "letra", "bajo", "frio","aleatorio"};
		List <String> obArrayList = new ArrayList<>();
		List <String> obLinkedList = new LinkedList<>();


		veces=(int) (Math.random()*15+1);
		System.out.println("Se van a generar " + veces + " datos. ");
		System.out.println("Insertando: ");

		for (int i = 0; i <= veces; i++) {

			String nombre = nombres[(int)(Math.random()*nombres.length)];
			System.out.print(nombre + " * ");
			obArrayList.add(nombre);
			obLinkedList.add(nombre);

		}//for



		//Valores de obArrayList (no hay orden)
		Iterator<String>  itr = obArrayList.iterator();
		Leer.mostrarEnPantalla("\n\nValores de obArrayList: ");
		while(itr.hasNext()) {
			nom=itr.next();
			System.out.print(nom + " ");
		}//while obArrayList


		//Valores de obLinkedList (por orden de inserción)
		Iterator<String>  itr02 = obLinkedList.iterator();
		Leer.mostrarEnPantalla("\n\nValores de obLinkedHashSet: ");
		while(itr02.hasNext()) {
			nom=itr02.next();
			System.out.print(nom + " ");
		}//while obLinkedList

		Leer.mostrarEnPantalla("\n");
		System.out.println("Valores de objArrayList: " + obArrayList.toString());
		System.out.println("Valores de obLinkedHashSet: " + obLinkedList.toString());


	}

}
