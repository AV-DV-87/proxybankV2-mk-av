/**
 * 
 */
package fr.avmk.proxyb.business;

import java.util.List;

import fr.avmk.proxyb.dao.ClientDAO;
import fr.avmk.proxyb.domain.Client;

/**
 * La couche service qui regroupe les méthodes concernant les clients
 * @author Arnaud
 *
 */
public class ClientService implements IClientService {
	
	//instanciation d'un DAO client
	ClientDAO clidao = new ClientDAO();
	
	@Override
	public List<Client> findAllClient() {
		
		return clidao.findAllClient();
	}

	@Override
	public Client findById(int id) {
		// TODO Auto-generated method stub
		return clidao.findById(id);
	}

}
