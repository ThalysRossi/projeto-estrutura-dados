package DataStructProject;
public class Pilha_vetor {

	private char [] vet;
	private int max;
	private int livre;
			
	public Pilha_vetor() {
		max = 1000;
		vet = new char [1000];
		livre = 0;
	}
	
	public Pilha_vetor (int max) {
		this.max = max;
		vet = new char [max];
		livre = 0;
	}
	
	public int size() {
		return livre;
	}
	
	public void push (char c) {
		if (livre < max) {
			vet[livre] = c;
			livre++;
		} else {
			overflow();
			System.out.println("A pilha está cheia.");
		}
	}
	
	public int pop () {
		if (livre != 0) {
			int removed = vet[livre - 1];
			livre--;
			return removed;
		} else {
			underflow();
			System.out.println("A pilha está vazia.");
			return 0;
		}
	}
	
	public boolean underflow() {
		return livre == 0;
	}
	
	public boolean overflow() {
		return livre >= max;
	}
	
	public char top() {
		return vet[livre - 1];
	}
	
	public void exibe() {
    	System.out.print ( "Pilha Vetor => FUNDO [ ");
    	for (int i = 0; i < size(); i++) {
            System.out.print(vet[i]);
    	}
    	System.out.println ("] TOPO");
    }
	
}
