package ejercicio02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a 
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el 
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una 
variable auxiliar.*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//uso dos list
		List lista = new ArrayList<Integer>();
		List lista2 = new ArrayList<Integer>();
		
		//armo lista pero con nros random
		for (int i = 0; i < 4; i++) {
			Integer nro = (int) Math.floor(Math.random() * 10 + 1);
			// validamos que no se repita
			boolean valid = true;
			for (int j = 0; j < lista.size(); j++) {
				if (lista.get(j) == nro) {
					valid = false;
					i--;
				}
			}
			if (valid == true) {
				lista.add(nro);
			}
		}
		//muestro lista inic
		System.out.println("Los valores iniciales son:");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//armo nueva lista
		lista2.add(lista.get(3));
		lista2.add(lista.get(2));
		lista2.add(lista.get(0));
		lista2.add(lista.get(1));
		//muestro nueva lista
		System.out.println("La nueva lista quedaría:");
		for (int i = 0; i < lista2.size(); i++) {
			System.out.println(lista2.get(i));
		}

	}
}
