package siga;

public class CriadorPainelProfessor extends CriadorPainel {
    @Override
    protected Painel criarPainel() {
        return new PainelProfessor();
    }
}