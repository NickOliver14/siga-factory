package siga;

/**
 * Produto concreto: painel inicial exibido para o perfil PROFESSOR.
 * (Código inicial da atividade — esta classe está pronta.)
 */
public class PainelSecretaria implements Painel {

    @Override
    public void montar() {
        System.out.println("=== Painel do Secretária ===");
        System.out.println("- Meus Documentos");
        System.out.println("- Pagamento de contas");
        System.out.println("- Atendimento");
    }
}
