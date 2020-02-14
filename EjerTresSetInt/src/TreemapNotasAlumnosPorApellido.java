import java.util.*;

public class TreemapNotasAlumnosPorApellido {

	public static void main(String[] args) {
		TreeMap<Integer, TreeSet<String> > mapaNotas = new TreeMap<>();
		//Map<String, Integer> mapNotas= new TreeMap<>();
		String [] apellidos= {"Jimenez", "Gimeno", "Iliarte", "Soriano", "*", "Lamata", "Climent", "argota"};
		int nota;
		String apellido= apellidos[(int)(Math.random()* apellidos.length)];
		boolean encontrado = false;


		while(!apellido.equals("*")) {
			System.out.println(apellido + "*******************");
			// si el apellido no esta en el mapa insertamos nodo
			// primero buscamos el apellido
			encontrado = buscarApellido(mapaNotas, apellido);
			if(!encontrado) {// si no esta se le da nota
				nota= (int)(Math.random() *10 + 1);
				//si el valor de la nota esta dentro del mapa
				if(mapaNotas.containsKey(nota)) {
					//recuperar el treeset de apellidos y añadirlo 
					mapaNotas.get(nota).add(apellido);
					
				}else {// si la nota no esta en el mapa
					// creamos un treeset con el apellido
					TreeSet<String> setApellidos = new TreeSet<>();
					//añadir el apellido al TreeSet
					setApellidos.add(apellido);
					//Insertar nodo en el apellido
					mapaNotas.put(nota, setApellidos);
				}
			}else {// apellido repetido

				Leer.mostrarEnPantalla("No se puede repetir el apellido " + apellido);
			}
			apellido= apellidos[(int)(Math.random()* apellidos.length)];
		}//while
//
//		for(String cadena: mapaNotas.keySet()) {
//			System.out.println("Alumno: " + cadena);
//			System.out.println("Nota: " + mapaNotas.get(cadena));
//			System.out.println("---------------------------");
//		}
		listarNotas(mapaNotas);
	}

	private static void listarNotas(TreeMap<Integer, TreeSet<String>> mapaNotas) {

		for (Integer nota : mapaNotas.keySet()) {
			Leer.mostrarEnPantalla("\n\nNOTA: " + nota);
			TreeSet<String> apellidosdelaNota = mapaNotas.get(nota);
		
			for (String apellido : apellidosdelaNota) {
				System.out.printf("%-10s", apellido);
			}
		}
		
	}

	//metodo para comprobar si esta el apellido
	private static boolean buscarApellido(TreeMap<Integer, TreeSet<String> > mapaNotas, String apellido) {
		boolean encontrado = false;
		
		
		
//		for (Integer nota : mapaNotas.keySet()) {
//			TreeSet<String> setApellidos = mapaNotas.get(nota);
//			for (String ape : setApellidos) {
//				if(ape.equals(apellido)) {
//					encontrado = true;
//				}
//			}
//			
//		}
		//devuelve un set con todas las claves que tiene el mapa,
		Set<Integer> conjuntoNotas = mapaNotas.keySet();
		Iterator<Integer> it = conjuntoNotas.iterator();
		//mientras no lo encuentre
		while(!encontrado && it.hasNext()) {
			//recupero el set de apellidos
			Integer nota = it.next();
 			TreeSet<String> setApellidos = mapaNotas.get(nota);
			if(setApellidos.contains(apellido)) {
				encontrado=true;
			}
		}


		return encontrado;
	}
	

	
}
