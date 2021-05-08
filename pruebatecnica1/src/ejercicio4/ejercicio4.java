package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
	       
        System.out.print("Por favor ingrese el tamaño del array: ");
        int n = teclado.nextInt();
        int array [] = new int [n];
       
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese dato "+(i+1)+": ");
            array [i] = teclado.nextInt();
        }
       
        int par = array [0];
       int suma=0;
       
        for (int i = 0; i < array.length; i++) {
            if(array [i]%2==0) {
                par = array[i];
                System.out.println("es par: "+par);
                suma= suma+par;
                
            }            
        }
        
        System.out.println("El valor de la suma es: "+suma);
	}

}

