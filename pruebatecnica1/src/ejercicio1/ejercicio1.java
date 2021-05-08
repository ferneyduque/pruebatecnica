package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {
		
	    public static int [] lista = new int[100];
	    

	    public static void imprimirNumerosFaltantes(int[] valores) {
	        for (int i = 0; i < lista.length; i++) {
	            boolean isNumeroFaltante = true;

	            for (int j = 0; j < valores.length; j++) {
	                if (valores[j] == lista[i]) {
	                    isNumeroFaltante = false;
	                }
	            }

	            if (isNumeroFaltante) {
	                System.out.println("Falta el número " + lista[i]);
	            }
	        }
	    }


	    public static void main(String[] args) {
	    	
	    	for(int i=0; i<lista.length ; i++) {
	    		
	    		lista[i] = (int)Math.round(Math.random()*100);
	    		
	    	}
	    	
	        int[] valores = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,25,26,27,28,29,30};
	        
	        
	        
	        ejercicio1.imprimirNumerosFaltantes(valores);
	    }
}
