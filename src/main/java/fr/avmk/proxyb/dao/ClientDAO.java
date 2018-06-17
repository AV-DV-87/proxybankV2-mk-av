package fr.avmk.proxyb.dao;

public interface ClientDAO {
	public void save(Client c);

	public void delete(int id);

	public Client findById(int id);

	public List<Client> findAll();
}
