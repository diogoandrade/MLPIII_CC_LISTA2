package br.unipe.cc.mlp.dados;

import br.unipe.cc.mlp.modelo.Item;

public interface Inventario {
	boolean incluir(Item i);
	boolean vazia();
	boolean pertence(Item i);
	void clear();
	
}
