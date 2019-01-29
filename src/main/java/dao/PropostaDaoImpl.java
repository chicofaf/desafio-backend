package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Proposta;


public class PropostaDaoImpl implements IPropostaDao{

	public void create(Proposta proposta) {
		Connection conn = ConexaoBanco.conexao();
		try {
			try {
				String sql = "insert into proposta(nome, cpf, idade, sexo, estado_civil, estado, dependentes, renda) values (?,?,?,?,?,?,?,?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, proposta.getNome());
				ps.setString(2, proposta.getCpf());
				ps.setInt(3, proposta.getIdade());
				ps.setString(4, proposta.getSexo());
				ps.setString(5, proposta.getEstadoCivil());
				ps.setString(6, proposta.getEstado());
				ps.setInt(7, proposta.getDependentes());
				ps.setInt(8, proposta.getRenda());
				ps.execute();
			} finally {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("Erro : " + e.getMessage());
		}

	}

	public void update(Proposta proposta) {
		Connection conn = ConexaoBanco.conexao();
		try {
			try {
				String sql = "update proposta set titulo = ?, descricao = ?, status = ? where id = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
//				ps.setString(1, proposta.getTitulo());
//				ps.setString(2, todo.getDescricao());
//				ps.setInt(3,todo.getStatus());
//				ps.setInt(4, todo.getId());
				ps.executeUpdate();
			} finally {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("Erro : " + e.getMessage());
		}
	}
	

	public ArrayList<Proposta> retrieve() {
		ArrayList<Proposta> lista = new ArrayList<Proposta>();
		Connection conn = ConexaoBanco.conexao();
		try {
			try {
				String sql = "select * from proposta";
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				while (rs.next()){
					Proposta proposta = new Proposta();
					proposta.setId(rs.getInt("id"));
					proposta.setNome(rs.getString("nome"));
					proposta.setCpf(rs.getString("cpf"));
					proposta.setSexo(rs.getString("sexo"));
					proposta.setDependentes(rs.getInt("dependentes"));
					proposta.setIdade(rs.getInt("idade"));
					proposta.setEstado(rs.getString("estado"));
					proposta.setEstadoCivil(rs.getString("estado_civil"));
					proposta.setRenda(rs.getInt("renda"));
					proposta.setResultadoAnalise(rs.getString("resultado_analise"));
					proposta.setLimite(rs.getString("limite"));
					lista.add(proposta);
				}
				return lista;
			} finally {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("Erro : " + e.getMessage());
		}
		return lista;
	}

	public void delete(Integer id) {
		Connection conn = ConexaoBanco.conexao();
		try {
			try {
				String sql = "delete from proposta where id = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, id);
				ps.executeUpdate();
			} finally {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("Erro : " + e.getMessage());
		}
	}
}
