package fr.avmk.proxyb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

import fr.avmk.proxyb.domain.Client;

public class ClientDAO extends AbstractDAO implements IClientDAO {

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
				cl.setId(rs.getInt(1));
				cl.setNom(rs.getString(2));
				cl.setPrenom(rs.getString(3));
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
	public void update(int id, String nom, String prenom, String adresse, String codep, 
			String ville, String email) {
		Connection cn = null;
		PreparedStatement st = null;
		// initialisation du result set
		ResultSet rs = null;
		Client cl = new Client();
		
		try {
			// recupération d'une connection grâce à l'abstract DAO
			// Attention penser à la fermer
			cn = getConnectionDM();

			String sql = "UPDATE CLIENT SET NOM =?, PRENOM =?, ADRESSE =?, CODEPOSTAL =?, VILLE =?, EMAIL =?, idConseiller =? WHERE id="+id;

			st = cn.prepareStatement(sql);
			
			st.setString(1, nom);
			st.setString(2, prenom);
			st.setString(3, adresse);
			st.setString(4, codep);
			st.setString(5, ville);
			st.setString(6, email);

			st.executeUpdate();

			// NE PAS OUBLIER car la connection �tablie d�sactive le
			// le commit automatique
			cn.commit();

			while (rs.next()) {
				cl.setNom(rs.getString(2));
				cl.setId(rs.getInt(1));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// fermeture de tous les outils utilisé pour la connection
			// et la requête
			close(cn, st, rs);
		}
		
		
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
				cl.setNom(rs.getString(2));
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
