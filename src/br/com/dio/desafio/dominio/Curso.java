package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    private Set<Aula> aulas = new LinkedHashSet<>();

    public Curso() {
        this.aulas = new LinkedHashSet<>();
    }

    public void adicionarAula(Aula aula){
        aulas.add(aula);
    }

    /**
     * Estima a carga horaria com base nas aulas cadastradas no curso
     * @return int numero de horas arredondado para o int mais proximo
     */
    public int estimarCargaHoraria(){
         List<Integer> minutosDeCadaAula = aulas.stream().map(Aula::estimarDuracaoDaAula).collect(Collectors.toList());
         int totalEmMinutos = minutosDeCadaAula.stream().reduce(0, Integer::sum);
        return Math.round(totalEmMinutos / 60);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
