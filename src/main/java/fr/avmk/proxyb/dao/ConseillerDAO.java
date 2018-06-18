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
			//creer une connexion  à la BDD
			cn = getConnectionDM();
			
			//creation d'une requete
			String sql = "SELECT * FROM conseiller WHERE login ='"+ login+"'";
			
			st = cn.prepareStatement(sql);
			
			//execute la requete stocke le dans un result set
			rs = st.executeQuery();

			//commit manuel car commit auto desactivé
			cn.commit();

			while (rs.next()) {
				csl.setLogin(rs.getString(2));
				csl.setPassword(rs.getString(3));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			close(cn, st, rs);
		}
		//si tout c'est bien passé retourne le conseiller
		return csl;
	}
	
}
