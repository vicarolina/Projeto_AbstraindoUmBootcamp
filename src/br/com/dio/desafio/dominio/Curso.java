package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	
	private int cargaHoraria;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	public Curso() {
		
	}
	
	public int getCargaHoharia() {
		return cargaHoraria;
	}
	public void setCargaHoharia(int cargaHoharia) {
		this.cargaHoraria = cargaHoharia;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoharia=" + cargaHoraria + "]";
	}
	
	
	

}
