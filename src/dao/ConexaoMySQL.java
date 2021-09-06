package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {

	private static Connection conexao;
	private static String status;

	public ConexaoMySQL() {

	}

	public static void abrirConexao() {

		String serverName = "localhost";
		String database = "prova1";
		String url = "jdbc:mysql://" + serverName + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
		String userName = "bianca";
		String password = "123";

		try {
			conexao = DriverManager.getConnection(url, userName, password);

		} catch (Exception e) {
			// TODO: handle exception
		}

		if (conexao != null) {

			status = "Status---> Conectando!";
		}

		else {
			status = "Status--->Não é possível conectar!";

		}
	}
	
	public static boolean fecharConexao() {
		
		try { conexao.close();
				System.out.println("Conexão encerrada!");
				return true;
			
		} catch (SQLException e) {
			return false;
		}
	}
	
	public static void ObterStatusConexao() {
		System.out.println(status);
	}
	
	public static void main(String[] args) {
		
		ConexaoMySQL.abrirConexao();
		ConexaoMySQL.ObterStatusConexao();
	}

	public static Connection getConexao() {
		return conexao;
	}

	public static void setConexao(Connection conexao) {
		ConexaoMySQL.conexao = conexao;
	}

	public static String getStatus() {
		return status;
	}

	public static void setStatus(String status) {
		ConexaoMySQL.status = status;
	}
}