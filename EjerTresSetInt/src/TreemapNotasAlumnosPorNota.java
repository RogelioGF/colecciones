import java.util.*;

public class TreemapNotasAlumnosPorNota {

	public static void main(String[] args) {

		Map<String, Integer> mapNotas= new TreeMap<>();
		int nota;
		String [] apellidos= {"Jimenez", "Gimeno", "Iliarte", "Soriano", "*", "Lamata", "Climent"};
		String apellido= apellidos[(int)(Math.random()* apellidos.length)];

		while(!apellido.equals("*")) {
			System.out.println(apellido + "*******************");
			
			
			//si el mapa no contiene la clave(key) señalada en apellido, asigna nota a un apellido
			if(!mapNotas.containsKey(apellido)) {
				nota= (int)(Math.random() *10 + 1);
				mapNotas.put(apellido, nota);
			}
			apellido= apellidos[(int)(Math.random()* apellidos.length)];
		}

		for(String cadena: mapNotas.keySet()) {
			System.out.println("Alumno: " + cadena);
			System.out.println("Nota: " + mapNotas.get(cadena));
			System.out.println("---------------------------");
		}
	}

}
