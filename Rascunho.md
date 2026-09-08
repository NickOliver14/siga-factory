Siga as etapas da ficha de atividade prática:

1. **Identificar** o acoplamento causado pelo `if/else` com `new` em `GerenciadorLogin`.
2. **Simple Factory:** criar uma classe `FabricaPainel` com um método `criar(String tipo)` que centralize a criação e devolva um `Painel`. O `GerenciadorLogin` passa a pedir o painel à fábrica, sem usar `new` das classes concretas.
3. **Factory Method:** refatorar para um criador abstrato (por exemplo, `CriadorPainel`) com um método `criarPainel()`, e uma subclasse por perfil (`CriadorPainelAluno`, `CriadorPainelProfessor`, `CriadorPainelCoordenador`) que sobrescreve esse método. A escolha do painel passa a ser resolvida por polimorfismo.
4. **Adicionar** um novo perfil (por exemplo, `SECRETARIA`, com um `PainelSecretaria`) **sem modificar** o código existente — criando apenas as novas classes. Isso comprova o respeito ao OCP.
5. **Desenhar** o diagrama de classes da solução final (interface do produto, produtos concretos, criador e criadores concretos).