
package fr.avmk.proxyb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.avmk.proxyb.domain.Compte;

public class CompteDao extends AbstractDAO implements ICompteDao {

	@Override
	public Compte findById(int id) {
		Connection cn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		Compte compte=new Compte();
		try {
			cn=getConnectionDM();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		String sql = "SELECT * FROM `compte` WHERE id=?";
		
		try {
			pst=cn.prepareStatement(sql);
			pst.setInt(1, id);
			rs=pst.executeQuery();
		}catch (SQLException e) {
			e.printStackTrace();
		
		}
		try {
			if (rs.next()) {
				compte.setId(rs.getInt("id"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			cn.commit();
		}catch (SQLException e) {
			try {
				cn.rollback();
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		close(cn, pst, rs);
		return compte;
	}

	@Override
	public List<Compte> findAll() {
		Connection cn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		List<Compte> comptes=new ArrayList<Compte>();
		Compte compte=new Compte();
		try {
			cn=getConnectionDM ();
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}
		String sql="SELECT * FROM `compte`";
		try {
			pst=cn.prepareStatement(sql);
			rs=pst.executeQuery();
		}catch (SQLException  e) {
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				compte.setId(rs.getInt("id"));
				comptes.add(compte);
				compte=new Compte();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			cn.commit();
		} catch (SQLException e) {
			try {
				cn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		close(cn,pst,rs);
		
		
		return comptes;
	}

}