package br.sceweb.servico;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.sceweb.modelo.Empresa;

public class EmpresaDao {

	public int adiciona(Empresa empresa) {
		PreparedStatement ps;
		int codigoRetorno = 0;
		try {
			Connection conn = new FabricaDeConexoes().getConnection();
			ps = conn.prepareStatement(
					"INSERT INTO sceweb.empresa (cnpj, nomeDaEmpresa, nomeFantasia, endereco, telefone) VALUES (?, ?, ? ,?, ?)");
			ps.setString(1, empresa.getCnpj());
			ps.setString(2, empresa.getNomeDaEmpresa());
			ps.setString(3, empresa.getNomeFantasia());
			ps.setString(4, empresa.getEndereco());
			ps.setString(5, empresa.getTelefone());

			codigoRetorno = ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return codigoRetorno;
	}
	
	public int excluir(Empresa empresa) {
		PreparedStatement ps;
		int codigoRetorno = 0;
		try {
			Connection conn = new FabricaDeConexoes().getConnection();
			ps = conn.prepareStatement(
					"DELETE FROM sceweb.empresa WHERE cnpj = ?");
			ps.setString(1, empresa.getCnpj());
			codigoRetorno = ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return codigoRetorno;
	}

	public Empresa consultaEmpresa(String cnpj) {
		// TODO Auto-generated method stub
		return null;
	}

}
