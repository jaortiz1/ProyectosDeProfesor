package principal;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// LISTAS
		/// CREACION
		List<Integer> ls = new ArrayList<Integer>();

		// funciones principales
		ls.add(1);
		ls.add(2);
		ls.add(20);

		ls.add(10);
		ls.add(9);

		System.out.println(ls);
		ls.set(1, 5);
		System.out.println(ls);
		ls.remove(4);
		System.out.println(ls);
		System.out.println(ls.get(0));
		for(int i = 0; i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		//bucle for mejorado
		System.out.println("FOR MEJORADO");
		for(Integer num:ls) {
			System.out.println(num);
		}
		//NO LO USES
		ls.forEach(x->System.out.println(x));
		//NO SE PUEDEN MODIFICAR MIENTRAS SE RECORREN DA ERROR
		System.out.println("�Mi lista esta vacia? "+ls.isEmpty());
		ls.clear();
		System.out.println(ls);
		System.out.println("FIN DE LISTAS\n------------------------------------------");
		
	}

}
