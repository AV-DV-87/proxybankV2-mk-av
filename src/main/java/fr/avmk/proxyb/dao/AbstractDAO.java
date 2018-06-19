/**
 * 
 */
package fr.avmk.proxyb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Arnaud
 *
 */
public abstract class AbstractDAO {
	/**
	 * Méthode permettant de fermer une connection à la BDD mysql
	 * 
	 * @param cn
	 * @param st
	 * @param rs
	 */
	protected void close(Connection cn, PreparedStatement st, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
		}
		try {
			if (st != null)
				st.close();
		} catch (SQLException e) {
		}
		try {
			if (cn != null)
				cn.close();
		} catch (SQLException e) {
		}
	}

	protected Connection getConnectionDM() throws ClassNotFoundException, SQLException {
		Connection cn;
		// établir la connexion
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/proxyb";
		String username = "root";
		String password = "";

		cn = DriverManager.getConnection(url, username, password);
		cn.setAutoCommit(false);
		return cn;
	}
}
