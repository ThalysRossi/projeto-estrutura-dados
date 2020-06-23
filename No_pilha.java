package DataStructProject;
public class No_pilha {

	public char info;
	public No_pilha prox;
	
	public No_pilha(char c) {
		info = c;
		prox = null;
	}
	
	public No_pilha(char c, No_pilha n) {
		info = c;
		prox = n;
	}
}
