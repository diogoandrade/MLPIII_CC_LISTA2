package br.unipe.cc.mlp.ui;

import br.unipe.cc.mlp.dados.Inventario;
import br.unipe.cc.mlp.dados.ModulosInventario;
import br.unipe.cc.mlp.modelo.Item;

public class Principal {

	public static void main(String[] args) {
		Item um = new Item(1, "Motocicleta");
		Item dois = new Item(2, "Bicicleta");
		Item tres = new Item(3, "Computador");
		Item quatro = new Item(4, "Sofa");
		Item cinco = new Item(5, "TV");
		
		Inventario inventario = new ModulosInventario();
		
		if(inventario.vazia()){
			
			System.out.println("A cole��o est� vazia!");
		}
			else{
				System.out.println("A cole��o n�o est� vazia!");
			
		}
		

		
		System.out.println("Intera�ao i1:"+inventario.incluir(um));
		System.out.println("Intera�ao i2:"+inventario.incluir(dois));
		System.out.println("Intera�ao i3:"+inventario.incluir(tres));
		System.out.println("Intera�ao i4:"+inventario.incluir(quatro));
		System.out.println("Intera�ao i1:"+inventario.incluir(cinco));
		
		if(inventario.vazia()){
			
			System.out.println("A cole��o est� vazia!");
		}
			else{
				System.out.println("A cole��o n�o est� vazia!");
			
		}
		
		if(inventario.pertence(um)){
			System.out.println("o item 1 pertence a cole��o!");
			
		}else{
			System.out.println("o item 1 n�o pertence a cole��o!");
		}
		
	}

}
