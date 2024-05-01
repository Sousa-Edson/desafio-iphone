classDiagram
    class iPhone {
        - reprodutorMusical: ReprodutorMusical
        - aparelhoTelefonico: AparelhoTelefonico
        - navegadorInternet: NavegadorInternet
        --
        + tocarMusica()
        + pausarMusica()
        + selecionarMusica(musica: Musica)
        + ligar()
        + atenderChamada()
        + iniciarCorreioVoz()
        + exibirPagina(url: String)
        + adicionarNovaAba(url: String)
        + atualizarPagina()
    }
    interface ReprodutorMusical {
        + tocar()
        + pausar()
        + selecionarMusica(musica: Musica)
    }
    interface AparelhoTelefonico {
        + ligar()
        + atender()
        + iniciarCorreioVoz()
    }
    interface NavegadorInternet {
        + exibirPagina(url: String)
        + adicionarNovaAba(url: String)
        + atualizarPagina()
    }
    class Musica {
        - titulo: String
        - artista: String
        - duracao: int
        --
        + getTitulo(): String
        + getArtista(): String
        + getDuracao(): int
    }
