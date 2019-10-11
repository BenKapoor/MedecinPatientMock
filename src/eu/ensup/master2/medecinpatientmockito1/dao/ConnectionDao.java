package eu.ensup.master2.medecinpatientmockito1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDao {

	private static Connection connect = null;

	private static Statement statement = null;

	public static void closeConnection() {
		try {
			ConnectionDao.connect.close();
			ConnectionDao.statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Statement getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				ConnectionDao.connect = DriverManager
						.getConnection("jdbc:mysql://localhost/projetconsultation?user=root&password=");
				ConnectionDao.statement = ConnectionDao.connect.createStatement();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Erreur 1" + e);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Erreur 2");
		}

		return ConnectionDao.statement;
	}

}
