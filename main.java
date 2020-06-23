
package DataStructProject;
import java.util.Scanner;


public class main {

	public static void main (String[]args) {

		System.out.println("===================================================");
		System.out.println("QUESTÃO 01");
		System.out.println("===================================================");
				
		Data d = new Data(30,12,2019);
		Data e = new Data (02,01,2020);
		
		System.out.println("data 1 - toString(): " + d);
		System.out.println("data 2 - toString(): " + e);
		System.out.println("Diferença entre datas 1 e 2: " + d.diasEntreDatas(e));
		System.out.println("Data 1 é ano bissexto? " + d.bissexto(d.getAAAA()));
		System.out.println("Data 2 é ano bissexto? " + e.bissexto(e.getAAAA()));
		
	
		System.out.println("===================================================");
		System.out.println("QUESTÃO 02");
		System.out.println("===================================================");
		
		System.out.println("Lista_vetor");
		Lista_vetor l = new Lista_vetor();
		
		l.add(0, 1);
		l.add(1, 2);
		l.add(2, 3);
		l.add(3, 4);
		l.add(4, 5);
		
		System.out.println("Método toString: " + l);
		System.out.println("Método Média: " + l.media());
		System.out.println("Método get na posição 2: " + l.get(2));
		System.out.println("Método remove na posição 2. Valor removido: " + l.remove(2));
		System.out.println("Método toString após o remove: " + l);
		System.out.println("Método set na posição 2. Valor que sofreu alteração: " + l.set(2, 8));
		System.out.println("Método toString após o set: " + l);

		System.out.println("===================================================");
		
		System.out.println("Lista_dinamica");
		Lista_dinamica ld = new Lista_dinamica();
		
		ld.add(0, 1);
		ld.add(1, 2);
		ld.add(2, 3);
		ld.add(3, 4);
		ld.add(4, 5);
		
		System.out.println("Método toString: " + ld);
		System.out.println("Método Média: " + ld.media());
		System.out.println("Método get na posição 2: " + ld.get(2)); 		
		System.out.println("Método remove na posição 2. Valor removido: " + ld.remove(2));
		System.out.println("Método toString após o remove: " + ld);
		System.out.println("Método set na posição 2. Valor que sofreu alteração: " + ld.set(2, 8));
		System.out.println("Método toString após o set: " + ld);
		
		System.out.println("===================================================");
		System.out.println("QUESTÃO 03");
		System.out.println("===================================================");
		
		System.out.println("Pilha_vetor");
		Pilha_vetor pv = new Pilha_vetor(5);
						
		System.out.println("Underflow? " + pv.underflow());
		System.out.println("Overflow? " + pv.overflow());
				
		pv.push('P');
		pv.push('i');
		pv.push('l');
		pv.push('h');
		pv.push('a');
		pv.exibe();
		
		System.out.println("Underflow? " + pv.underflow());
		System.out.println("Overflow? " + pv.overflow());
				
		System.out.println("Topo da pilha: " + pv.top());
		pv.pop();
		System.out.println("Topo da pilha depois do pop: " + pv.top());
		pv.exibe();
		
		System.out.println("===================================================");
		
		System.out.println("Pilha_dinamica");
		Pilha_dinamica pd = new Pilha_dinamica(5);
		
		System.out.println("Underflow? " + pd.underflow());
		System.out.println("Overflow? " + pd.overflow());
		
		pd.push('P');
		pd.push('i');
		pd.push('l');
		pd.push('h');
		pd.push('a');
		pd.exibe();
		
		System.out.println("Underflow? " + pd.underflow());
		System.out.println("Overflow? " + pd.overflow());
		
		System.out.println("Topo da pilha: " + pd.top());
		
		pd.pop();
		
		System.out.println("Topo da pilha depois do pop: " + pd.top());
		pd.exibe();
		
		System.out.println("===================================================");
		
		System.out.println("Pilha LinkedList");
		Pilha_LinkedList pl = new Pilha_LinkedList(5);
		
		System.out.println("Underflow? " + pl.underFlow());
		System.out.println("Overflow? " + pl.overFlow());
		
		pl.push('P');
		pl.push('i');
		pl.push('l');
		pl.push('h');
		pl.push('a');
		System.out.println(pl);
		
		System.out.println("Underflow? " + pl.underFlow());
		System.out.println("Overflow? " + pl.overFlow());
		
		System.out.println("Topo da pilha: " + pl.top());
		
		pl.pop();
		
		System.out.println("Topo da pilha depois do pop: " + pl.top());
		System.out.println(pl);
		
		System.out.println("===================================================");
		System.out.println("QUESTÃO 04");
		System.out.println("===================================================");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pilha_vetor");
		Pilha_vetor s = new Pilha_vetor();
		
		System.out.println("Digite a espressão matemática: ");
		String exp = scan.nextLine();
		
		for(int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '(') {
				s.push(exp.charAt(i));
			}
			
		}
		System.out.println("Pilha antes do pop.");
		s.exibe();
		
		for(int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == ')') {
				if (!s.underflow()) {
					s.pop();	
				} else {
					System.out.println("A pilha está vazia. Não é possível remover nenhum elemento.");
				}
			}
		}
		System.out.println("Pilha depois do pop.");
		s.exibe();
		
		if(!s.underflow()) {
			System.out.println("Há erro na expressão.");
		}
		else {
			System.out.println("A expressão está correta.");
		}
		
		System.out.println("===================================================");
		
		System.out.println("Pilha_dinamica");
		Pilha_dinamica t = new Pilha_dinamica();
		
		System.out.println("Digite a espressão matemática: ");
		String expT = scan.nextLine();
		
		for(int i = 0; i < expT.length(); i++) {
			if (expT.charAt(i) == '(') {
				t.push(expT.charAt(i));
			}
			
		}
		System.out.println("Pilha antes do pop.");
		t.exibe();
		
		for(int i = 0; i < expT.length(); i++) {
			if (expT.charAt(i) == ')') {
				if (!t.underflow()) {
					t.pop();	
				} else {
					System.out.println("A pilha está vazia. Não é possível remover nenhum elemento.");
				}
			}
		}
		System.out.println("Pilha depois do pop.");
		t.exibe();
		
		if(!t.underflow()) {
			System.out.println("Há erro na expressão.");
		}
		
		System.out.println("===================================================");
		
		System.out.println("Pilha_LinkedList");
		Pilha_LinkedList u = new Pilha_LinkedList();
		
		System.out.println("Digite a espressão matemática: ");
		String expU = scan.nextLine();
		
		for(int i = 0; i < expU.length(); i++) {
			if (expU.charAt(i) == '(') {
				u.push(expU.charAt(i));
			}
			
		}
		System.out.println("Pilha antes do pop.");
		System.out.println(u);
		
		for(int i = 0; i < expU.length(); i++) {
			if (expU.charAt(i) == ')') {
				if (!u.underFlow()) {
					u.pop();	
				} else {
					System.out.println("A pilha está vazia. Não é possível remover nenhum elemento.");
				}
			}
		}
		System.out.println("Pilha depois do pop.");
		System.out.println(u);
		
		if(!u.underFlow()) {
			System.out.println("Há erro na expressão.");
		}
		
		System.out.println("===================================================");
		System.out.println("QUESTÃO 05");
		System.out.println("===================================================");
		
		System.out.println("Fila_LinkedList");
		Fila_LinkedList f = new Fila_LinkedList(5);
		
		System.out.println("Fila vazia? " + f.underFlow());
		System.out.println("Fila cheia? " + f.overFlow());
		
		f.entraFila(1);
		f.entraFila(2);
		f.entraFila(3);
		f.entraFila(4);
		f.entraFila(5);
		f.entraFila(6);
		
		System.out.println("Fila vazia? " + f.underFlow());
		System.out.println("Fila cheia? " + f.overFlow());
		
		System.out.println(f);
		
		f.saiFila();
		System.out.println(f);
		
	}

}
