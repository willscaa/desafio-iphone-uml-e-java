public class Iphone implements IReprodutorMusical, ITelefone, INavegador {
    
    

    private ReprodutorMusical reprodutorMusical;
    private Telefone telefone;
    private Navegador navegador;

    public Iphone(String modelo, String numeroSerie) {
        
        this.reprodutorMusical = new ReprodutorMusical();
        this.telefone = new Telefone();
        this.navegador = new Navegador();
    }

    // Métodos do Reprodutor Musical
    
    public void tocar() {
        reprodutorMusical.tocar();
    }

   
    public void pausar() {
        reprodutorMusical.pausar();
    }

    
    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    // Métodos do Telefone
    
    public void ligar() {
        telefone.ligar();
    }

   
    public void atender() {
        telefone.atender();
    }

   
    public void iniciarCorreioVoz() {
        telefone.iniciarCorreioVoz();
    }

    // Métodos do Navegador
   
    public void exibirPagina() {
        navegador.exibirPagina();
    }

   
    public void adicionarNovaAba() {
        navegador.adicionarNovaAba();
    }

  
    public void atualizarPagina() {
        navegador.atualizarPagina();
    }
}