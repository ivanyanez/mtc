package br.com.sistec.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_usuario")
public class Equipamento {
	
	@Id
	
	private Long codigo;
	
	private String nome;

	private String tipo;
	
	private Date lastcheck;
	
	private Date nextchek;
	
	private String status;
	
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
