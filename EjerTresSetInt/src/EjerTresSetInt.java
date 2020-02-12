import java.util.*;

public class EjerTresSetInt {

	public static void main(String[] args) {

		int num, veces;

		Set <Integer> obHashSet = new HashSet<>();
		Set <Integer> obLinkedHashSet = new LinkedHashSet<Integer>();
		Set <Integer> obTreeSet = new TreeSet<Integer>(); 

		veces=(int) (Math.random()*15+1);
		System.out.println("Se van a generar " + veces + " datos. ");
		System.out.println("Insertando: ");

		for (int i = 0; i <= veces; i++) {

			num=(int)(Math.random()*7001+1000);
			System.out.print(num + " * ");

			obHashSet.add(num);
			obLinkedHashSet.add(num);
			obTreeSet.add(num);
		}

		//muestra los valores desordenados
		Iterator<Integer>  itr = obHashSet.iterator();
		Leer.mostrarEnPantalla("\n\nValores de obHashSet: ");
		while(itr.hasNext()) {
			num=itr.next();
			System.out.print(num + " ");
		}//while obHashSet

		//muestra los valores ordenados por orden de entrada
		Iterator<Integer>  itr02 = obLinkedHashSet.iterator();
		Leer.mostrarEnPantalla("\n\nValores de obLinkedHashSet: ");
		while(itr02.hasNext()) {
			num=itr02.next();
			System.out.print(num + " ");
		}//while obLinkedHashSet


		//ordenados todos los valores de menor a mayor
		Iterator<Integer>  itr03 = obTreeSet.iterator();
		Leer.mostrarEnPantalla("\n\nValores de obTreeSet: ");
		while(itr03.hasNext()) {
			num=itr03.next();
			System.out.print(num + " ");
		}//while obTreeSet

		
		Leer.mostrarEnPantalla("\n");
		System.out.println("Valores de objHashSet: " + obHashSet.toString());
		System.out.println("Valores de objLinkHashSet: " + obLinkedHashSet.toString());
		System.out.println("Valores de objTreeSet: " + obTreeSet.toString());

	}//main

}//class
