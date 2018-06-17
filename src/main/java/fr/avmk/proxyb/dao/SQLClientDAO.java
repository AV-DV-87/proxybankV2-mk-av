/**
 * 
 */
package fr.avmk.proxyb.dao;

/**
 * @author Arnaud
 *
 */
public class SQLClientDAO  extends AbstractDAO implements ClientDAO  {

	@Override
	public void save(Client c) {
		Connection cn = null;
		PreparedStatement st = null;
		// initialisation du result set
		try {
			cn = getConnectionDM();

			String sql = "INSERT INTO client(nom) VALUES (?)";

			st = cn.prepareStatement(sql);

			st.setString(1, c.getName());

			st.executeUpdate();
			cn.commit();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(cn, st, null);
		}
		
	}

	@Override
	public void delete(int id) {
		
		
	}

	@Override
	public Client findById(int id) {
		Connection cn = null;
		PreparedStatement st = null;
		// initialisation du result set
		ResultSet rs = null;
		Client cl = new Client();

		try {
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
			close(cn, st, rs);
		}

		return cl;
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
