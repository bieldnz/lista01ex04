package controller;

public class ControllerNegativos {
	
	public ControllerNegativos() {
		super();
	}
	
	public int contador(int[] vetor, int n, int tamanho) {
		if(tamanho >= 0) {
			if(vetor[tamanho] < 0) {
				n = n + 1; //Incrementa a contagem atual do número de termos menores que 0 já contados
			}
			n = contador(vetor, n, (tamanho - 1));
		}
		return n; //A condição de parada é o tamanho do vetor ser menor que 0
	}
	
}
