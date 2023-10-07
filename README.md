README - Api_ViaCep_Java
Descrição

Este é um projeto de exemplo de uma API REST em Java que utiliza o padrão de projeto Design Patterns, o framework Spring Boot, o banco de dados H2, o JPA (Java Persistence API), o Swagger para documentação e boas práticas de desenvolvimento.

A API permite a busca de informações sobre endereços a partir de um CEP (Código de Endereçamento Postal) usando a API pública ViaCep (https://viacep.com.br/). O projeto demonstra como criar uma API RESTful robusta e documentada, seguindo as melhores práticas de desenvolvimento.
Tecnologias Utilizadas

    Java
    Spring Boot
    H2 Database
    JPA (Java Persistence API)
    Swagger
    Padrões de Projeto (Design Patterns)

Funcionalidades

A API possui as seguintes funcionalidades:

    Buscar informações de um endereço a partir de um CEP.
    Listar todos os endereços armazenados no banco de dados H2.
    Adicionar um novo endereço ao banco de dados.
    Atualizar as informações de um endereço existente.
    Excluir um endereço do banco de dados.

Padrões de Projeto Utilizados

Neste projeto, foram aplicados os seguintes padrões de projeto:

    Singleton: Usado para criar uma única instância do serviço responsável por acessar a API ViaCep.
    Repository: Implementação do padrão de repositório para acesso aos dados no banco de dados H2.
    DTO (Data Transfer Object): Utilizado para transferir dados entre a API e o cliente de forma mais eficiente e estruturada.
    Strategy: Utilizado para selecionar a estratégia correta de busca de endereço com base na origem dos dados (API ViaCep ou banco de dados).

Como Executar o Projeto

Para executar o projeto em sua máquina local, siga os seguintes passos:

    Clone o repositório: git clone https://github.com/seu-usuario/Api_ViaCep_Java.git
    Navegue até o diretório do projeto: cd Api_ViaCep_Java
    Execute o projeto usando sua IDE favorita ou o Maven: mvn spring-boot:run
    Acesse a documentação da API Swagger em http://localhost:8080/swagger-ui.html

Certifique-se de que você tenha o Java e o Maven instalados em sua máquina antes de executar o projeto.
Documentação da API

A documentação da API está disponível através do Swagger. Você pode acessá-la em http://localhost:8080/swagger-ui.html após a execução do projeto.
Contribuição

Se você deseja contribuir para este projeto, sinta-se à vontade para abrir uma solicitação de pull request. Todas as contribuições são bem-vindas!
Licença

Este projeto é licenciado sob a MIT License - veja o arquivo LICENSE para detalhes.

Este README fornece uma visão geral do projeto Api_ViaCep_Java e explica como configurar e usar a API. Se você tiver alguma dúvida ou precisar de mais informações, sinta-se à vontade para entrar em contato com os mantenedores do projeto. Aproveite!
