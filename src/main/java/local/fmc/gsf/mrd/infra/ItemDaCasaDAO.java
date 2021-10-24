package local.fmc.gsf.mrd.infra;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ItemDaCasaDAO {

	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	void daoCarregado() {
		System.out.println("[INFO] DAO para item da casa foi carregado.");
	}
}
