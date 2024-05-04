package br.com.dio.desafio.dominio;

public abstract class Aula {
    protected String tema;
    protected String urlDoArquivo; // arquivo mp4 ou pdf com a aula

    public String getUrlDoArquivo() {
        return urlDoArquivo;
    }

    public void setUrlDoArquivo(String urlDoArquivo) {
        this.urlDoArquivo = urlDoArquivo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    // imagino que nao seja uma boa pratica retornar html em uma classe,
    // fiz assim so para aplicar os pilares de POO

    /**
     * Retorna a tag html para exibicao do contaudo da aula
     * @return String tag html conforme tipo de aula
     */
    public abstract String renderizarHtml();

    /**
     * Estimar a duracao da aula em minutos
     * @return int minutos estimados
     */
    public abstract int estimarDuracaoDaAula();
}
