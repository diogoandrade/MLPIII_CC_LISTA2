package br.unipe.cc.mlp.dados;

import java.util.Set;
import java.util.TreeSet;

import br.unipe.cc.mlp.modelo.Item;

public class ModulosInventario implements Inventario {

	private Set<Item> itens;

	public ModulosInventario() {
		this.itens = new TreeSet<>();
	}

	@Override
	public boolean incluir(Item i) {
		if (i != null)
			return itens.add(i);
		return false;
	}

	@Override
	public boolean vazia() {

		return itens.isEmpty();
	}

	@Override
	public boolean pertence(Item i) {
		if (i != null)
			return itens.contains(i);
		return false;
	}

	@Override
	public void clear() {
		itens.clear();

	}

	@Override
	public String toString() {
		return itens.toString();
	}

}
