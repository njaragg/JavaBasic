package cl.generation.f20221025;

import java.util.ArrayList;

public class ArregloDinamico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList 
		//1.- Definicion
		//ArrayList<TIPODATO> nombre_array = new ArrayList<TIPODATO>();
		ArrayList<String> grupo1 = new ArrayList<String>();
		//2.- Agregar valores al arreglo
		grupo1.add("Judi");
		grupo1.add("Mari");
		grupo1.add("Adolfo");
		grupo1.add("Alexander");
		grupo1.add("Nico");
		
		//si es size es dinamico, si es lenght es estatico
		System.out.println(grupo1.size());
		System.out.println(grupo1.get(1));
		
		System.out.println(grupo1);
		grupo1.remove(1);
		System.out.println(grupo1);
		
		//Recorrer el ArrayList
		for (int i = 0; i < grupo1.size(); i++) {
			System.out.println("Relator "+(i+1)+" "+grupo1.get(i));		
		}
		System.out.println("************************");
		//For iterador o for objeto
		for(String relator: grupo1) {
			System.out.println(relator);

				
			
		}

	}

}
