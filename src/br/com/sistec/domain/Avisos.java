package br.com.sistec.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_avisos")
public class Avisos {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cpo_aviid")
	private long codigo;
	
	
	@Column(name="cpo_usuid")
	private Usuario usuario;
	
	@OneToOne
	@Column(name="eqpto_id")
	private Equipamento equipamento;
	
	private Date data;
	
	

}
