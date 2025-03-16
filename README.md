# Desafio PROGRAMAÇÃO - Sistema de Cadastros 🚀

### Desafio criado por Lucas Carrilho - [@devmagro](https://twitter.com/devmagro)

- **Twitter:** [@devmagro](https://twitter.com/devmagro) 🐦
- **Instagram:** [@devmagro](https://www.instagram.com/devmagro) 📸
- **YouTube:** [@devmagro](https://www.youtube.com/c/devmagro) 🎥

---

## 📄 Introdução

Você chegou ao primeiro grande desafio do guia! 😎 Agora é hora de colocar a mão na massa e aplicar seus conhecimentos na prática, criando um **Sistema de Adoção para Pets**!

Leia **TODO** o desafio com **ATENÇÃO** antes de começar a implementação e respeite as regras. Evite o uso do GPT ao máximo e use-o com sabedoria quando necessário!

---

## 🎮 Objetivo

Você será desafiado a criar um sistema de cadastro via **CLI (interface de linha de comando)** para permitir que futuros adotantes possam escolher seu animalzinho.

O dono do abrigo de animais (usuário do sistema) será capaz de:

- Cadastrar um novo pet
- Buscar dados de um pet cadastrado
- Alterar os dados de um pet
- Deletar um pet cadastrado
- Listar todos os animais cadastrados
- Listar pets por classificação (idade, nome, raça)
- E muito mais!

A implementação deve utilizar conceitos de **Orientação a Objetos** e outras boas práticas de programação. 🚀

---

## 🌟 Conhecimentos aplicados
- Orientação a Objetos (OO)
- Manipulação de arquivos e arrays
- Java IO
- Exceções
- Boas práticas de código
- Sistemas de arquivos

---

## 📝 Requisitos do Desafio

O desafio será organizado em **passos**, onde você irá desenvolver novas funcionalidades para nossa aplicação CLI.

Você tem liberdade para criar e organizar entidades, serviços, utilitários e estruturar o projeto da forma que desejar!

### 📜 Passo 1 - Leitura do arquivo de base

Crie um arquivo chamado **`formulario.txt`**, contendo as seguintes perguntas:

```
1 - Qual o nome e sobrenome do animal de estimação?
2 - Qual o tipo do pet (Cachorro/Gato)?
3 - Qual o sexo do animal?
4 - Qual endereço e bairro que ele foi encontrado?
5 - Qual a idade aproximada do animal de estimação?
6 - Qual o peso aproximado do pet?
7 - Qual a raça do pet?
```

Sua aplicação deve **ler** esse arquivo e exibir as perguntas no terminal. **Não é permitido exibir as perguntas diretamente no código!**

---

### 🗂 Passo 2 - Criação do menu inicial

Após exibir o **formulario.txt**, crie um menu inicial com as seguintes opções:

1. Cadastrar um novo pet
2. Alterar os dados do pet cadastrado
3. Deletar um pet cadastrado
4. Listar todos os animais de estimação cadastrados
5. Listar pets por classificação (idade, nome, raça)
6. Sair

Regras:
- O usuário **não pode** digitar 0 ou números negativos.
- Se o usuário digitar um número inválido, o menu deve ser exibido novamente.
- O menu deve aceitar **apenas números** (sem letras ou caracteres especiais).

---

### 🐾 Passo 3 - Cadastro de novos Pets

Ao selecionar a opção **1**, o usuário deverá cadastrar um novo pet respondendo as perguntas do **formulario.txt**. As respostas serão armazenadas em um objeto do tipo **`Pet`**.

Regras:
- Nome e sobrenome são obrigatórios (lançar exceção se não preenchidos).
- Nome e raça não podem conter números ou caracteres especiais.
- Tipo e sexo devem ser representados usando **Enum**.
- Endereço deve conter: **rua, número e cidade**.
- Idade e peso devem ser **números**.
- O peso deve estar entre **0,5kg e 60kg** (caso contrário, lançar exceção).
- Idade deve estar entre **0 e 20 anos**.
- Se a idade for menor que **1 ano**, converter para **0,x anos**.
- Se o usuário deixar qualquer campo vazio, preencher com **"NÃO INFORMADO"** (constante).

---

### 📂 Passo 4 - Armazenamento em Arquivo

Cada pet cadastrado será salvo em um arquivo `.txt` dentro da pasta **`petsCadastrados`**.

Formato do nome do arquivo:
```
YYYYMMDDTHHmm-NOME+SOBRENOME.TXT
```

Exemplo de arquivo salvo:
```
1 - Florzinha da Silva
2 - Gato
3 - Femea
4 - Rua 2, 456, Seilandia
5 - 6 anos
6 - 5kg
7 - Siames
```

---

### 🔍 Passo 5 - Buscar os dados do Pet Cadastrado

O usuário poderá buscar um pet pelos seguintes critérios:
- Nome ou sobrenome
- Sexo
- Idade
- Peso
- Raça
- Endereço

O sistema deve permitir **combinação de até 2 critérios**.

Regras avançadas (não obrigatórias):
- Buscar por mês/ano de cadastro.
- Exibir resultados com **termos pesquisados em negrito**.

---

### 🔄 Passo 6 a 8 - Alterar, Deletar e Sair

O sistema permitirá alteração e exclusão de pets cadastrados, seguindo os critérios especificados anteriormente.

---

## 🔗 Conclusão

Parabéns por chegar até aqui! 🎉 Agora, implemente o desafio, documente suas funcionalidades e compartilhe seu progresso!

🌟 **Deixe seu STAR no repositório e compartilhe!**

