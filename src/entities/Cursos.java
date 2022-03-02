package entities;

public class Cursos extends Conteudo {
	protected Integer cargaHoraria;

	// Getters and Setters
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	// constructors
	public Cursos() {
		super();
	}

	public Cursos(String titulo, String descricao, Integer cargaHoraria) {
		super(titulo, descricao);
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "\n------- Cursos -------" + "\nTitulo: " + titulo + "\nDescricao: " + descricao + "\nCarga hóraria: "
				+ cargaHoraria;
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO * cargaHoraria;
	}

}
