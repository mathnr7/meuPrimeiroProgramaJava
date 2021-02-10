/**
 * Meu primeiro programa Java
 * 
 * Este programa mostra ao aluno:
 * 1) Que um programa Java � constru�do dentro de um projeto Java.
 * 2) Todo programa Java deve ter uma classe com um m�todo main. 
 * 3) Como exibir informa��es do terminal (console) do Java.
 * 4) Como ler uma string do terminal (console) do Java.
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author Mathn 
 * Data: 03/02/2021
 */
public class Principal { 
	public static void main(String[] args) { 
		
		// Salda��o e pergunta o nome.
		System.out.println("Ol� amigo!\nQual � o seu nome?");
		
		// Ler o nome.
		Scanner in =  new Scanner(System.in);
		String nome = in.nextLine();
		
		// Salda��o espec�fica.
		System.out.printf("Ol� %s!", nome);
		
	}

}
