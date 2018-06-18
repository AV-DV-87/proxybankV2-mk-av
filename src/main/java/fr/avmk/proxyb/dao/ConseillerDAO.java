/**
 * 
 */
package fr.avmk.proxyb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.avmk.proxyb.domain.Conseiller;

/**
 * @author Arnaud
 *
 */
public class ConseillerDAO extends AbstractDAO implements IConseillerDAO {
	
	@Override
	public Conseiller findByLog(String login) {
		Connection cn = null;
		PreparedStatement st = null;
		// initialisation du result set
		ResultSet rs = null;
		Conseiller csl = new Conseiller();

		try {
			cn = getConnectionDM();

			String sql = "SELECT * FROM client WHERE login =" + login;

			st = cn.prepareStatement(sql);

			rs = st.executeQuery();

			// NE PAS OUBLIER car la connection �tablie d�sactive le
			// le commit automatique
			cn.commit();

			while (rs.next()) {
				csl.setLogin(rs.getString(2));
				csl.setPassword(rs.getString(1));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			close(cn, st, rs);
		}

		return csl;
	}
	
}
