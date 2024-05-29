public class Tela {
    public static void main(String[] args) {
        // Criando uma instância do iPhone
        Iphone meuIPhone = new Iphone("iPhone 13", "ABC123456");

        // Testando funcionalidades do Reprodutor Musical
        System.out.println("Testando Reprodutor Musical:");
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Shape of You");

        // Testando funcionalidades do Telefone
        System.out.println("\nTestando Telefone:");
        meuIPhone.ligar();
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando funcionalidades do Navegador
        System.out.println("\nTestando Navegador:");
        meuIPhone.exibirPagina();
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}