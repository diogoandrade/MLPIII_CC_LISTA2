package br.unipe.cc.mlp.dados;

import java.util.Collection;
import java.util.TreeSet;

import br.unipe.cc.mlp.modelo.Item;

public class ModulosInventario implements Inventario{

	private Collection<Item> itens;

	public ModulosInventario() {
		this.itens = new TreeSet<>();
	}

	@Override
	public boolean incluir(Item i) {
			return itens.add(i);
	}

	@Override
	public boolean estaVazia() {
		return itens.isEmpty();
	}

	//@Override
	public boolean pertence(Item i) {
		return itens.contains(i);
	}

	//@Override
	public void limpa() {
		itens.clear();
	}

}
