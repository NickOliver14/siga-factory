package siga;

public abstract class CriadorPainel {

    // O "factory method" — cada subclasse decide o que criar
    protected abstract Painel criarPainel();

    // Método que USA o factory method, sem conhecer a classe concreta
    public void processar() {
        Painel painel = criarPainel();
        painel.montar();
    }
}