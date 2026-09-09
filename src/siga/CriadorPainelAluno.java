package siga;

public class CriadorPainelAluno extends CriadorPainel {
    @Override
    protected Painel criarPainel() {
        return new PainelAluno();
    }
}