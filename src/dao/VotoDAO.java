package dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	import javax.swing.JOptionPane;

	import modelo.Voto;

	public class VotoDAO {

		private Connection con;

		public VotoDAO() {

		}

		public boolean cadastrarVoto(Voto v) {
		ConexaoMySQL.abrirConexao();
			con = ConexaoMySQL.getConexao();

			if (con != null) {
				String sql = "insert into Voto (voto) values (?)";

				PreparedStatement prepS;
				try {
					prepS = con.prepareStatement(sql);
					prepS.setString(1, v.getVoto());

					int res = prepS.executeUpdate();

					if (res == 1) {
						ConexaoMySQL.fecharConexao();
						return true;
					} else {
						ConexaoMySQL.fecharConexao();
						return false;
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return false;
		}
	}