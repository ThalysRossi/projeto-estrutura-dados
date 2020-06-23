package DataStructProject;
public class Lista_dinamica {
	
	private No ini, fim;
	private int tam, max;
	
	public Lista_dinamica(){
		ini = null;
		fim = null;
		tam = 0;
		max = 1000;
	}
	
	public Lista_dinamica(int valor) {
		ini = null;
		fim = null;
		tam = 0;
		max = valor;
		
	}
	
	public int size(){
		return tam;
	}
	
	public void addFirst( double e ){
	    if (tam == 0){
	        ini = new No(e);
	        fim = ini;
	        tam++;
	    } else{
	        No novo = new No(e, ini);
	        ini = novo;
	        tam++;
	    }

	}
	public void addLast(double e) {
		if(tam == 0) {
			ini = new No(e);
			fim = ini;
			tam++;			
		} else {
			No novo = new No(e);
			fim.prox = novo;
			tam++;
			fim = novo;			
		}
	}	
	
	public void add(int index, double e) {
		if((index >= 0) && (index <= size())){
			if(index == 0) {
				addFirst(e);
			} else if(index == size()) {
				addLast(e);
			} else {
				No aux = ini;
				for(int j = 0; j < index-1; j++) {
					aux = aux.prox;
				}
				No novo = new No(e, aux.prox);
				aux.prox = novo;
				tam++;
			}
		} else {
			System.out.println("Posição não consta na lista.");
		}
	}
	
	public double set( int index , double e ) {
		if(index >= size()) {
			System.out.println("Fora dos limites!!");
			return 0;
		} else {
			No aux = ini;
			No oldNode = new No(aux.info);
			No newNode = new No(e);
			newNode.info = e;
			for(int i = 0; i != index; i++) {
				aux = aux.prox;
			}
			oldNode.info = aux.info;
			aux.info = newNode.info;
			return oldNode.info;
		}
	}


	public double getFirst(){
        if (size() != 0){
            return ini.info;
        } else{
            System.out.println("Lista vazia!");
            return 0;
        }
    }   
	
    public double getLast(){
        if (size() != 0){
            return fim.info;
        } else{
            System.out.println("Lista vazia!");
            return 0;
        }
    }
    
    public double get ( int i ) {
    	if(size() != 0){
			int cont = 0;
			No aux = ini;
			while(cont != i) {
				aux = aux.prox;
				cont++;
			}
			return aux.info;
		}
    	else if (size() == 0) {
    		System.out.println("Lista vazia!");
    		return 0;
    	}
    	else {
			System.out.println("Elemento não conta na lista!");
			return 0;
        }
    }
    
    public double removeFirst(){
    	if(size() != 0){
    		double removed = ini.info;
    		ini = ini.prox;
    		tam--;
    		return removed;
    	} else {
    		System.out.println("Lista vazia!");
    		return 0;
    	}
    }
    
    public double removeLast(){
    	if(size() != 0) {
    		double removed = fim.info;
    		No aux = ini;
    		while(aux.prox.prox != null) {
    			aux = aux.prox;
    		}    		
    		aux.prox = null;
    		fim = aux;
    		tam--;
    		return removed;
    	} else {
    		System.out.println("Lista vazia!");
    		return 0;
    	}
    }
    
    public double remove( int index ) {
		if((index >= 0) && (index <= size())){
			if(index == 0) {
				return removeFirst();
			} else if(index == size()) {
				return removeLast();
			} else {
				double removed;
				No aux = ini;
				for(int j = 0; j < index-1; j++) {
					System.out.println("Chega indice "+j);
					aux = aux.prox;
				}
				removed = aux.prox.info;
				aux.prox = aux.prox.prox;				
				tam--;
				return removed;
			}
		} else {
			System.out.println("Posição não consta na lista.");
			return 0;
		}
    }
    
	public String toString() {
		No aux = ini;
		String lista;
		lista = "Lista Dinamica[";
		for(int i = 0; i < size(); i++) {
			lista += aux.info + " ";
			aux = aux.prox;
		}
		lista += "]";
		return lista;
	}
	
	public double media() {
		if(size() != 0) {
			double soma = 0;
			double media = 0;
			No aux = ini;
			for(int i = 0; i < size(); i++) {
				soma += aux.info;
				aux = aux.prox;
			}
			media = soma / size();
			return media;
		}
		else {
			System.out.println("Impossível calcular média, lista vazia!");
			return 0;
		}
	}
	
	public void printSecond(){
		  if ( size() >= 2 ) {
		     No x;
		     x = ini.prox;
		     System.out.println( x.info );
		   }
		   else System.out.println("Posição 2 está vazia!");
		}
	
	public void inverte(){
		No anterior = null, proximo = null;
		No aux = ini;
		if(size() > 1) {
			while(aux != null) {
				proximo = aux.prox;
				aux.prox = anterior;
				anterior = aux;
				aux = proximo;
			}
			ini = anterior; 
		}
		else {
			System.out.println("A lista está vazia!");
		}
	}
}
