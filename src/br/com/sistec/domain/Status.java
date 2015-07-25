package br.com.sistec.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name ="tbl_status")
public class Status {
	
	


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cpo_staid")
	private Long codigo;;
	
	@Column(name="cpo_stanome")
	private String nome;
	
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
