package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
	public static Connection conexao() {
		try {
			String driver = "org.postgresql.Driver";
			Class.forName(driver);
			String url = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=postgres";
			Connection conn = DriverManager.getConnection(url);
			return conn;
		} catch (ClassNotFoundException e) {
			System.out.println("Driver incorreto!");
		} catch (SQLException e) {
			System.out.println("Erro : " + e.getMessage());
		}
		return null;
	}
	
	/**
	 * Realiza uma conex�o com o banco de dados MySQL.
	 */
}
