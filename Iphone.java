import Interfaces.Telefone;
import Interfaces.Navegador;
import Interfaces.ReprodutorMusicial;

public class Iphone implements Telefone, Navegador, ReprodutorMusicial {
    @Override
    public void ligar(String numero) {
        System.out.println("Discando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo a pagina " +pagina);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A musica "+ musica + "foi selecionada.");
    }
}