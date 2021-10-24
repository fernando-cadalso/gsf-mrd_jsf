package local.fmc.gsf.mrd.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import local.fmc.gsf.mrd.dominio.ItemDeConsumo;

@ManagedBean
@SessionScoped
public class ItemBean {

	private ItemDeConsumo itemDeConsumo = new ItemDeConsumo();
	
	public String home() {
		
		return "home?faces-redirect=true";
	}
	
	public String formItemDeConsumo() {

		return "form-novo-item?faces-redirect=true";
	}

	
	public void salvarItem() {
		
		mensagemGlobal("Item salvo");
	}
	
	public void novoItem() {
		
		mensagemGlobal("Novo item iniciado.");
		itemDeConsumo = new ItemDeConsumo();
	}

	public ItemDeConsumo getItemDeConsumo() {
		return itemDeConsumo;
	}

	public void setItemDeConsumo(ItemDeConsumo itemDeConsumo) {
		this.itemDeConsumo = itemDeConsumo;
	}
	
	public String mensagemGlobal(String msg) {
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(msg));
		
		return null;
		
	}
}
