package ejercicio01;

import java.util.Scanner;

/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si 
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 
horas.*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("probando eclipse");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Buenos días, ingrese tiempo en minutos");
		double mins = entrada.nextDouble();
		
		//System.out.println(minutos);
		
		//double dias = Math.floor(minutos/1440);
		//double horas = Math.floor(minutos / 1440 % 1 * 10) ;
		
		double hs = mins / 60;
		double ds = Math.floor(hs / 24);
		double hsRest = Math.round(hs % 24 * 100) / 100;
		
		System.out.println(mins + " minutos es igual a " + ds + " días y " 
							+ hsRest + " horas.");
		
		
	}

}
