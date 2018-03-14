package execução;

import static org.junit.Assert.assertEquals;
import model.pais;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

public class teste {
	pais pais, copia;
	static int id = 0;

	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		pais = new Pais(id, 'Estados Unidos', '300 000 000', '9 371 175' );
		copia = new Pais(id, 'Estados Unidos', '300 000 000', '9 371 175' );
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
	}
	
	@Test
	public void test00Carregar() {
		System.out.println("carregar");
		pais fixture = new pais(1, "Brasil', '200 000 000', '8 515 767,049'" );
		pais novo = new pais(1, null, null, null);
		novo.carregar();
		assertEquals("testa inclusao", novo, fixture);
	}

	@Test
	public void test01Criar() {
		System.out.println("criar");
		paus.criar();
		id = pais.getId();
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", pais, copia);
	}

	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		pais.setPopulacao("999999");
		copia.setPopulacao("999999");		
		pais.atualizar();
		pais.carregar();
		assertEquals("testa atualizacao", pais, copia);
	}

	@Test
	public void test03Excluir() {
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setPopulacao(null);
		copia.setArea(null);
		pais.excluir();
		pais.carregar();
		assertEquals("testa exclusao", pais, copia);
	}
}

