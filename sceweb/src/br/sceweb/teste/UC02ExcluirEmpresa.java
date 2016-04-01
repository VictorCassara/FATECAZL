package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.servico.EmpresaDao;

public class UC02ExcluirEmpresa {
	static Empresa empresa;
	static EmpresaDao empresaDAO;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresa = new Empresa();
		empresaDAO = new EmpresaDao();
		empresa.setCnpj("OPAOPA");
	}

	@Test
	public void test() {
		assertEquals(1, empresaDAO.excluir(empresa));
	}
	
	@After
	public void tearDown() throws Exception {
	}



}
