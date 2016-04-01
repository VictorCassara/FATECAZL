package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.servico.EmpresaDao;

public class UC01CadastrarEmpresa {

	static EmpresaDao empresaDAO;
	static Empresa empresa;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDao();
		empresa = new Empresa();
		empresa.setCnpj("OPAOPA");
		empresa.setEndereco("OPAOPA");
		empresa.setNomeDaEmpresa("OPAOPA");
		empresa.setNomeFantasia("OPAOPA");
		empresa.setTelefone("OPAOPA");
	}

	@Test
	public void CT01UC01CadastrarEmpresaComSucesso() {
		assertEquals(1, empresaDAO.adiciona(empresa));
		empresaDAO.excluir(empresa);
	}
	
	@After
	public void tearDown() throws Exception {
		
	}

}
