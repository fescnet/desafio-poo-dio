import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // incluí no sistema o conceito de aulas
        // um curso pode ter várias aulas.
        // Existem dois tipos de aula: AulaEmVideo e AulaEmPdf
        // cada aula tem uma duração em minutos
        // para AulaEmVideo a duração da aula é a duração do vídeo
        // para AulaEmPdf é estimado o tempo de leitura conforme a quantidade de páginas, esse tempo é a duração da aula
        // Agora o Curso tem um novo método: estimarCargaHoraria().  Ele calcula a carga horária do curso conforme
        // a duração estimada de cada aula.  A pessoa pode usar a estimativa calculada pelo sistema ou colocar a carga horária na mão.

        Aula aulaJava1 = new AulaEmVideo("Bem-vindo/a", "dio.me/upload/java1.mp4", 50);
        Aula aulaJava2 = new AulaEmVideo("Sintaxe", "dio.me/upload/java2.mp4", 180);
        Aula aulaJava3 = new AulaEmPdf("Resumo", "dio.me/upload/java-resumo.pdf", 15);

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.adicionarAula(aulaJava1);
        curso1.adicionarAula(aulaJava2);
        curso1.adicionarAula(aulaJava3);
        curso1.setCargaHoraria(curso1.estimarCargaHoraria());
        System.out.println("Carga horária curso de Java: " + curso1.getCargaHoraria() + "h");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        // removi um pouco dos testes para simplificar

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
    }

}
