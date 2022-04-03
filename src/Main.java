import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;
public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descriçao do cruso.");
		curso1.setCargaHoharia(8);
		
		Curso curso2= new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descriçao do curso.");
		curso2.setCargaHoharia(10);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição Mentoria.");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devVitoria = new Dev();
		devVitoria.setNome("Vitória");
		devVitoria.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Vitória:" + devVitoria.getConteudosInscritos());
		devVitoria.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos Vitória:" + devVitoria.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Vitória:" + devVitoria.getConteudosConcluidos());
		System.out.println("XP:" + devVitoria.calcularTotalXp());
		
		System.out.println("--------------");
		
		Dev devGustavo = new Dev();
		devGustavo.setNome("Gustavo");
		devGustavo.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Gustavo:" + devGustavo.getConteudosInscritos());
		devGustavo.progredir();
		devGustavo.progredir();
		devGustavo.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos Gustavo:" + devGustavo.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Gustavo:" + devGustavo.getConteudosConcluidos());
		System.out.println("XP:" + devGustavo.calcularTotalXp());
		
	}

}