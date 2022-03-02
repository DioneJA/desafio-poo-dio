package entities;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
	protected String nome;
	protected Set<Conteudo> conteudosInscritos = new LinkedHashSet<Conteudo>();
	protected Set<Conteudo> conteudosConcluidos = new LinkedHashSet<Conteudo>();

	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos);
	}

	public void inscreverBootcamp(Bootcamp bootcamp) {
	}

	public void progredir() {

	}

	public void calcularTotalXp() {

	}
}
