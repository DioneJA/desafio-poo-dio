package entities;

import java.time.LocalDate;

public class Mentorias extends Conteudo {
	protected LocalDate date;

	// Getters and Setters
	public LocalDate getDate() {
		return date;
	}

	// Constructors
	public Mentorias() {
		super();
	}

	public Mentorias(String titulo, String descricao, LocalDate date) {
		super(titulo, descricao);
		this.date = date;
	}

	@Override
	public String toString() {
		return "------- Mentorias -------" + "\nTitulo: " + titulo + "\nDescricao: " + descricao + "\nData: " + date;
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}

}
