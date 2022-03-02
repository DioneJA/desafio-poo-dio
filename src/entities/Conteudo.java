package entities;

public abstract class Conteudo {// abstract, nao consegue instanciar um conteudo na classe, apenas nas herdeiras
	protected static final double XP_PADRAO = 10d;// Final para nao poder alterar o xp, static para ser acessada por
													// outras classes

	protected String titulo;
	protected String descricao;

	public abstract double calcularXP();

	// Getters and Setters
	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Conteudo() {

	}

	// Constructors
	public Conteudo(String titulo, String descricao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
	}

}
