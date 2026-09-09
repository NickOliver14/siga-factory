package siga;

public class CriadorPainelSecretaria extends CriadorPainel {
    @Override
    protected Painel criarPainel() {
        return new PainelSecretaria();
    }
}