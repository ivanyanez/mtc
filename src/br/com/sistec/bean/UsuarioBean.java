package br.com.sistec.bean;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.sistec.dao.UsuarioDAO;
import br.com.sistec.domain.Usuario;
import br.com.sistec.util.FacesUtil;


@ManagedBean
@ViewScoped
public class UsuarioBean  implements Serializable{
	
	private Usuario usuarios;
	
	
	
	
		public Usuario getUsuarios() {
		return usuarios;
	}




	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}

  

        
		public  void salvar(){
			
		
		try{	
		UsuarioDAO usuariodao = new UsuarioDAO();
		usuariodao.inserir(usuarios);
			
			FacesUtil.addMsgInfo("Fabricante Salvo com Sucesso");
		}catch(RuntimeException ex){
			FacesUtil.addMsgErro("Erro ao tentar Inserir o Usuario"+ ex.getMessage());
			
		}
		
		}
		


	
	
}
