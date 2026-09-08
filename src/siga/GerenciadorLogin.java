package siga;

public class GerenciadorLogin {

/*
A classe GerenciadorLogin, no método montarPainel, viola o princípio OCP, 
pois é necessário modificá-la ao adicionar novos tipos de usuários.
Para resolver, pode-se utilizar Simple Factory ou Factory Method,
reduzindo o acoplamento e facilitando extensões.
*/
    // Instanciando a fábrica painel
    private final FabricaPainel fabrica = new FabricaPainel();

    public Painel montarPainel(String tipoUsuario) {
        // Painel painel;

        // // Violação do OCP: um novo perfil = mais um ramo condicional aqui.
        // if (tipoUsuario.equals("ALUNO")) {
        //     painel = new PainelAluno();
        // } else if (tipoUsuario.equals("PROFESSOR")) {
        //     painel = new PainelProfessor();
        // } else if (tipoUsuario.equals("COORDENADOR")) {
        //     painel = new PainelCoordenador();
        // } else {
        //     throw new IllegalArgumentException("Perfil desconhecido: " + tipoUsuario);
        // }

        // Utilização do método criar da fábrica para reconhecer o tipo do usuário e retornar
        // a classe referente a ele
        Painel painel = fabrica.criar(tipoUsuario);  // delega a criação
        painel.montar(); // Utilizando método montar da interface painel
        return painel;
    }

}
