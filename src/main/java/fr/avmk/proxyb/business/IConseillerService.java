package fr.avmk.proxyb.business;

import fr.avmk.proxyb.domain.Conseiller;

public interface IConseillerService {
	
	public Conseiller findByLog(String login);
}
