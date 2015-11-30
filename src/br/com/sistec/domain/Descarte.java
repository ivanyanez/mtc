package br.com.sistec.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name ="tbl_descarte")
public class Descarte {
	
	

	@Id
    @Column(name="cpo_descarteid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long codigo;
	
	/*
	@OneToOne
	@JoinColumn(name="cpo_usuid")
	private Usuario usuario_id;
	*/
	
	/*
	@OneToOne
	@JoinColumn(name="eqpto_id")
	private Equipamento equipamento_id;
	*/
	
	@Column(name="descart_data")
	@Temporal(TemporalType.TIMESTAMP)
	private Date  data; 
	

	
	
	@Column(name="descart_descricao")
	private String descricao;
	
	
	
	
			

	


	public Date getData() {
		return data;
	}



	public void setData(Date date) {
		this.data = date;
	}

/*

	public Usuario getUsuario() {
		return usuario_id;
	}

*/

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	
	
}



	
	
	
