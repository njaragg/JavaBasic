package cl.generation.f20221024;

import java.util.Arrays;


public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arreglos o Array en Java (estaticos, no cambian de tamaño)
		int[] arreglo = new int[3];
		// agregar datos
		arreglo[0] = 4;
		arreglo[1] = 8;
		arreglo[2] = 12;
		System.out.println(arreglo.toString());

		System.out.println(arreglo[0] + " ");

		System.out.println(Arrays.toString(arreglo));

		System.out.println(arreglo[1]);

		int[] sinNumeros = {};// cero, vacio.
		System.out.println(sinNumeros.length);
		String[] vocales = { "a", "e", "i", "o", "u" };
		System.out.println("cantidad de elentos " + vocales.length);
		vocales[1] = "o";
		vocales[3] = "e";
		vocales[2] = "y";

		System.out.println("El arreglo vocales es: " + Arrays.toString(vocales));

		// sinNumeros[0]=78; //para un arreglo vacio NO SE PUEDE
		// System.out.println("El arreglo sinNumeros es: "+sinNumeros);

		// ACTIVIDAD, crear un array de numeros flotantes de tamano 6

		float[] vocalesFlotantes = new float[6];
		// Agregar 6 elementos al arreglo

		vocalesFlotantes[0] = 1f;
		vocalesFlotantes[1] = -2.2313312f;
		vocalesFlotantes[2] = 3f;
		vocalesFlotantes[3] = 4f;
		vocalesFlotantes[4] = 5f;
		vocalesFlotantes[5] = 6f;

		int[] numeroInt = new int[2];
		numeroInt[0] = (int) 0.2; // int -> long -> float-> double
		System.out.println("el valor es " + numeroInt[0]);

		System.out.println("El arreglo vocales flotantes es: " + Arrays.toString(vocalesFlotantes));

		
		//crear un arreglo de enteros de tamano 100 y agregar valores dinamicamente desde el 1 al 100
		
		int[] arreglo100 = new int[100];
		for (int i = 0; i < arreglo100.length; i++) {
			arreglo100[i]=i+1;
			
		}
		System.out.println("El arreglo vocales flotantes es: " + Arrays.toString(arreglo100));
		
		//crear un arreglo de enteros de tamano 100 y agregar valores dinamicamente desde el 100 al 1
		
		int[] arregloAlreves = new int[100];
		for (int i = 0; i < arregloAlreves.length; i++) {
			arregloAlreves[i]=arregloAlreves.length-i;
					
		}
		System.out.println("El arreglo numeros 100 al 1 es: " + Arrays.toString(arregloAlreves));
		
		int[] arregloAlreves2 = new int[100];
		for (int i = arregloAlreves2.length; i >0; i--) {
			arregloAlreves2[arregloAlreves2.length-i]=i;
					
		}
		System.out.println("El arreglo numeros 100 al 1 es: " + Arrays.toString(arregloAlreves2));
		
		//Escribir un arreglo de tamaño de 10 ,con números positivos y negativos , capturar en máximo y mínimo
		
		int[] arreglo10= {-3,-5, 4,12, 3,35, -35,77,-1, 0};
		System.out.println("El arreglo numeros es: " + Arrays.toString(arreglo10));
		int maximo=arreglo10[0];
        for(int i =0; i <arreglo10.length;i++){
            if(maximo < arreglo10[i]){
                maximo= arreglo10[i];
            }
        }
        System.out.println("El mayor del arreglo es: " + maximo);
        
        int cantImp=0;
        int cantPar=0;
        for (int i = 0; i < arreglo10.length; i++) {
			if ((arreglo10[i] % 2)==0) {
				cantPar=cantPar+1;
			}
			else {
				cantImp=cantImp+1;
			}
			
		}
        
        //3
        float resultado3=0;
        for (int i = 0; i < arreglo10.length; i++) {
        	resultado3=resultado3+arreglo10[i];
		}
        resultado3=resultado3/arreglo10.length;
        System.out.println("El promedio del arreglo es: " + resultado3);
        System.out.println("El 0 es: " +(0%2));
        
	}
	
	

}
