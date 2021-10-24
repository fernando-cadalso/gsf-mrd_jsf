package local.fmc.gsf.mrd.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import local.fmc.gsf.mrd.dominio.Dispensa;

@ManagedBean
@SessionScoped
public class DispensaBean {

	private Dispensa dispensa = new Dispensa();
	
	public void salvarDispensa() {
		
		mensagemGlobal("Item salvo");
	}
	
	public void novaDispensa() {
		
		mensagemGlobal("Nova dispensa iniciado.");
	}

	public String mensagemGlobal(String msg) {
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(msg));
		
		return null;
	}

	public Dispensa getDispensa() {
		return dispensa;
	}

	public void setDispensa(Dispensa dispensa) {
		this.dispensa = dispensa;
	}
}
