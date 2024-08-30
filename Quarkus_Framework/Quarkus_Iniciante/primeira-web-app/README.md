
---

# Quarkus Framework - Projeto Inicial

Bem-vindo ao repositório do projeto inicial com o Framework Quarkus! Este projeto é uma introdução prática ao Quarkus, criado com base na aula ministrada por Márcio Silva no YouTube.

## 📚 Objetivo

Este repositório tem como objetivo demonstrar a configuração básica e o funcionamento do Quarkus em um ambiente de desenvolvimento, utilizando o IntelliJ IDEA e o Maven. Aqui, você encontrará instruções para configurar o projeto, executar o ambiente de desenvolvimento e testar a aplicação.

## 🚀 Começando

Para começar a usar o Quarkus, siga os passos abaixo:

### 1. Criação do Projeto

1. Acesse o [Code.quarkus.io](https://code.quarkus.io/).
2. Configure seu projeto conforme necessário, sem adicionar dependências inicialmente.
3. Clique em **Generate** para baixar o projeto inicial.

### 2. Configuração do Ambiente de Desenvolvimento

1. **Abra o projeto** no IntelliJ IDEA.
2. **Configuração do Maven:**
   - Vá para **Run/Debug Configurations** no IntelliJ IDEA.
   - Selecione **Maven** e configure a execução com o comando `quarkus:dev`.
   - Clique em **Apply** e depois em **OK**.

### 3. Execução do Projeto

1. **Inicie o Quarkus**:
   - No IntelliJ IDEA, selecione a configuração que você criou e clique em **Run**.
2. **Verifique a execução**:
   - Abra seu navegador e acesse `http://localhost:8080`.
   - Você deve ver uma mensagem de "ok" indicando que o projeto Quarkus está funcionando corretamente.

### 4. Testando a Aplicação

1. **Acesse o endpoint `hello`**:
   - Navegue até `http://localhost:8080/hello` em seu navegador.
   - Você verá a resposta padrão do endpoint `hello`, indicando que sua primeira aplicação Quarkus está funcionando!

## 🔧 Tecnologias Utilizadas

- **Quarkus**: Framework Java para Kubernetes e ambientes nativos na nuvem.
- **IntelliJ IDEA**: IDE para desenvolvimento Java.
- **Maven**: Ferramenta de automação de construção e gerenciamento de dependências.

## 📺 Recursos Adicionais

- [Aula01 de Márcio Silva sobre Quarkus no YouTube](https://youtu.be/jAsbKysJMLU?si=eBVAkru3aCA8v6xn)
- [Documentação Oficial do Quarkus](https://quarkus.io/guides/)

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---
