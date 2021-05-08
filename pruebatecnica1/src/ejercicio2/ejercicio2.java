package ejercicio2;

public class ejercicio2 {
	
	static int[] numeros;
	
	static boolean numero(int valor) {
		for(int i=0; i<numeros.length ;i++) {
			
			if(numeros[i]== valor) {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		
		int [] array = new int[]{1,2,3,4,5,6,7,8,9,10,11,1,4,6,4,1,1,2,7,7,7};
		
		
		numeros = new int[array.length];
		
		for(int i=0; i<array.length ;i++) {
			int contador=0;
			for(int j=0; j<array.length ;j++) {
				
				if(array[i] == array[j]) {
					contador++;
					if(numero(array[i])) {
						
						numeros[i] = array[i];
						
					}
				}
			}
			if(numeros[i] != 0) {
				System.out.println(numeros[i]+" se repite: "+ contador);
			}
		}
		
	}

}
