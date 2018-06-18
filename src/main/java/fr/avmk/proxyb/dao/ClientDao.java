package fr.avmk.proxyb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

import fr.avmk.proxyb.domain.Client;

public class ClientDao extends AbstractDAO implements IClientDao {

	@Override
	public List<Client> findAllClient() {
		// nouvelle liste pour r�sultats
		List<Client> results = new ArrayList<>();
		Connection cn = null;
		PreparedStatement st = null;
		// initialisation du result set
		ResultSet rs = null;

		try {
			cn = getConnectionDM();

			String sql = "SELECT * FROM client";

			st = cn.prepareStatement(sql);

			rs = st.executeQuery();

			// NE PAS OUBLIER car la connection �tablie d�sactive le
			// le commit automatique
			cn.commit();

			while (rs.next()) {
				Client cl = new Client();
				cl.setName(rs.getString(2));
				cl.setId(rs.getInt(1));
				results.add(cl);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			close(cn, st, rs);
		}

		return results;
	}

	@Override
	public void update(Client c) {
		Connection cn = null;
		PreparedStatement st = null;
		// initialisation du result set
		ResultSet rs = null;
		Client cl = new Client();

	}

	@Override
	public Client findById(int id) {
		Connection cn = null;
		PreparedStatement st = null;
		// initialisation du result set
		ResultSet rs = null;
		Client cl = new Client();

		try {
			// recupération d'une connection grâce à l'abstract DAO
			// Attention penser à la fermer
			cn = getConnectionDM();

			String sql = "SELECT * FROM client WHERE id =" + id;

			st = cn.prepareStatement(sql);

			rs = st.executeQuery();

			// NE PAS OUBLIER car la connection �tablie d�sactive le
			// le commit automatique
			cn.commit();

			while (rs.next()) {
				cl.setName(rs.getString(2));
				cl.setId(rs.getInt(1));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// fermeture de tous les outils utilisé pour la connection
			// et la requête
			close(cn, st, rs);
		}

		return cl;
	}

}
