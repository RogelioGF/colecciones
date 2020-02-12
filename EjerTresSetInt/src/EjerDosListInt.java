import java.util.*;


public class EjerDosListInt {

	public static void main(String[] args) {
		int veces, num;
		List <Integer> obArrayList = new ArrayList<>();
		List <Integer> obLinkedList = new LinkedList<>();

		veces=(int) (Math.random()*15+1);
		System.out.println("Se van a generar " + veces + " datos. ");
		System.out.println("Insertando: ");

		for (int i = 0; i <= veces; i++) {

			num=(int) (Math.random()*15+1);
			System.out.print(num + " * ");
			obArrayList.add(num);
			obLinkedList.add(num);

		}


		//Valores de objHashSet (no hay orden)
		Iterator<Integer>  itr = obArrayList.iterator();
		Leer.mostrarEnPantalla("\n\nValores de obArrayList: ");
		while(itr.hasNext()) {
			num=itr.next();
			System.out.print(num + " ");
		}//while obHashSet


		//Valores de objLinkHashSet (por orden de inserción)
		Iterator<Integer>  itr02 = obLinkedList.iterator();
		Leer.mostrarEnPantalla("\n\nValores de obLinkedHashSet: ");
		while(itr02.hasNext()) {
			num=itr02.next();
			System.out.print(num + " ");
		}//while obLinkedHashSet
		


	}

}
