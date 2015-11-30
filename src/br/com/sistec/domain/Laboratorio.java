package br.com.sistec.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name ="tbl_laboratorio")
public class Laboratorio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cpo_labid")
	private Long codigo;
	
	@Column(name="cpo_labnome")
	private String nome;
	
	
	@Column(name="cpo_labdescricao")
	private String descricao;
	
	@Column(name="cpo_labsala")
	private Integer salaNumero;
	
	
	
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

	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	

}
