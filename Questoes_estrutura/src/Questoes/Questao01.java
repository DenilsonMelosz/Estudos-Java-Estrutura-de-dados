package Questoes;

import java.util.Stack;

public class Questao01 {

	public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        	pilha.push(1);
	        pilha.push(2);
	        pilha.push(3);
	        pilha.push(4);

	        // Estamos mostrando na tela as pilhas na sequencia inicial 
	        System.out.println("Pilha antes das operacoes: " + pilha);
		
	       pilha.pop();
	       pilha.pop();
	       pilha.pop();
	       pilha.push(3);
	       pilha.push(4);
	       pilha.push(2);

		// A pilha foi reformulada da maneira que foi solicitada. retirando e adicionando novamente 3 componentes
	       System.out.println("Pilha apos as operacoes: " + pilha);
	}

}
