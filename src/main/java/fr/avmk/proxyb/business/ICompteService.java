package fr.avmk.proxyb.business;

import java.util.List;

import fr.avmk.proxyb.domain.Client;
import fr.avmk.proxyb.domain.Compte;

public interface ICompteService {

	public Compte findById(int id);

	public List<Compte> findAll();

	public List<Compte> findByProprio(int proprio);
}
