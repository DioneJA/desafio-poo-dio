package application;

import java.time.LocalDate;

import entities.Bootcamp;
import entities.Conteudo;
import entities.Cursos;
import entities.Dev;
import entities.Mentorias;

public class Main {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		Conteudo curso1 = new Cursos("Lógica de Programação","Curso de Lógica de Programação", 55);
		Conteudo curso2 = new Cursos("Java", "Curso de JAVA", 60);
		Conteudo curso3 = new Cursos("Spring Boot", "Curso de Spring Boot", 30);
		
		Conteudo mentoria = new Mentorias("Mentoria de Java", "Java é uma...", date);
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Java Developer");
		bootcamp.setDescricao("Descrição do curso!");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(curso3);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Bruno");
		
		Dev dev2 = new Dev();
		dev2.setNome("Dione");
		
		dev1.increverBootcamp(bootcamp);
		dev2.increverBootcamp(bootcamp);
		
		System.out.print("\n\nDev1 conteudos: \n" + dev1.getConteudosInscritos());
		System.out.print("\n\nDev2 conteudos: \n"+ dev2.getConteudosInscritos());
		
		dev1.progredir();
		dev1.progredir();
		dev2.progredir();
		System.out.print("\n\nProgreção dev1: " + dev1.getConteudosConcluidos());
		System.out.print("\n\nProgreção dev2: "+ dev2.getConteudosConcluidos());
		
		System.out.println("\n\nXP DEV1: " + dev1.calcularTotalXp());
		System.out.println("\n\nXP DEV2: " + dev2.calcularTotalXp());
	}

}
