package br.com.caelum.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.caelum.modelo.Contato;

public class ContatoDAO {
	public void inserirContato(Contato contato) {
		Connection con = new ConnectionFactory().getConnection();
		String sql = "Insert into contatos (nome,email,endereco,dataNascimento) values (?,?,?,?)";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, contato.getNome());
			stm.setString(2, contato.getEmail());
			stm.setString(3, contato.getEndereco());
			stm.setDate(4, new java.sql.Date(contato.getDataNascimento().getTimeInMillis()));

			// executa
			stm.execute();
			stm.close();
			con.close();
			System.out.println("Salvou");
		} catch (Exception e) {
			System.out.println("Não Salvou");
		}
	}
}
