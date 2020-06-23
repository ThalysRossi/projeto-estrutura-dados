package DataStructProject;
public class Pilha_dinamica{
	
	public No_pilha ini, fim;
	public int livre, max;
	
	public Pilha_dinamica(){
		ini = null;
		fim = null;
		livre = 0;
		max = 1000;
	}
	
	public Pilha_dinamica(int valor) {
		ini = null;
		fim = null;
		livre = 0;
		max = 1000;		
	}
	
	public int size(){
		return livre;
	}
	
	public void push(char e){
	    if (size() == 0){
	        ini = new No_pilha(e);
	        fim = ini;
	        livre++;
	    } else if((size() != 0) && (size() < max)) {
	        No_pilha newNode = new No_pilha(e, ini);
	        ini = newNode;
	        livre++;	    	
	    } else {
	    	System.out.println("Pilha Cheia!");
	    }
	}
	
    public char pop(){
    	if(size() != 0){
    		char removed = ini.info;
    		ini= ini.prox;
    		livre--;
    		return removed;
    	} else {
    		System.out.println("Pilha vazia.");
    		return 0;
    	}
    }

    public char top() {
        if ( size() != 0 ){
            return ini.info;
        } else{
            System.out.println("pilha vazia!");
            return 0;
        }
    } 
    
	public void exibe() {
		No_pilha aux = ini;
		
		System.out.print("Pilha de ponteiros => TOPO [");
		for(int i = 0; i < size(); i++) {
			System.out.print(aux.info);
			aux = aux.prox;
		}		
		System.out.println("] FUNDO");
	}
	
	public boolean underflow() {
		return size() == 0;
	}
	
	public boolean overflow() {
		return size() >= max;
	}
}
