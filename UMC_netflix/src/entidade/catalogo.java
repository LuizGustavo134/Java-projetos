package UMC_netflix.src.entidade;

public class catalogo {
    private String titulo;
    private String diretor;
    private String protagonista;
    private String genero;
    private int classificacao;

    public catalogo(String titulo, String diretor, String protagonista, String genero, int classificacao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.protagonista = protagonista;
        this.genero = genero;
        this.classificacao = classificacao;
        if (classificacao >= 0 && classificacao <= 5) {
            this.classificacao = classificacao;
        } else {
            this.classificacao = 0;
        }
    }

    public String getTitulo() {
        return titulo;
    }
}
