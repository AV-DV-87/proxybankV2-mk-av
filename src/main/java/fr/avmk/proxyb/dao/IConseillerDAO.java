package fr.avmk.proxyb.dao;

import fr.avmk.proxyb.domain.Conseiller;

public interface IConseillerDAO {

	public Conseiller findByLog(String login);

}
