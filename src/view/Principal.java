package view;
import java.util.Random;

import controller.ControllerNegativos;
public class Principal {
	
	public static void main(String[] args) {
		int[] vetor = new int[10];
		ControllerNegativos controllerNegativos = new ControllerNegativos();
		Random gerador = new Random();
		
		for(int x = 0; x < 10; x++) {
			vetor[x] = gerador.nextInt();
			System.out.println(vetor[x]);
		}
		int resultado = controllerNegativos.contador(vetor, 0, (vetor.length - 1));
		System.out.println(resultado);
	}
}
