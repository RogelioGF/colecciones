import java.util.*;


public class EjerTresSetString {

	public static void main(String[] args) {

		int veces;
		String nom;
		String []nombres = {"este", "montaña", "letra", "bajo", "frio","aleatorio"};

		Set <String> obHashSet = new HashSet<>();
		Set <String> obLinkedHashSet = new LinkedHashSet<String>();
		Set <String> obTreeSet = new TreeSet<String>(); 


		veces=(int) (Math.random()*15+1);
		System.out.println("Se van a generar " + veces + " datos. ");
		System.out.println("Insertando: ");


		for (int i = 0; i <= veces; i++) {

			String nombre = nombres[(int)(Math.random()*nombres.length)];
			System.out.print(nombre + " * ");
			obHashSet.add(nombre);
			obLinkedHashSet.add(nombre);
			obTreeSet.add(nombre);
		}

		//Valores de objHashSet (no hay orden)
		Iterator<String>  itr = obHashSet.iterator();
		Leer.mostrarEnPantalla("\n\nValores de obHashSet: ");
		while(itr.hasNext()) {
			nom=itr.next();
			System.out.print(nom + " ");
		}//while obHashSet

		//Valores de objLinkHashSet (por orden de inserción)
		Iterator<String>  itr02 = obLinkedHashSet.iterator();
		Leer.mostrarEnPantalla("\n\nValores de obLinkedHashSet: ");
		while(itr02.hasNext()) {
			nom=itr02.next();
			System.out.print(nom + " ");
		}//while obLinkedHashSet


		//Valores de objTreeSet (orden alfabético)
		Iterator<String>  itr03 = obTreeSet.iterator();
		Leer.mostrarEnPantalla("\n\nValores de obTreeSet: ");
		while(itr03.hasNext()) {
			nom=itr03.next();
			System.out.print(nom + " ");
		}//while obTreeSet
		
		Leer.mostrarEnPantalla("\n");
		System.out.println("Valores de objHashSet: " + obHashSet.toString());
		System.out.println("Valores de objLinkHashSet: " + obLinkedHashSet.toString());
		System.out.println("Valores de objTreeSet: " + obTreeSet.toString());

	}

}
