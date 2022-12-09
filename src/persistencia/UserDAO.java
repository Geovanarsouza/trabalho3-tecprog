package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import negocio.User;

public class UserDAO {
	
	public void inserir(User a) {
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement inserir =
					 conexao.prepareStatement("insert into aposta (nome, s1QF, ps1QF, s2QF, ps2QF, s3QF, ps3QF,"
					 		+ "s4QF, ps4QF, s5QF, ps5QF, s6QF, ps6QF, s7QF, ps7QF, s8QF, ps8QF, s1SF,"
					 		+ "p1SF, s2SF, p2SF, s3SF, p3SF,s4SF, p4SF, s1F, p1F, s2F, psF, sCAMP) "
					 		+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
					 		+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			inserir.setString(1, a.getName());
			inserir.setString(2, a.getS1Qf().getName());
			inserir.setInt(3, a.getS1Qf().getScoreboard());
			inserir.setString(4, a.getS2Qf().getName());
			inserir.setInt(5, a.getS2Qf().getScoreboard());
			inserir.setString(6, a.getS3Qf().getName() );
			inserir.setInt(7, a.getS3Qf().getScoreboard());
			inserir.setString(8, a.getS4Qf().getName());
			inserir.setInt(9, a.getS4Qf().getScoreboard());
			inserir.setString(10, a.getS5Qf().getName());
			inserir.setInt(11, a.getS5Qf().getScoreboard());
			inserir.setString(12, a.getS6Qf().getName());
			inserir.setInt(13, a.getS6Qf().getScoreboard());
			inserir.setString(14, a.getS7Qf().getName());
			inserir.setInt(15, a.getS7Qf().getScoreboard());
			inserir.setString(16, a.getS8Qf().getName());
			inserir.setInt(17, a.getS8Qf().getScoreboard());
			inserir.setString(18, a.getS1Sf().getName());
			inserir.setInt(19, a.getS1Sf().getScoreboard());
			inserir.setString(20, a.getS2Sf().getName());
			inserir.setInt(21, a.getS2Sf().getScoreboard());
			inserir.setString(22, a.getS3Sf().getName());
			inserir.setInt(23, a.getS3Sf().getScoreboard());
			inserir.setString(24, a.getS4Sf().getName());
			inserir.setInt(25, a.getS4Sf().getScoreboard());
			inserir.setString(26, a.getS1F().getName());
			inserir.setInt(27, a.getS1F().getScoreboard());
			inserir.setString(28, a.getS2F().getName());
			inserir.setInt(29, a.getS2F().getScoreboard());
			inserir.setString(30, a.getS1G().getName());
			inserir.executeUpdate();
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<User> listar() {
		ArrayList<User> aux = new ArrayList<User>();
		try {
			Connection conexao = new Conexao().getConexao();

			ResultSet resultado = conexao.prepareStatement("select * from aposta").executeQuery();

			User user;
			while (resultado.next()){
				
				user = new User();
				
				user.setName(resultado.getString("nome"));
				user.getS1Qf().setName(resultado.getString("s1QF"));
				user.getS1Qf().setScoreboard(resultado.getInt("ps1QF"));
				
				user.getS2Qf().setName(resultado.getString("s2QF"));
				user.getS2Qf().setScoreboard(resultado.getInt("ps2QF"));
//				
				user.getS3Qf().setName(resultado.getString("s3QF"));
				user.getS3Qf().setScoreboard(resultado.getInt("ps3QF"));
				
				user.getS4Qf().setName(resultado.getString("s4QF"));
				user.getS4Qf().setScoreboard(resultado.getInt("ps4QF"));
				
				user.getS5Qf().setName(resultado.getString("s5QF"));
				user.getS5Qf().setScoreboard(resultado.getInt("ps5QF"));
				
				user.getS6Qf().setName(resultado.getString("s6QF"));
				user.getS6Qf().setScoreboard(resultado.getInt("ps6QF"));
				
				user.getS7Qf().setName(resultado.getString("s7QF"));
				user.getS7Qf().setScoreboard(resultado.getInt("ps7QF"));
				
				user.getS8Qf().setName(resultado.getString("s8QF"));
				user.getS8Qf().setScoreboard(resultado.getInt("ps8QF"));
				
				user.getS1Sf().setName(resultado.getString("s1SF"));
				user.getS1Sf().setScoreboard(resultado.getInt("p1SF"));
				
				user.getS2Sf().setName(resultado.getString("s2SF"));
				user.getS2Sf().setScoreboard(resultado.getInt("p2SF"));
				
				user.getS3Sf().setName(resultado.getString("s3SF"));
				user.getS3Sf().setScoreboard(resultado.getInt("p3SF"));
//				
				user.getS4Sf().setName(resultado.getString("s4SF"));
				user.getS4Sf().setScoreboard(resultado.getInt("p4SF"));
				
				user.getS1F().setName(resultado.getString("s1F"));
				user.getS1F().setScoreboard(resultado.getInt("p1F"));
				
				user.getS2F().setName(resultado.getString("s2F"));
				user.getS2F().setScoreboard(resultado.getInt("psF"));
				
				user.getS1G().setName(resultado.getString("sCAMP"));
				
				aux.add(user);
			}
			conexao.close();
		} catch (Exception e) {

		}
		return aux;
	}
}
