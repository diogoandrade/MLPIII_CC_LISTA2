package br.unipe.mlp.ui;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestePerformance {
	public static void main(String[] args) {
		long tempoInicioTree = System.currentTimeMillis();  
		
		Set<String> lista1 = new TreeSet<>();
		
		for (int i = 0; i < 100000; i++) {
			lista1.add("Teste");
			
		}
		System.out.println("Tempo Total Tree: "+(System.currentTimeMillis()-tempoInicioTree));  
		
		
long tempoInicioLinked = System.currentTimeMillis();  
		
		Set<String> lista2 = new LinkedHashSet<>();
		
		for (int i = 0; i < 100000; i++) {
			lista2.add("Teste");
		}
		
		
		System.out.println("Tempo Total Linked: "+(System.currentTimeMillis()-tempoInicioLinked));  
		  
	}
}