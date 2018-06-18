package fr.avmk.proxyb.dao;

import java.util.List;

import fr.avmk.proxyb.domain.Client;
import fr.avmk.proxyb.domain.Compte;

public interface ICompteDao {
	public Compte findById(int id);
	public List<Compte> findAll();
	
}
