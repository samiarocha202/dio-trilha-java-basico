/**
 * @author Sâmia Rocha
*/
// Classe iPhone que implementa os papéis de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementa os Métodos de Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Implementa os Métodos de Apareloho Telefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementa os Métodos de  Navegador de Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    // Método principal para testar as funcionalidades do iPhone
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        
        // Testando funções do Reprodutor Musical
        iphone.selecionarMusica("Música 1");
        iphone.tocar();
        iphone.pausar();
        
        // Testando funções do Aparelho Telefônico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        // Testando funções do Navegador na Internet
        iphone.exibirPagina("www.exemplo.com");
        iphone.adicionarNovaAba("www.novapagina.com");
        iphone.atualizarPagina();
    }
}
