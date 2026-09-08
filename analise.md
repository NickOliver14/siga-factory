Etapa 1 - Foi analisado que a classe GerenciadorLogin no seu método montarPainel está violando o princípio de aberto/fechado do OCP por conta que caso for necessário a adicionar um novo de usuário é precisar modificar o método já estabelecido.

Para resolver isto pode-se fazer o uso de simple factory ou factory method para reduzir o acomplamento da classe e do método.
