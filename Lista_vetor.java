package DataStructProject;
public class Lista_vetor {

	private double [] vet;
	private int livre;
	private int max;
	
	public Lista_vetor() {
		max = 1000;
		vet = new double [1000];
		livre = 0;
	}
	
	public Lista_vetor(int max) {
		this.max = max;
		vet = new double[max];
		livre = 0;
	}
	
	public void addLast(double v) {
		if(livre < max) {
			vet[livre] = v;
			livre++;
		} else {
			System.out.println("Lista cheia!");
		}
	}
	
	public void addFirst(double v) {
		if(livre < max) {
			for(int i = livre; i > 0; i--) {
				vet[i] = vet[i-1];
			}
			vet[0] = v;
			livre++;	
		} else {
			System.out.println("Lista cheia");
		}
		
	}
	
	public void add(int i, double v) {
		if(livre < max) {
			for(int j = livre; j >= i; j--) {
				vet[j+1] = vet[j];
			}
			vet[i] = v;
			livre++;	
		} else {
			System.out.println("Lista cheia");
		}
	}
		
	public double get(int i) {
		if (i >= 0 && i < livre) {
			return vet[i];
		}
		else if(livre == 0) {
			System.out.println("A lista está vazia!");
			return 0;
		}
		else {
			System.out.println("Elemento não consta na lista.");
			return 0;
		}
	}
	
	public double getLast() {
		if(livre > 0) {
			return vet[livre-1];
		} else {
			System.out.println("Valor errado");
			return 0;
		}
	}
	
	public double getFirst() {
		if(livre != 0) {
			return vet[0];
		} else {
			System.out.println("Lista vazia.");
			return 0;
		}
	}
	
	public double removeLast() {
		if (livre != 0) {
			double removed = vet[livre];
			livre--;
			return removed;
		} else {
			System.out.println("Lista vazia.");
			return 0;
		}
	}
	
	public double removeFirst() {
		double removed = vet[0];
		if(livre != 0) {
			for(int i = 0; i < livre; i++) {
				vet[i] = vet[i + 1];
			}
			livre--;
			return removed;
		} else {
			System.out.println("Lista vazia.");
			return 0;
		}
	}
	
	public double remove(int i) {
		if (i >= 0 && i < livre) {
			double removed = vet[i];
			for(int j = i; j < livre; j++) {
				vet[j] = vet[j+1];
			}
			livre--;
			return removed;
		} else {
			System.out.println("Não há nada na lista nessa posição.");
			return 0;
		}
	}
	
	public double set (int i, double v) {
		if(i >= 0 && i < livre) {
			double updated = vet[i];
			vet[i] = v;
			return updated;
		} else {
			System.out.println("Não há nada na lista nessa posição.");
			return 0;
		}
	}
	
	public int size() {
		return livre;
	}
	
	public String toString() {
		String lista;
		lista = "Lista Vetor => [ ";
		for (int i = 0; i < livre; i++) {
			lista += vet[i] + " ";
		}
		lista += "]";
		return lista;
	}

	public double media() {
		if(size() != 0) {
			double soma = 0;
			double media = 0;
			for(int i = 0; i < livre; i++) {
				soma += vet[i];
			}
			media = soma / livre;
			return media;
		}
		else {
			System.out.println("Impossível calcular média, lista vazia!");
			return 0;
		}
	}
}
