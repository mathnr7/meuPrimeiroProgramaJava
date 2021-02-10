/**
 * Meu primeiro programa Java
 * 
 * Este programa mostra ao aluno:
 * 1) Que um programa Java é construído dentro de um projeto Java.
 * 2) Todo programa Java deve ter uma classe com um método main. 
 * 3) Como exibir informações do terminal (console) do Java.
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
		
		// Saldação e pergunta o nome.
		System.out.println("Olá amigo!\nQual é o seu nome?");
		
		// Ler o nome.
		Scanner in =  new Scanner(System.in);
		String nome = in.nextLine();
		
		// Saldação específica para o nome lida.
		System.out.printf("Olá %s!", nome);
		
	}

}
