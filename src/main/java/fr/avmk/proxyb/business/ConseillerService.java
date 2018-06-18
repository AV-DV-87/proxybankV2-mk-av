package fr.avmk.proxyb.business;

import fr.avmk.proxyb.dao.ConseillerDAO;
import fr.avmk.proxyb.domain.Conseiller;

public class ConseillerService implements IConseillerService {
	
	ConseillerDAO consdao = new ConseillerDAO();
	
	@Override
	public Conseiller findByLog(String login) {
		return consdao.findByLog(login);
	}
	
	
	
}
