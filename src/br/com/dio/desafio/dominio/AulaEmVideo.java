package br.com.dio.desafio.dominio;

public class AulaEmVideo extends Aula {

    private int duracaoDoVideoEmMinutos;

    public AulaEmVideo(String tema, String urlDoArquivo, int duracaoDoVideoEmMinutos) {
        this.duracaoDoVideoEmMinutos = duracaoDoVideoEmMinutos;
        this.tema = tema;
        this.urlDoArquivo = urlDoArquivo;
    }

    public int getDuracaoDoVideoEmMinutos() {
        return duracaoDoVideoEmMinutos;
    }

    public void setDuracaoDoVideoEmMinutos(int duracaoDoVideoEmMinutos) {
        this.duracaoDoVideoEmMinutos = duracaoDoVideoEmMinutos;
    }

    @Override
    public String renderizarHtml() {
        return " <video width=\"320\" height=\"240\" controls>\n" +
                "  <source src=\""+getUrlDoArquivo()+"\" type=\"video/mp4\">\n" +
                "Your browser does not support the video tag.\n" +
                "</video>";
    }

    @Override
    public int estimarDuracaoDaAula() {
        return duracaoDoVideoEmMinutos;
    }
}
