package br.com.sistec.domain;

import java.sql.Date;

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
@Table(name="tbl_equipamento")
public class Equipamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "eqpto_id")
	private Long codigo;
	
	@OneToOne
	@JoinColumn(name="cpo_staid")
	private Status status_id;
	
	@OneToOne
	@JoinColumn(name="cpo_tipid")
	private Tipo tipo_id;
	
	@Column(name = "eqpto_nome", length = 40, nullable = false)
	private String nome;

	@Column(name = "eqpto_tipo", length = 40, nullable = false)
	private String tipo;
	
	
	@Column(name="eqpto_lastcheck")
	@Temporal(TemporalType.DATE)
	private Date lastcheck;
	
	@Column(name="eqpto_nextcheck")
	@Temporal(TemporalType.DATE)
	private Date nextchek;
	
	

	
	@Column(name="eqpto_descricao", length = 40, nullable = false)
	private String descricao;

	
	
	
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getLastcheck() {
		return lastcheck;
	}

	public void setLastcheck(Date lastcheck) {
		this.lastcheck = lastcheck;
	}

	public Date getNextchek() {
		return nextchek;
	}

	public void setNextchek(Date nextchek) {
		this.nextchek = nextchek;
	}

	public Status getStatus() {
		return status_id;
	}

	public Status getStatus_id() {
		return status_id;
	}

	public void setStatus_id(Status status_id) {
		this.status_id = status_id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
