package entities;

public class Cursos {
	protected String titulo;
	protected String descricao;
	protected Integer cargaHoraria;

	// Getters and Setters
	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	// constructors
	public Cursos() {

	}

	public Cursos(String titulo, String descricao, Integer cargaHoraria) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Cursos [titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
	}

}
