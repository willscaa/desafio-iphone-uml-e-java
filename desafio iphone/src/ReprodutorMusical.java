public class ReprodutorMusical implements IReprodutorMusical {

    
    public void tocar() {
        System.out.println("Tocando música...");
    }

   
    public void pausar() {
        System.out.println("Música pausada.");
    }

    
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
}