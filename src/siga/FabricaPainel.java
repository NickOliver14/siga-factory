package siga;
// Utilização do simple factory para impedir o acomplamento da classe
// GerenciadorLogin com o uso do método criar que reconhece o tipo de usuário
// E retorna a instancia do tipo específico

public class FabricaPainel {

    public Painel criar(String tipoUsuario) {
        switch (tipoUsuario) {
            case "ALUNO":  return new PainelAluno();
            case "PROFESSOR": return new PainelProfessor();
            case "COORDENADOR":  return new PainelCoordenador();
            default:
                throw new IllegalArgumentException("Perfil desconhecido: " + tipoUsuario);
        }
    }
}