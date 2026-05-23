
package retopreexamen;

import java.util.Scanner;
import java.util.ArrayList;

class Lectura {
  private static Scanner inp = new Scanner(System.in);
  public static int nextInt(String mss) {
    System.out.print(mss);
    return inp.nextInt();
  }
}

class FilaIndia{
   // Lista para almacenar el orden de los soldados
  private ArrayList<Integer> soldados = new ArrayList<>();

  // Método para agregar un soldado a la fila
  public void add(int soldado) {
    soldados.add(soldado);
  }
            

public void revisar(int[] comandantes, int[] subordinados) {
    for (int i = 0; i < comandantes.length; i++) {
      int comandante = comandantes[i];
      int subordinado = subordinados[i];
      
    
      int posComandante = soldados.indexOf(comandante);
      int posSubordinado = soldados.indexOf(subordinado);
      
    
      if (posSubordinado <= posComandante) { 
        System.out.println("NO. " + comandante + "-" + subordinado);
        return;
      }
    }
    System.out.println("SI.");
  }
     
public class retopreexamen {
	public static void main(String[] args) {
		FilaIndia filaI = new FilaIndia();
		int comandantes[], subordinados[];

		int n = Lectura.nextInt("Cuántos soldados en la fila: ");
		for (int i = 0; i < n; i++)
		  filaI.add(Lectura.nextInt("Siguiente soldado: "));

		int s = Lectura.nextInt("Cuántos supervisados: ");
		comandantes = new int[s];
		subordinados = new int[s];
		for (int i = 0; i < s; i++) {
		  comandantes[i] = Lectura.nextInt("Siguiente soldado supervisor: ");
		  subordinados[i] = Lectura.nextInt("Siguiente soldado sobordinado: ");
		}
		filaI.revisar(comandantes, subordinados);
	}
    }
}
