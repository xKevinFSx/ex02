package test;

import static org.junit.Assert.assertEquals;
import model.Pais;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import service.PaisService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisTest {
	Pais pais, copia;
	PaisService paisService;
	static int id = 0;

	@Before
		public void setUp() throws Exception {
		System.out.println("setup");
		pais = new Pais();
		pais.setId(id);
		pais.setNome("Argentina");
		pais.setPopulacao(450);
		pais.setArea(8736196);
		copia = new Pais();
		pais.setId(id);
		pais.setNome("Argentina");
		pais.setPopulacao(450);
		pais.setArea(8736196);
		paisService = new PaisService();
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
		}

	@Test
	public void test00Carregar() {
		System.out.println("carregar");
		Pais fixture = new Pais();
		fixture.setNome("Russia");
		fixture.setPopulacao(470);
		fixture.setArea(8515857);
		PaisService novoService = new PaisService();
		Pais novo = novoService.carregar(1);
		assertEquals("inclusao", novo, fixture);
	}

	@Test
	public void test01Criar() {
		System.out.println("criar");
		id = paisService.criar(pais);
		System.out.println(id);
		copia.setId(id);
		assertEquals("criacao", pais, copia);
	}

	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		pais.setPopulacao(666666);
		copia.setPopulacao(666666);
		paisService.atualizar(pais);
		pais = paisService.carregar(pais.getId());
		assertEquals("testa atualizacao", pais, copia);
	}

	@Test
	public void test03Excluir() {
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setPopulacao((Long) null);
		copia.setArea((Double) null);
		paisService.excluir(id);
		pais = paisService.carregar(id);
		assertEquals("exclusao", pais, copia);
	}
}

