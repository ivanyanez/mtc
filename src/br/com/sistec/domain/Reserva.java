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



@Entity
@Table(name ="tbl_reserva")
public class Reserva {
	
		

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cpo_reservaid")
	private Long codigo;
	
	@OneToOne
	@JoinColumn(name="cpo_labid")
	private Laboratorio laboratorio_id;
	
	@OneToOne
	@JoinColumn(name="cpo_usuid")
	private Usuario usuario_id;
	
	private Date horario;
	
	
	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Laboratorio getLaboratorio_id() {
		return laboratorio_id;
	}

	public void setLaboratorio_id(Laboratorio laboratorio_id) {
		this.laboratorio_id = laboratorio_id;
	}

	public Usuario getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Usuario usuario_id) {
		this.usuario_id = usuario_id;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}
	
	
	

	
	
	

}
