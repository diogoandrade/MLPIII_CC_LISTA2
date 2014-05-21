package br.unipe.cc.mlp.dados;

import br.unipe.cc.mlp.modelo.Item;
import junit.framework.TestCase;

public class InventarioTest extends TestCase {
	ModulosInventario inventarioTeste;
	Item itemteste;
	Item itemteste2;
	Item itemtesteNull;

	protected void setUp() throws Exception {
		inventarioTeste = new ModulosInventario();
		itemteste = new Item(0, "");
		itemteste2 = new Item(1, "");
		itemtesteNull = null;
	}

	protected void tearDown() throws Exception {
		inventarioTeste.clear();
	}

	public void testestaVazia() {
		assertTrue(inventarioTeste.vazia());
	}

	public void testnaoEstaVazia() {
		testIncluir();
		assertFalse(inventarioTeste.vazia());
	}

	public void testEstaVaziaComNulo() {
		testIncluirNulo();
		testestaVazia();
	}

	public void testIncluir() {
		assertTrue(inventarioTeste.incluir(itemteste));
	}

	public void testIncluirNulo() {
		assertFalse(inventarioTeste.incluir(null));
	}

	public void testPertence() {
		testnaoEstaVazia();
		assertTrue(inventarioTeste.pertence(itemteste));
	}

	public void testnaoPertence() {
		testnaoEstaVazia();
		assertFalse(inventarioTeste.pertence(itemteste2));
	}

	public void testnaoPertenceNulo() {
		assertFalse(inventarioTeste.pertence(itemtesteNull));
	}

}
