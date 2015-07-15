package br.com.sistec.domain;

import java.sql.Date;

public class Reserva {
	
	
	
	private Laboratorio laboratorio;
	
	private Usuario usuario;
	
	private Date horario;
	
	
	

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}
	
	
	

}
