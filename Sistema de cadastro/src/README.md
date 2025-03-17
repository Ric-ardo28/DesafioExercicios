# Sistema de Gerenciamento de Funcionários

Este é um sistema em Java que permite o gerenciamento de funcionários, utilizando programação orientada a objetos. O sistema oferece diversas funcionalidades, como cadastro, atualização, exclusão e exibição de informações de funcionários, além de cálculo de reajuste salarial. Os dados dos funcionários são armazenados em um arquivo de texto.

---

## 📂 Estrutura do Projeto

- **package `application`**
    - `Main.java`: Classe principal com o menu e lógica principal do sistema.

- **package `entities`**
    - `Funcionario.java`: Classe que representa um funcionário.
    - `Endereco.java`: Classe que encapsula os dados de endereço do funcionário.
    - `Motorista.java`: Classe que herda de `Funcionario` e adiciona atributos específicos para motoristas (como CNH).
    - `FuncionarioWriter.java`: Classe para manipulação e atualização do arquivo de texto com dados dos funcionários.

- **package `enums`**
    - `CargoFuncionario.java`: Enumeração para representar os cargos disponíveis e seus salários padrões.

---

## ✨ Funcionalidades em Detalhe

1. **Cadastro de Funcionários**
    - O sistema permite o cadastro de dois tipos de funcionários:
        - **Funcionário Comum**: Inclui nome, cargo, salário e endereço.
        - **Motorista**: Inclui todas as informações acima, além da categoria de CNH.

2. **Persistência de Dados**
    - Os dados dos funcionários são armazenados em arquivos de texto, o que permite manter as informações após o programa ser encerrado.

3. **Atualização de Funcionários**
    - Ao atualizar, o sistema edita as informações na lista de funcionários e reescreve o arquivo de texto com os novos dados.

4. **Exclusão de Funcionários**
    - Remove um funcionário com base no seu identificador único (ID).

5. **Reajuste Salarial**
    - Permite aplicar um aumento percentual ao salário de um funcionário, com atualização automática no arquivo de texto.

---

## 📋 Melhorias Futuras

- Adicionar validação mais robusta para entradas do usuário.
- Implementar uma interface gráfica para o sistema.
- Utilizar um banco de dados para persistência de dados em vez de arquivos de texto.
- Adicionar autenticação para acesso ao sistema.

---

## ⚙️ Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto.
- **Scanner**: Para entrada de dados pelo usuário.
- **Collections**: Utilização da interface `List` para armazenar funcionários.
- **Manipulação de Arquivos**: Leitura e escrita de arquivos de texto para persistência de dados.
- **Enum**: Para definir cargos de funcionários com salários pré-determinados.

---

