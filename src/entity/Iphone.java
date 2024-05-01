package entity;
import exception.NavegacaoException;
import exception.ReproducaoException;

public class Iphone {

  private ReprodutorMusical reprodutorMusical;
  private AparelhoTelefonico aparelhoTelefonico;
  private NavegadorInternet navegadorInternet;

  public Iphone() {
    this.reprodutorMusical = new ReprodutorMusical();
    this.aparelhoTelefonico = new AparelhoTelefonico();
    this.navegadorInternet = new NavegadorInternet();
  }

  public void reproduzirMusica() {
    try {
      reprodutorMusical.tocar();
    } catch (ReproducaoException e) {
      System.out.println("Erro ao reproduzir música: " + e.getMessage());
    }
  }

  public void pausarMusica() {
    reprodutorMusical.pausar();
  }

  public void selecionarMusica(Musica musica) {
    reprodutorMusical.selecionarMusica(musica);
  }

  public void ligar() {
    aparelhoTelefonico.ligar();
  }

  public void atenderChamada() {
    aparelhoTelefonico.atender();
  }

  public void iniciarCorreioVoz() {
    aparelhoTelefonico.iniciarCorreioVoz();
  }

  public void exibirPagina(String url) {
    try {
      navegadorInternet.exibirPagina(url);
    } catch (NavegacaoException e) {
      System.out.println("Erro ao exibir página: " + e.getMessage());
    }
  }

  public void adicionarNovaAba(String url) {
    navegadorInternet.adicionarNovaAba(url);
  }

  public void atualizarPagina() {
    navegadorInternet.atualizarPagina();
  }
}
