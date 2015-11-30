package br.com.sistec.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="tbl_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cpo_usuid")
	private Long codigo;

	@Column(name = "cpo_usuusuario", length = 40, nullable = false)
	private String usuario;

	/*@OneToOne
	@JoinColumn(name="cpo_cargoid")
	private Cargo cargo_id;*/
	
	@Column(name = "cpo_ususenha", length = 10, nullable = false , insertable = true , updatable=true)
	private String senha;

	@Column(name = "cpo_lastname" , length = 100 , nullable = false, insertable = true , updatable=true)
	private String lastname;
	
	@Column(name = "cpo_email" , length = 30 , nullable = false, insertable = true , updatable=true)
	private String email;
	
	@Column(name = "cpo_telefone" ,length = 30 ,nullable = false, insertable = true , updatable=true)
	private Integer telefone;
	
	@Column(name = "cpo_ra"  ,length = 30 ,nullable = false, insertable = true , updatable=true)
	private String ra;
	
	@Column(name = "cpo_tipousuario"  ,length = 30 ,nullable = false, insertable = true , updatable=true)
     private String tipousuario;
	
	

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getLastname() {
		return lastname;
	}


	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getTipousuario() {
		return tipousuario;
	}

	public void setTipousuario(String tipousuario) {
		this.tipousuario = tipousuario;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
		
		
	}



}
