package entities;

import java.time.LocalDate;

public class Mentorias {
	protected String titulo;
	protected String descricao;
	protected LocalDate date;

	// Getters and Setters
	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDate getDate() {
		return date;
	}

	// Constructors
	public Mentorias() {

	}

	public Mentorias(String titulo, String descricao, LocalDate date) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Mentorias [titulo=" + titulo + ", descricao=" + descricao + ", date=" + date + "]";
	}

}
