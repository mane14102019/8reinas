package modelo;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		 Reina reinas= new Reina(8);
		 reinas.buscarSoluciones();
	        ArrayList soluciones = reinas.getSoluciones();
	        
	        int x = (int) Math.floor(Math.random()*(92-1+1)+1);
	      
	        for (int i = 0; i<soluciones.size();i++){
	            int[] aux  = (int[]) soluciones.get(i);
	            if(x==i+1){
	            	 System.out.println("Solucion :");
	            	 for (int j = 0; j<aux.length;j++){
	 	            	
	 	                System.out.print("(" + (j+1) + "," + (aux[j]+1) + ")");
	 	            	}
	            }
	            
	            
	        }
	        
	        }
		 
		 
	}


