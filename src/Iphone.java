import java.util.List;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone();

        iphone.ligar("11111-1111");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("A melhor");

        iphone.exibirPagina("https://github.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }

    private Musica musicaAtual;
    private List<AbaNavegador> abasNavegador;

    public Musica getMusicaAtual() {
        return musicaAtual;
    }

    public void setMusicaAtual(Musica musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    public List<AbaNavegador> getAbasNavegador() {
        return abasNavegador;
    }

    public void setAbasNavegador(List<AbaNavegador> abasNavegador) {
        this.abasNavegador = abasNavegador;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correios de voz");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando Música");
    }
}
