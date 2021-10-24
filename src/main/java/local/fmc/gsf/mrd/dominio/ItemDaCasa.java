package local.fmc.gsf.mrd.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ItemDaCasa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;

	public ItemDaCasa(String nome) {
		this.nome = nome;
	}

	public ItemDaCasa() {}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
}
