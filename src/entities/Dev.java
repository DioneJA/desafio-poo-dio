package entities;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	protected String nome;
	protected Set<Conteudo> conteudosInscritos = new LinkedHashSet<Conteudo>();
	protected Set<Conteudo> conteudosConcluidos = new LinkedHashSet<Conteudo>();

	
	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}
	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	
	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void increverBootcamp(Bootcamp bootcamp) {
		conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getInscritos().add(this);//Adicionando um dev no bootcamp
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
		Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			conteudosConcluidos.add(conteudo.get());//Adicionando aos finalizados
			conteudosInscritos.remove(conteudo.get());//retirando dos inscritos
		}else {
			System.err.println("Você não está matriculado em nenhum conteúdo! ");
		}
	}

	public double calcularTotalXp() {//Retorna a soma do xp em todos conteudos
		return conteudosConcluidos.stream().mapToDouble(conteudo-> conteudo.calcularXP()).sum();
	}
}
