package br.com.dio.desafio.dominio;

public class AulaEmPdf extends Aula {

    private int numeroDePaginas;
    private static final int MINUTOS_PARA_LER_UMA_PAGINA = 5;

    public AulaEmPdf(String tema, String urlDoArquivo, int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
        this.tema = tema;
        this.urlDoArquivo = urlDoArquivo;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String renderizarHtml() {
        return "<embed src=\""+getUrlDoArquivo()+"\" width=\"800px\" height=\"2100px\" />";
    }

    @Override
    public int estimarDuracaoDaAula() {
        return numeroDePaginas * MINUTOS_PARA_LER_UMA_PAGINA;
    }
}
