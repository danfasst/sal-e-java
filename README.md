# Projeto sal-e-java
Projeto de gerenciamento de um restaurante em linguagem Java, mostrando o estoque, pedidos feitos no restaurante, pratos pedidos e reserva feitas.

### CLASSES E FUNCIONALIDADES
Pasta Entidade - Temos a Interface Dados para a utilização do método ExibirDados provenientes da classe abstrata Entidade;

Pasta Estoque - Possui a classe abstrata EscritaEstoque para a gravação de dados em arquivo de texto. Possui também a classe abstrata GerenciadorEstoque para a manutenção da lista de Ingredientes e classe Ingrediente;

Pasta Pedidos - Possui a classe abstrata GerenciadorPedidos permitindo o funcionamento dos pedidos pendentes e concluídos, juntamente com a classe Pedido;

Pasta Pratos - Possui a classe abstrata GerenciadorPratos para exibir a lista de pratos cadastrados e a classe Prato;

Pasta Reserva - Possui a classe abstrata GerenciadorReservas para o CRUD de Reserva do restaurante e a classe Reserva;

O programa possui uma identificação e autenticação do usuário para permitir a visualização e alteração do Estoque através da classe Autenticacao. Temos a Classe Console é para a entrada de dados do programa e a classe Sistema para a proteção de dados e junção das funcionalidades do projeto. 

### EXECUÇÃO
Com o programa iniciado, a tela exibirá os caminhos e funcionalidades através de números no teclado, para cada escolha apresentada, insira um número correspondente.

### AUXÍLIO GPT
A equipe procurou a inteligência artifial afim de saber quais caminhos e lógicas de programação podiam ser aplicadas dentro do programa, como por exemplo, quais classes seriam herdadas e quais métodos deveriam ser sobrescritos.

### RECURSOS UTILIZADOS
Nossa equipe utilizou o Trello para identificação e execução de tarefas propostas, e o Google Docs para visualização de funcionalidades que cada classe utilizaria.

