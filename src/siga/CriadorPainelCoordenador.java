package siga;

public class CriadorPainelCoordenador extends CriadorPainel {
    @Override
    protected Painel criarPainel() {
        return new PainelCoordenador();
    }
}